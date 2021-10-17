package com.thecodecache.labs.codegen.boolexpr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import com.thecodecache.labs.codegen.boolexpr.BooleanExprParser.ParseContext;

/**
 * It uses a string template to generate the python function from the boolean
 * expression supplied as input,
 * 
 * the python function template is present at resources path
 * 
 * @author manoranjan
 */
public class GeneratePythonFunction {
	public static void main(final String[] args) {

		// Loading and Reading the function template
		final STGroup stGroup = new STGroupFile("src/main/resources/functionTemplate.stg");
		final ST stringTemplateExample = stGroup.getInstanceOf("templateExample");

		// Reads and Parses the boolean expression
		try (BufferedReader reader = new BufferedReader(
				new InputStreamReader(new FileInputStream(new File("src/main/resources/expression.txt"))))) {

			List<String> lines = reader.lines().collect(Collectors.toList());
			String functionName = "generated_function_%1$s";

			List<Map<String, String>> functions = new ArrayList<Map<String, String>>();
			Map<String, String> function;

			for (int i = 0; i < lines.size(); i++) {
				BooleanExprLexer lexer = new BooleanExprLexer(CharStreams.fromString(lines.get(i)));
				CommonTokenStream tokens = new CommonTokenStream(lexer);

				BooleanExprParser parser = new BooleanExprParser(tokens);

				// creates the parse tree (or syntax tree)
				ParseTree tree = parser.parse();
				ParseContext context = (ParseContext) tree;
				System.out.println(context.str);

				BooleanExprParserBaseListener booleanExprBaseListener = new BooleanExprParserBaseListener();

				// ANTLR4 parse tree walker, it knows how to walk a given parse tree
				ParseTreeWalker walker = new ParseTreeWalker();
				// performs the walk on the tree, takes a listener object, we can provide out
				// custom listener in case we need to process something
				walker.walk(booleanExprBaseListener, tree);

				List<String> identifiers = booleanExprBaseListener.getIdentifiersList();

				function = new HashMap<String, String>();

				function.put("function_name", String.format(functionName, i));
				function.put("expression", context.str);
				function.put("params_list", identifiers.stream().collect(Collectors.joining(", ")));

				// adds the generated python function in the list
				functions.add(function);

				booleanExprBaseListener.clearIdentifiers();
			}
			stringTemplateExample.add("functions", functions);
			System.out.println(stringTemplateExample.render());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
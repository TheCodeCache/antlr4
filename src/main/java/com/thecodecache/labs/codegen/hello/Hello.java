package com.thecodecache.labs.codegen.hello;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Trees;

/**
 * ANTLR4
 * 
 * the most basic example - Hello World!
 * 
 * @author manoranjan
 */
public class Hello {

	public static void main(String[] args) {

		// The input
		String input = "hello world!";

		// Lexer
		HelloLexer lexer = new HelloLexer(CharStreams.fromString(input));

		// Stream of token
		CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);

		// Create the parser
		HelloParser parser = new HelloParser(commonTokenStream);

		// Create the tree from the r parser rule
		ParseTree tree = parser.r();

		// Print the tree
		printNode(tree, 0, Arrays.asList(parser.getRuleNames()));

		// Or with the utility function to print the LISP-style tree
		// equivalent to `grun Hello r --tree`
		System.out.println(tree.toStringTree(parser));
	}

	/**
	 * Recursive function to print a node
	 * 
	 * @param node
	 * @param level
	 * @param ruleNames
	 */
	private static void printNode(ParseTree node, int level, List<String> ruleNames) {
		String nodeText = Trees.getNodeText(node, ruleNames);

		// Print
		StringBuilder line = new StringBuilder();
		IntStream.range(0, level).forEach(i -> line.append(" "));
		line.append("Level ").append(level).append(" - ").append(nodeText);
		System.out.println(line.toString());

		if (node instanceof ParserRuleContext) {
			ParserRuleContext parserRuleContext = (ParserRuleContext) node;
			if (parserRuleContext.children != null) {
				for (ParseTree child : parserRuleContext.children) {
					printNode(child, level + 1, ruleNames);
				}
			}
		}
	}
}

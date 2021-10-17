package com.thecodecache.labs.codegen.json;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import com.thecodecache.labs.codegen.json.JsonParser.JsonContext;

/**
 * @author manoranjan
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("begin!");

		// Doing lexical analysis from the given json input in string form
		JsonLexer lexer = new JsonLexer(CharStreams.fromString("{\n" + "  name : true}"));
		// generates the token stream
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);

		// json parser
		JsonParser parser = new JsonParser(tokenStream);
		// parses the token stream into parse tree (syntax tree)
		JsonContext ctx = parser.json(); // JsonContext is a ParseTree

		System.out.println(ctx.toStringTree(parser));
		System.out.println((ctx.getChild(0).toStringTree(parser)));

		// walks through the parse tree and logs few details
		ctx.jsonObject().stream()
				.forEach(x -> x.keyValuePair().stream().forEach(y -> System.out.println(y.primitive().getText())));

		// prints parse tree
		AstPrinter.print(ctx.getRuleContext());
		System.out.println("end!");
	}
}
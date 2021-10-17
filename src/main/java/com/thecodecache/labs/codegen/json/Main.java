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

		JsonLexer lexer = new JsonLexer(CharStreams.fromString("{\n" + "  name : true}"));
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);

		JsonParser parser = new JsonParser(tokenStream);
		JsonContext ctx = parser.json(); // JsonContext is a ParseTree

		System.out.println(ctx.toStringTree(parser));
		System.out.println((ctx.getChild(0).toStringTree(parser)));

		ctx.jsonObject().stream()
				.forEach(x -> x.keyValuePair().stream().forEach(y -> System.out.println(y.primitive().getText())));

		AstPrinter.print(ctx.getRuleContext());
		System.out.println("end!");
	}
}
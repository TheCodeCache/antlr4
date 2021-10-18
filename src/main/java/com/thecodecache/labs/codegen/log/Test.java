package com.thecodecache.labs.codegen.log;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * Log Parser Test
 * 
 * @author manoranjan
 */
public class Test {

	public static void main(String[] args) throws Exception {
		parseLogs();
	}

	/**
	 * parsing logs and reporting the same
	 * 
	 * @throws Exception
	 */
	public static void parseLogs() throws Exception {

		String logLines = "2018-May-05 14:20:21 DEBUG entering awesome method\r\n"
				+ "2018-May-05 14:20:24 ERROR Bad thing happened\r\n";

		// lexical analysis
		LogLexer lexer = new LogLexer(CharStreams.fromString(logLines));
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// creates the parse tree (syntax tree)
		LogParser parser = new LogParser(tokens);

		ParseTreeWalker walker = new ParseTreeWalker();
		CustomLogListener listener = new CustomLogListener();

		// walks through the parse tree using the custom listener
		walker.walk(listener, parser.log());

		// logs the information from the parse tree walk operation
		System.out.println(listener.getEntries().size());
		listener.getEntries().stream().forEach(entry -> {
			System.out.println(entry.getLevel());
			System.out.println(entry.getMessage());
			System.out.println(entry.getTimestamp());
		});
	}
}

package com.thecodecache.labs.codegen.java8;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * Java8 Parser Test
 * 
 * Uppercase method test and reporting
 * 
 * @author manoranjan
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("begin!");

		String javaClassContent = "package com.thecodecache.labs.codegen.java8;\r\n" + "\r\n"
				+ "public class SampleClass {\r\n" + "\r\n" + "	public void DoSomethingElse() {\r\n"
				+ "		// ...\r\n" + "	}\r\n" + "\r\n" + "	public void hiYou() {\r\n" + "		// ...\r\n" + "	}\r\n"
				+ "\r\n" + "	public void HiWorld() {\r\n" + "		// ...\r\n" + "	}\r\n" + "\r\n"
				+ "	public void helloYou() {\r\n" + "		// ...\r\n" + "	}\r\n" + "\r\n"
				+ "	public void HelloWorld() {\r\n" + "		// ...\r\n" + "	}\r\n" + "}\r\n" + "";

		// creates the lexer object and does the lexical analysis
		Java8Lexer lexer = new Java8Lexer(CharStreams.fromString(javaClassContent));

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// creates the parser object
		Java8Parser parser = new Java8Parser(tokens);
		ParseTree tree = parser.compilationUnit();

		// creates the walker object
		ParseTreeWalker walker = new ParseTreeWalker();
		UppercaseMethodListener listener = new UppercaseMethodListener();

		// walks through the parse tree using the custom listener
		walker.walk(listener, tree);

		// logs or reports the findings from the above walk operation
		System.out.println(listener.getErrors().size());
		listener.getErrors().stream().forEach(System.out::println);

		System.out.println("\nend!");
	}
}

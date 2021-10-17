package com.thecodecache.labs.codegen.calculator;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Simulates the Calculator
 * 
 * antlr4 by default generates the listeners like below:
 * 
 * -listener -no-visitor -encoding UTF-8
 * 
 * however we could disable it and create visitors using the below option:
 * 
 * -no-listener -visitor -encoding UTF-8
 * 
 * @author manoranjan
 */
public class Calculator implements ICalculator {

	// entry-point of the app
	public static void main(String[] args) {
		// reads the input arithmetic expression
		String arg = args.length > 0 ? args[0] : "5 / 2 * 4";

		Calculator calculator = new Calculator();
		Double result = calculator.calculate(arg);

		System.out.println((String.format("%s = %s", arg, result)));
	}

	/**
	 * Reads the arithmetic expression in the form of character-stream
	 */
	@Override
	public Double calculate(String arithmeticExpression) {
		CodePointCharStream input = CharStreams.fromString(arithmeticExpression);
		return compile(input);
	}

	/**
	 * Performs lexical analysis and creates the parse tree (syntax tree), allows
	 * visitor object to explicitly invoke the nodes of the parse tree
	 * 
	 * @param input
	 * @return
	 */
	private Double compile(CharStream input) {
		CalculatorParser parser = new CalculatorParser(new CommonTokenStream(new CalculatorLexer(input)));
		ParseTree tree = parser.start();

		CalculatorVisitorImpl calculatorVisitor = new CalculatorVisitorImpl();
		return calculatorVisitor.visit(tree);
	}
}
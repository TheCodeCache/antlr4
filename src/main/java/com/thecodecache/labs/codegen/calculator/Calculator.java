package com.thecodecache.labs.codegen.calculator;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Drive calculator with demo input.
 * 
 * @author manoranjan
 */
public class Calculator implements ICalculator {

	public static void main(String[] args) {
		String arg = args.length > 0 ? args[0] : "5 / 2 * 4";

		Calculator calculator = new Calculator();
		Double result = calculator.calculate(arg);

		System.out.println((String.format("%s = %s", arg, result)));
	}

	@Override
	public Double calculate(String arithmeticExpression) {
		CodePointCharStream input = CharStreams.fromString(arithmeticExpression);
		return compile(input);
	}

	private Double compile(CharStream input) {
		CalculatorParser parser = new CalculatorParser(new CommonTokenStream(new CalculatorLexer(input)));
		ParseTree tree = parser.start();

		CalculatorVisitorImpl calculatorVisitor = new CalculatorVisitorImpl();
		return calculatorVisitor.visit(tree);
	}
}
package com.thecodecache.labs.codegen.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test Case for Calculator
 * 
 * @author manoranjan
 */
public class CalculatorTest {

	@Test
	public void testCalculate() {
		Calculator app = new Calculator();

		// asserts
		assertEquals("20.0", String.valueOf(app.calculate("-2+2*10+2")));
		assertEquals("-12.0", String.valueOf(app.calculate("2+4+-4+-2*10%9*7")));
		assertEquals("-0.5", String.valueOf(app.calculate("1/-2")));
		assertEquals("6.0", String.valueOf(app.calculate("4-1+2+1")));
		assertEquals("1.0", String.valueOf(app.calculate("(5-4)*(12-11)/((((5-4)*(12-11))))")));
		assertEquals("1.0", String.valueOf(app.calculate("11%(2*5)")));
		assertEquals("0.0", String.valueOf(app.calculate("1000-500*2")));
		assertEquals("-100.0", String.valueOf(app.calculate("((((((-99))))))-1")));
		assertEquals("-5.0", String.valueOf(app.calculate("1 + 2 *	-3")));
	}
}

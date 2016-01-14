package org.sample.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addOneAndOneEqualsTwo() {
		Calculator calculator = new Calculator();
		assertTrue(calculator.add(1, 1) == 2);
	}

	@Test
	public void subOneAndOneEqualsZero() {
		Calculator calculator = new Calculator();
		assertTrue(calculator.sub(1, 1) == 0);
	}

}

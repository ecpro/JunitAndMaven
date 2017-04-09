package com.piyush.JunitAndMaven;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	private CalculatorImpl calculator;

	@Before
	public void setUp() throws Exception {
		calculator = new CalculatorImpl();
	}

	@Test
	public void addShouldReturnAResult() {
		
		assertEquals(4, calculator.add(2, 2));
	}

}

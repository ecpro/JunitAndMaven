package com.piyush.JunitAndMaven;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatorTest {
	
	private int input1;
	private int input2;
	private int expectedResult;
	
	public CalculatorTest(int x , int y, int result) {
		this.input1 = x;
		this.input2 = y;
		this.expectedResult = result;
	}
	
	// for parameterized Junit test the method which returns data should be marked as static
	@Parameters
	public  static Collection<Integer[]> data() {
		return Arrays.asList(new Integer[][] {{1,2,3}, {2,3,5}});
	}
	
	private CalculatorImpl calculator;

	@Before
	public void setUp() throws Exception {
		calculator = new CalculatorImpl();
	}

	@Test
	public void addShouldReturnAResult() {
		
		int result = calculator.add(input1, input2);
		assertEquals(result, expectedResult);
	}

}

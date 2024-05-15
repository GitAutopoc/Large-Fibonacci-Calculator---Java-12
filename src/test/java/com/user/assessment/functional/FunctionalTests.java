package com.user.assessment.functional;

import static com.task.assessment.testutils.TestUtils.businessTestFile;
import static com.task.assessment.testutils.TestUtils.currentTest;
import static com.task.assessment.testutils.TestUtils.yakshaAssert;

import java.io.IOException;
import java.math.BigInteger;

import org.junit.jupiter.api.Test;

import com.fibonacci.assessment.LargeFibonacciCalculator;

public class FunctionalTests {

	private final LargeFibonacciCalculator calculator = new LargeFibonacciCalculator();

	@Test
	public void testCalculateFibonacci_ValidInput() throws IOException {
//		assertEquals(BigInteger.valueOf(55), calculator.calculateFibonacci(10), "Fibonacci(10) should be 55");
		yakshaAssert(currentTest(),
				new BigInteger("354224848179261915075").equals(calculator.calculateFibonacci(100)) ? "true" : "false",
				businessTestFile);

	}

//	@Test
//	public void testCalculateFibonacci_ZeroInput() {
//		assertEquals(BigInteger.ZERO, calculator.calculateFibonacci(0), "Fibonacci(0) should be 0");
//		yakshaAssert(currentTest(), expectedOutput.equals(report) ? "true" : "false", businessTestFile);
//
//	}
//
//	@Test
//	public void testCalculateFibonacci_NegativeInput() {
//		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
//			calculator.calculateFibonacci(-1);
//		});
//		assertEquals("Input must be a non-negative integer.", exception.getMessage(),
//				"Negative input should throw IllegalArgumentException with a specific message");
//		yakshaAssert(currentTest(), expectedOutput.equals(report) ? "true" : "false", businessTestFile);
//
//	}

}

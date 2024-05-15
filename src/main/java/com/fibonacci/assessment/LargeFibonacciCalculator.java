package com.fibonacci.assessment;

import java.math.BigInteger;

public class LargeFibonacciCalculator {

	/**
	 * Calculates the nth Fibonacci number using an iterative approach with
	 * BigInteger.
	 * 
	 * @param n The position in the Fibonacci sequence.
	 * @return The nth Fibonacci number.
	 * @throws IllegalArgumentException If the input is negative.
	 */
	public BigInteger calculateFibonacci(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Input must be a non-negative integer.");
		}

		if (n == 0)
			return BigInteger.ZERO;
		if (n == 1)
			return BigInteger.ONE;

		BigInteger a = BigInteger.ZERO;
		BigInteger b = BigInteger.ONE;
		BigInteger c = BigInteger.ONE;

		for (int i = 2; i <= n; i++) {
			c = a.add(b);
			a = b;
			b = c;
		}

		return c;
	}

	public static void main(String[] args) {
		LargeFibonacciCalculator calculator = new LargeFibonacciCalculator();

		try {
			System.out.println("Fibonacci(10): " + calculator.calculateFibonacci(10)); // Expected output: 55
			System.out.println("Fibonacci(100): " + calculator.calculateFibonacci(100)); // Outputs the 100th Fibonacci
																							// number
			System.out.println("Fibonacci(1000): " + calculator.calculateFibonacci(1000)); // Outputs the 1000th
																							// Fibonacci number
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println("Fibonacci(-1): " + calculator.calculateFibonacci(-1));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage()); // Expected output: IllegalArgumentException message
		}
	}
}

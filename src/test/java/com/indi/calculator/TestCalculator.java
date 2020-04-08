package com.indi.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCalculator {

	private Calculator calculator;
	
	@BeforeEach
	public void setup() {
		calculator = new Calculator();
	}
	
	@Test
	void addingTwoPositiveNumbers() {
		assertEquals(4, calculator.add(1, 3));
	}
	
	@Test
	void addingTwoNegativeNumbers() {
		assertEquals(-4, calculator.add(-1, -3));
	}
	
	@Test
	void substractingTwoPositiveNumbers() {
		assertEquals(10,calculator.sub(12, 2));
	}
	
	@Test
	void substractingTwoNegativeNumbers() {
		assertEquals(2,calculator.sub(-1, -3));
	}
	
	@Test
	void multiplyTwoPositiveNumbers() {
		assertEquals(10, calculator.mul(2, 5));
	}
	
	@Test
	void multiplyTwoNegativeNumbers() {
		assertEquals(10, calculator.mul(-2, -5));
	}
	
	@Test
	void divideTwoPositiveNumbers() {
		assertEquals(2.0, calculator.div(10, 5));
	}
	
	@Test
	void divideTwoNegtiveNumbers() {
		assertEquals(2.0, calculator.div(-10, -5));	
	}
	
	@Test
	void divideByZero() {
		assertThrows(ArithmeticException.class, () -> calculator.div(1, 0));
	}

}

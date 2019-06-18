package com.testyantra.calculator.basic;

public class BasicCalculator {
	
	public int add(int x, int y) {
		return x + y;
	}
	
	public int subtract(int x, int y) {
		return x - y;
	}
	
	public int multiply(int x, int y) {
		return x * y;
	}
	
	public float divide(int x, int y) {
		return (y == 0) ? x / y : 0;
	}

}// End of class: BasicCalculator

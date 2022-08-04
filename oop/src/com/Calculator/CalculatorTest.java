package com.Calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator ti84 = new Calculator();
		ti84.performOperation(11.0);
		ti84.setOperation("*");
		ti84.performOperation(3);
		ti84.setOperation("+");
		ti84.performOperation(4);
		ti84.getResults();
		
//		ti84.setOperation("+");
//		ti84.getResults();
		

	}

}

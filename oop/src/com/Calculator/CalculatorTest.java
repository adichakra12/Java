package com.Calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator ti84 = new Calculator();
		ti84.setOperandOne(10.5);
		ti84.setOperandTwo(5.2);
		ti84.setOperation("+");
		ti84.performOperation();
		ti84.getResults();
		

	}

}

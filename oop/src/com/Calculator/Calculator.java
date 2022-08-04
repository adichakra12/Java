package com.Calculator;

public class Calculator implements java.io.Serializable{
	
	private double operandOne = 0.0;
	private double operandTwo = 0.0;
	private String operation = "";
	private double result = 0.0;

	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	public double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}

	public double getOperandTwo() {
		return operandTwo;
	}

	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		if(operation.equals("+") || operation.equals("-")) this.operation = operation;
		else System.out.println("Please select a valid operation!");
	}

	public double getResults() {
		System.out.println("The result is: " + this.result);
		return this.result;
	}
	
	public void performOperation() {
		if(getOperation() == "+") {
			this.result = getOperandOne()+getOperandTwo();
		} else if(getOperation() == "-") {
			this.result = getOperandOne()-getOperandTwo();
		} else {
			System.out.println("Please select a valid operation!");
		}
	}

	
	

}

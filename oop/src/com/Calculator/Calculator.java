package com.Calculator;

public class Calculator implements java.io.Serializable{
	
	private String operation = "";
	private double result = 0.0;

	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		if(operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")) this.operation = operation;
		else System.out.println("Please select a valid operation!");
	}

	public double getResults() {
		System.out.println("The result is: " + this.result);
		return this.result;
	}
	
	public void performOperation(double operand) {
		if(getOperation().equals("+")) {
			this.result = result + operand;
		} else if(getOperation().equals("-")) {
			this.result = result - operand;
		} else if(getOperation().equals("*")){
			this.result = result * operand;
		} else if(getOperation().equals("/")){
			this.result = result / operand;
		} else {
			this.result = operand;
		}
	}

	
	

}

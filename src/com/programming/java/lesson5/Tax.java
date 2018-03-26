package com.programming.java.lesson5;

public class Tax {
	
	public double grossIncome;
	public String state;
	public int dependents = 2;
	
	public Tax(double gi, String st, int dep) {
		grossIncome = gi;
		state = st;
		dependents = dep;
	}
	
	public double calcTax() {
		
		if (grossIncome <= 50000) {
			return grossIncome*6/100;
		}
		else {
			return grossIncome*8/100;
		}
		
	}
	
}

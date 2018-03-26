package com.programming.java.lesson4;

public class TestTax {

	public static void main(String[] args) {

		Tax.customerCounter = 2;
		Tax t = new Tax(24569,"NY",3);
		double mojTax = t.calcTax();
		System.out.println("Moj tax v NY je: " + mojTax);

		Tax t1 = new Tax(80000,"NJ",2);
		double mojTax1 = t1.calcTax();
		System.out.println("Moj druhy tax v NJ je: " + mojTax1);
	}

}

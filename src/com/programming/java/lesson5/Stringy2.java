package com.programming.java.lesson5;

public class Stringy2 {

	public static void main(String[] args) {

		String dievca1 = new String("Zdenka");
		String dievca2 = new String("Zdenka");
		
		System.out.println("Meno mojho diovcata je " + dievca1);
		
		if (dievca1.contentEquals(dievca2) == dievca2.contains(dievca1)) {
			System.out.println("Pravda");
		}
		else {
			System.out.println("Nepravda");
		}
	}

}

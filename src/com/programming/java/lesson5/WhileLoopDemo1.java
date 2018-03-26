package com.programming.java.lesson5;

public class WhileLoopDemo1 {

	public static void main(String[] args) {

		String[] friends = new String[20];
		friends[0] = "Sandra";
		friends[1] = "Elena";
		friends[2] = "Tana";
		friends[18] = "Ivana";
		friends[19] = "Anicka";
		
		int totalElements = friends.length;
		// pre for
		// int i;
		// pre while
		int i = 0;
		
		/*
		for (i = 0; i < totalElements; i++) {
			System.out.println("I love " + friends[i]);
		}
		*/
		/*
		for (String laska : friends) {
			System.out.println("Lubim ta " + laska);
		}
		*/
		
		while (i < totalElements) {
			if (friends[i] == null) {
				//System.out.println("The element " + (i+1) + " is null.");
				//break;
				i++;
				continue;
			}
			System.out.println("Milujem ta " + friends[i]);
			i++;
		}
	}

}

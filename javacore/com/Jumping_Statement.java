package com.javacore.com;

public class Jumping_Statement {

	public static void main(String[] args) {
		
		for (int i = 18; i<=27; i++) {
			if (i==23) {		
				// IF STATEMENT =it will check only the condition not iteration
				System.out.println(i);
				break;
			}
			else { //IF condition fails else can be used
				System.out.println(i);
			}
		}
		System.out.println();
		for (int i = 100; i >=89; i--) {
			if (i==91) {
				
				continue;
			}
			else {
				System.out.println(i);
			}
			}
		
		
	}
	
}

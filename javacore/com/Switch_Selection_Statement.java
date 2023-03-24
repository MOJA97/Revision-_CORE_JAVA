package com.javacore.com;

public class Switch_Selection_Statement {

	public static void main(String[] args) {
		int j = 11;
		switch (j) {
		case 11:
			System.out.println("Given Number is 11");
			break;
		case 12:
			System.out.println("Given Number is 12");
			break;
		default:
			System.out.println("Number is invalid");
			break;
			
		}
		System.out.println();
		
		int k = 4;
		switch (k) {
		case 2:
			System.out.println("Register number is 2");
			break;
		case 4:
			System.out.println("Register number is 4");
			break;
		default:
			System.out.println("Register number is not given");
			break;
		}
		
	}


}

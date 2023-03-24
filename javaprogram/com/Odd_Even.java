package com.javaprogram.com;

import java.util.Scanner;

public class Odd_Even {
	
	public static void main(String[] args) {
		
		Scanner value = new Scanner(System.in);
		
		System.out.println("GIven number");
		
		int numbers = value.nextInt();
		
		if (numbers%2==0) {
			
			System.out.println("The given number is even");
			
		}
		else {
			System.out.println("The given number is odd");
		}
	}

}

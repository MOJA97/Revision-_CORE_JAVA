package com.javanestedloop.com;

import java.util.Iterator;

public class Nested_Loop {

	public static void main(String[] args) {

		
		for (int i = 1; i <= 7; i++) {

			for (int j = 6; j >= i; j--) {
				System.out.print("* ");

			}
			System.out.println();

		}
		
		for (int i = 8; i >=1; i--) {
			
			for (int j = 1; j <=i; j++) {
				System.out.print("J ");
				
			}
			System.out.println();
			
		}
		
		
			
		}

	

}

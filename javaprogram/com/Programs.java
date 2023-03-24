package com.javaprogram.com;

public class Programs {

	public static void main(String[] args) {

		String name = "Jon Snow";

		String reverse = "";

		

		
		for (int i = name.length() - 1; i >= 0; i--) { // reverse

			char value1 = name.charAt(i);

			reverse = reverse + value1;
			
			System.out.print(value1);

		}
		
		for (int i = name.length()-1; i >=0; i--) {
			
			char value2 = name.charAt(i);
			
			reverse = reverse+value2;
			
			System.out.println(value2);
			
		}
		
		System.out.println();
		
		
			
			String upperCase = name.toUpperCase();
			
			System.out.println("uppercase:"+upperCase);
			
		

		}

}

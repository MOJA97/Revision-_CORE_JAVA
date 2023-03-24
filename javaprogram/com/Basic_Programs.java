package com.javaprogram.com;

import java.util.Iterator;

public class Basic_Programs {
	
	public static void main(String[] args) {
		
		fibanocci();
		System.out.println("********************************************************************");
		factorial();
		System.out.println("********************************************************************");
		palindrome();
		}
		public static void fibanocci() {

			int a = 0, b = 1, c;
			System.out.println(a);
			System.out.println(b);
			for (int i = 1; i <= 10; i++) {
				
				c = a + b;
				System.out.println(c);
				
				a = b;
				b = c;
		}
		}
		public static void factorial() {

			// 9!
			
			int n = 9, factorial = 1;
			for (int i = 1; i <= n; i++) {
				//storing the data by the name fact
				
				factorial = factorial * i;
				System.out.println(factorial);
			}
		}
		public static void palindrome() {
			//its like reverse strings but with the numbers
			String s = "racecar";
			
			String s1 = ""; //for storage
			
			String S = "Roar";
			String S1 = "";
			
			for (int i = s.length()-1; i>=0; i--) {
				
				s1 = s1 + s.charAt(i);
				
			}
			for (int i = S.length()-1; i >= 0; i--) {
				
				S1 = S1 + S.charAt(i);
				
			}
			System.out.println("given palindrome name:"+s1);
			System.out.println("another palindrome name:" + S1);
			
			if (s.equals(s1)) {
				System.out.println(s1 + " is Palindrome");
				
			}
			else {
				System.out.println(s1 + " is not palindrome");
			}
			
			if (S.equals(S1)) {
				
				System.out.println(S1 + "is Palindrome");
				
			}else {
				System.out.println(S1 + "is not palindrome");
			}
			
		}
		
	
		
		
		
		
	

}

package com.Operators.com;
// operators are specific symbols that perform specific operation
// there are four types of operators
// 1) Arithmetic 2) Logical 3) Comaprison 4) String

public class Arithmetic_Operators {
	// Arithmetic operators are used in mathematical expression in the same way like used in algebra
	// its a special operator used to combine an arithmetic operation with an assignment
	
	// Types of arithmetic operators
	// addition (+) Subraction(-) Multiplication(*) division(/)
	// in division it will returns the quotient value
	// modules (%) = it will return reminder value
	//increment (++) and Decrement(--)
	
	
	public static void main(String[] args) {
		
		
		int a = 107;
		 a+= 100;
		
		int b = 19;
		
		int c = a + b;
		System.out.println(c);
		int c1 = a*b;
		System.out.println(c1);
		
		int c2 = a/b;
		System.out.println(c2);
		int c3 = a++;
		System.out.println(c3);
		
		a++; //( 107+ (1)) = 108
		// a = 108
		
		--a;
//		((1)- 108) = 107
		
		a--;
		//(107 - (1) = 106
		
		
		
		
		System.out.println(a);
		
		
	}
	
	
	
}

package com.Operators.com;

public class Logical_Operators {
	//logical operators also gives a boolean result
	// conditioning
	// operators are (&& , || , !=)
	public static void main(String[] args) {
		
	
	
	int i = 77;
	
	int j = 33;
	
	int c = 5;
	
	int d = 100;
	
	boolean e = (i>j) && (c>d); 
	//if both statement are true and console is true
	//if any one statement is false and console is false
	 System.out.println(e);
	 
	 boolean f = (i<j) || (c<d);
	 // here any one statement is true , console is true
	 
	 System.out.println(f);
	 
	 boolean g = (i>j) != (c>d);
	 			// true != false = console true
	 			// true != true = console false
	 System.out.println(g);
	
	
}
}

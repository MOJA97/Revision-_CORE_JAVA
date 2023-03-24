package com.javaconstructors.com;

public class Cons_Concepts {
	
	public Cons_Concepts() { 		//No void
		System.out.println("No parameters or arguments");
	}
	
	public Cons_Concepts(String name) { 		
		System.out.println("Candidate name:"+ name);
	}
	
	
	
	public static void main(String[] args) {
		
									// Constructor
		Cons_Concepts data = new Cons_Concepts();
		Cons_Concepts file = new Cons_Concepts("Mohammed Javed");
		
		
	}
	
	

}

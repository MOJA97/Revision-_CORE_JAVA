package com.javauserdefined.com;

public class User_Defined {
	// Creating an exception by User
	
	public static int a = 31; // = default class variable // default = package level access
	
	//public static int b = 30; // = Public static default Class variable
	
	public static void subject_Pass_Marks() throws First_exception {
											//throws = method level access
		
		if (a >=35) {
			System.out.println("Student Passed the Subject");
			
		}
		else {
			//Classname objName = new ClassName
			throw new First_exception();
			
		}
		
	}
	
	
	
	public static void main(String[] args) throws First_exception {
		//public = global level access
		//static = without object we can invoke method
		//void = no return type and overcome by using return Keyword
		//main = main method (Parameterized)
		//String = Final Class
		//[] array of = we can store multiple values
		//args = arguments = we can edit this
		 
		
		subject_Pass_Marks();
		
		
	}

}

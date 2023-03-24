package com.javastring.com;

public class Reverse_String {
	
	public static void main(String[] args) {
	 
	String dialogue = "Say my Name : Heisenberg";
	
	String reverse = "";
	
	int length = dialogue.length();
	System.out.println(length);
	
	for (int i = length-1; i>=0; i--) {
		//o to n-1 = index
		
		reverse = reverse + dialogue.charAt(i);
		
		
	}
	 System.out.println(reverse);
	 
		System.out.println("------------------------------------------------------------------------------------------");
		
		
		
		 String j = "KearB a no ereW eW";
		 
		 String a1 ="";
		 
		 String[] split = j.split("");
		  
		 
		 for (int i = split.length-1; i >=0; i--) {
			 
			 a1 = a1 + j.charAt(i);
			 
		}
		 System.out.println(a1);
		 
		
		
		
		
		
		
		
	}

}

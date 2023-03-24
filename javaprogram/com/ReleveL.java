package com.javaprogram.com;

public class ReleveL {
	
	public static void main(String[] args) {
		
		String a = "data";
		
		String b = "flow";
		
		a = a + b;
		
		b = a . substring(0, a.length() - b.length());
	//	b = data. substring(0,0);
		a = a .substring(b.length());
	//	a = a. flow
		
		System.out.println(a + b);
		
		
		
		
	}

}

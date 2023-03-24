package com.googlemeet.com;

public class Public_Library {
	public void first_Row() {
		System.out.println("First Row: HISTORY and LITERATURE");
	}

	public void second_Row() {

		System.out.println("Second Row: Technological section");
	}
	
	public void third_Row() {
		
		System.out.println("Third Row: General Section");
	}
	
	public void fourth_Row() {
		
		System.out.println("Fourth Row: Reference Section");
	}
	
		//DOWNCASTING 
	public static void main(String[] args) {
		
		//ChildClassName objName = new ParentClassName
		Public_Library data =  new  Public_Library();
		
		data.first_Row();
		
		data.second_Row();
		data.third_Row();
		data.fourth_Row();
		
		
		
	}
	

}

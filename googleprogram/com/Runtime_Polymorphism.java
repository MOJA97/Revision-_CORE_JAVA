package com.googleprogram.com;

public class Runtime_Polymorphism extends Dynamic_Binding {
		// super represent parent class
	
	public void day4_Thursday() {
		
		System.out.println("Thursday Topic : OOPS CONCEPTS and ITS TYPES");

	}
	
	public void day5_Friday() {
		System.out.println("Friday topic: Types of inheritance and polymorphism");

	}
	@Override
	public void day2_Tuesday(String task) {
	super.day2_Tuesday(task);
	System.out.println("Tuesday added topic : DATA TYPES");
	}
	
	@Override
	public void day3_Wednesday(char hour) {
	super.day3_Wednesday(hour);
	System.out.println("Class hour: 1 hour 10 minutes");
	}
	@Override
	public void day1_Monday(int duration) {
	super.day1_Monday(duration);
	System.out.println("Class Duration: 55 minutes");
	}
	
	
	public static void main(String[] args) {
		
		Runtime_Polymorphism poly = new Runtime_Polymorphism();
		
		poly.day5_Friday();
		poly.day4_Thursday();
		poly.day3_Wednesday('1');
		poly.day2_Tuesday("MOST IMPORTANT TOPIC");
		poly.day1_Monday(55);
	}
}

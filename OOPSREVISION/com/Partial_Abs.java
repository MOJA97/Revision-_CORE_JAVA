package com.OOPSREVISION.com;

public abstract class Partial_Abs  {
	
	public void monday_Task() {

		System.out.println("Monday Task: Concepts revision");
	}

	public void wednesday_Task() {

		System.out.println("Wednesday task: OOPS CONCEPT");
		
		
	}
	public abstract void friday_Task();
	
	
	public static void main(String[] args) {
		
		Partial_Abs file = new Partial_Abstractions();
		
		file.monday_Task();
		file.friday_Task();
		file.wednesday_Task();
		file.friday_Task();
	}
	
}

package com.OOPSREVISION.com;

public class Runtime_Polymorphism extends Method_Overriding {

	public void task4(boolean checking) {

		System.out.println("FINAL TASK:PROGRAMS" + checking);
	}

	@Override
	public void task2(String month) {
		super.task2(month);
		System.out.println("Second task Deadline: december 12th 2022");
	}

	@Override
	public void task3(char dailyhours) {
		System.out.println("Third Task Daily hours: 3 hours per day");
		super.task3(dailyhours);
	}

	@Override
	public void task1(int deadline) {
		System.out.println("First task deadline: Before diwali");
		super.task1(deadline);
	}

	
	public static void main(String[] args) {
		
		Runtime_Polymorphism data = new Runtime_Polymorphism();
		
		data.task1(18);
		data.task2("OCTOBER");
		data.task3('2');
		data.task4(false);
		
	}

}

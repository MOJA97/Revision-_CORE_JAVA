package com.OOPSREVISION.com;

public class Method_Overriding {
	
	public void task1(int deadline) {
		
		System.out.println("FIRST TASK MONTH: inheritance"+deadline);

	}
	
	public void task2(String month) {
		
		System.out.println("SECOND TASK: Polymorphism"+month);

	}
	 
	public void task3(char dailyhours) {

		System.out.println("THIRD TASK: ABSTRACTION"+dailyhours);
	}
	public static void main(String[] args) {
		
		Method_Overriding mail = new Method_Overriding();
		
		mail.task1(22);
		mail.task2("NOVEMBER");
		mail.task3('3');
	}

}

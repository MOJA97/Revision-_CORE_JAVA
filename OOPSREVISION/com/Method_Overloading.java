package com.OOPSREVISION.com;

public class Method_Overloading {
	
	public void student_name(String name) {

		System.out.println("STUDENT NAME:"+name);
	}
	
	public void student_Batchnumber(int Num) {

		System.out.println("BATCH NUMBER:"+Num);
	}
	
	public void student_Class(char std) {

		System.out.println("CLASS:"+std);
	}
	public void student_Totalmarks(float marks) {

		System.out.println("TOTAL MARKS:"+marks);
		
		
	}

	public static void main(String[] args) {
		
		Method_Overloading data = new Method_Overloading();
		
		data.student_name("PETER");
		data.student_Class('9');
		data.student_Batchnumber(45);
		data.student_Totalmarks(489.75f);
		
		
	}
}

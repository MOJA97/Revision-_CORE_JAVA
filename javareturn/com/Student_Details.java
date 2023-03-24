package com.javareturn.com;

public class Student_Details {
	
	
		private int student_Mark() {
			
			int mark = 98;
			
			return mark;
			
		}
		
		private void student_NAme() {

			System.out.println("STUDENT NAME: MOHAMMED JAVED");
		}

		public static void main(String[] args) {
			
			Student_Details data = new Student_Details();
			
		
			int total = data.student_Mark();
			System.out.println("Total Mark:" + total);
			
			data.student_NAme(); //this is void = no return type
			
			
		}
		
		
		
}

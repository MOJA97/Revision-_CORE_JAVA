package com.OOPSREVISION.com;

public class Class_A implements Student_A, Student_B {
	
	
	@Override
	public void tamil_marks() {

		System.out.println("Tamil: 89");
	}
	
	@Override
	public void english_marks() {
System.out.println("English:97");

}
	
	@Override
	public void maths_Marks() {

		System.out.println("Maths:100");
		
	}
	
	@Override
	public void science_Marks() {

		System.out.println("Science:98");
		
	}
	
	@Override
	public void social_Marks() {

		System.out.println("Social:100");
	}

	public static void main(String[] args) {
		
		Class_A marks = new Class_A();
		
		marks.english_marks();
		marks.tamil_marks();
		marks.maths_Marks();
		marks.science_Marks();
		marks.social_Marks();
		
		
		
		
	}
	
}

package com.VariablesJAVA.com;

public class Static_Variable { /// without object we can invoke the method //inside the class

	static int c = 5;

	private void student1_Mark() {
		String sub = "English";
		int e = 93;
		int c = e;
		System.out.println(sub);
		System.out.println(c);

	}

	private void student2_Mark() {
		String sub = "English";
		int e = 90;
		int a = e;
		System.out.println(sub);
		System.out.println(a);

	}

	public static void main(String[] args) {

		Static_Variable mark = new Static_Variable();

		mark.student1_Mark(); // java compiler prioritize the method even we initialize or not
		mark.student2_Mark();
		int x = c; // calling class in main method
		System.out.println(x);

	}

}

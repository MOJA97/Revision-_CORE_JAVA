package com.javakeyword.com;

public class Static_Sample {

	public static int age = 47;

	public static void sample_One() {

		int a = 45;
		int b = a;
		System.out.println(b);
	}

	public static void main(String[] args) {

		sample_One(); // accepted

		// Return type
		int c = age;
		System.out.println(c);

		System.out.println(age);

	}

}

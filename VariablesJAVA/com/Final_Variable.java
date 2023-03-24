package com.VariablesJAVA.com;

public class Final_Variable { // Cant change

	final String content = "SCIENTIST";
	final int s1 = 76;
	final int s2 = 84;

	private void scientist1_Age() {
		String name = "Albert Einstein";

		int b = 1879;
		int d = 1955;
		int x = b;
		int y = d;
		System.out.println(name);
		System.out.println("Birth year:" + x);
		System.out.println("Death year:" + y);

	}

	private void scientist2_Age() {
		String name = "Issac Newton";

		int b = 1643;
		int d = 1727;
		int a = b;
		int c = d;
		System.out.println(name);
		System.out.println("Birth year:" + a);
		System.out.println("Death Year:" + c);

	}

	public static void main(String[] args) {
		Final_Variable list = new Final_Variable();

		list.scientist1_Age();
		list.scientist2_Age();
		int s1a = list.s1;
		System.out.println(s1a);
		int s2a = list.s2;
		System.out.println(s2a);
		String content2 = list.content;
		System.out.println(content2);

	}
}

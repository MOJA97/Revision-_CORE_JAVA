package com.VariablesJAVA.com;

public class Class_Variable {

	int y = 25;
	private void football_Playerdetails() {

		String name = "Cristiano Ronaldo";

		int a = 37; 					//Initialization
		int b = a;  					//assigning
		System.out.println(name);
		System.out.println(b);

	}

	private void football_Playerdetails1() {

		String name = "Lionel Messi";

		int y = 35;
		int z = y;
		System.out.println(name);
		System.out.println(z);

	}

	public static void main(String[] args) {
		Class_Variable players = new Class_Variable();

		players.football_Playerdetails();
		players.football_Playerdetails1();
		int y2 = players.y; 
		//return type
		System.out.println(y2);
		

	}

}

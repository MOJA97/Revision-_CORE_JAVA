package com.VariablesJAVA.com;

public class Local_Variable {

	private void Customer_bill() {

		int price = 1740; // Initialization
		int b = price;
		String name = "Javed";

		System.out.println("Customer:" + name);
		System.out.println("Customer bill:" + b);

	}

	private void Customer_Purchased() {

		int products = 12;
		int total = products;
		System.out.println("Total number of products:"+ products);

	}

	public static void main(String[] args) {

		Local_Variable list = new Local_Variable();

		list.Customer_bill();
		list.Customer_Purchased();

	}

}

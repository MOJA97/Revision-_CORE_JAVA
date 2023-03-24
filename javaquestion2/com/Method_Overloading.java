package com.javaquestion2.com;

public class Method_Overloading {

	
	public void register_Number1(int num) {

		System.out.println("Register number:"+ num);
	}
	
	public void register_Name(String name) {
		
		System.out.println("Register Name:"+ name);
	

	}
	public void registered_Town(String s) {

		System.out.println("Register Town:"+ s);
	

	}
	
	public static void main(String[] args) {
		
		Method_Overloading data = new Method_Overloading();
		
		data.register_Name("Mohammed Javed");
		data.registered_Town("THANJAVUR");
		data.register_Number1(65);
	}
}

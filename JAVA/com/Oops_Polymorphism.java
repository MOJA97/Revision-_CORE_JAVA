package com.JAVA.com;

public class Oops_Polymorphism {

	public void cadet_Records() {
	} { // Inside bracket = arguments and parameters
		System.out.println("Cadet Records ");

	}

	public void cadet_Name(int batch) {  //
		System.out.println("cadet batch:" + batch);

	}

	public void cadet_Name(String town) {
		System.out.println("Cadet Town:" + town);
		
	}

	public void cadet_Name(String name ,char Initial, String service) {

		System.out.println("Cadet Name:" + name);
		System.out.println("Cadet initial :"+ Initial);
		System.out.println("Cadet Service name:"+ service);
	}
	

	public void cadet_Name(float salary) {

		System.out.println("Cadet salary:" + salary);
	}

	public static void main(String[] args) {
		
		Oops_Polymorphism data = new Oops_Polymorphism();
		
		data.cadet_Records();
		data.cadet_Name("Sathyamoorthy", 'S', "INDIAN POLICE SERVICE (IPS)");
		data.cadet_Name(567);
		data.cadet_Name(500000.65789f);
		data.cadet_Name("Chennai");
}
}

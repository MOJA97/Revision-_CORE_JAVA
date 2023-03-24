package com.greentech.com;

public abstract class Partial_Abstraction { 

	public void cycle_Types() {					// signature part

		System.out.println("Types: Mountain bike(MTB), Hybrid, Road bike");  //implementation part
	}

	public abstract void cycle_Purpose();    		// abstract class

	public void cycle_PriceRange() {  				// non-abstract class
		// TODO Auto-generated method stub

		System.out.println("MTB price: Starting range from rs.10000");
	}
	
	public static void main(String[] args) {
		
		Partial_Abstraction file = new Partialabstraction_Interlinked();					
		
		file.cycle_Types();
		file.cycle_Purpose();
		file.cycle_PriceRange();
		
	}

}

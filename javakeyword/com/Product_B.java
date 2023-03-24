package com.javakeyword.com;

public class Product_B extends Product_A{

	
	public int pricea = 65;
	
	private void sample() {
		
		System.out.println("Product range:"+ super.price);
		System.out.println("Product range:"+ super.price1);
		System.out.println("Prodcut range:"+ this.pricea); 
											//this = current class reference
		
	}
	
	public static void main(String[] args) {
		
		Product_B d = new Product_B();
		
		d.sample();
		
	}
		
	
}

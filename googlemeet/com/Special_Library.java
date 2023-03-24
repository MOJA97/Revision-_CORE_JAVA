package com.googlemeet.com;

public class Special_Library extends Public_Library {

	@Override
	public void second_Row() {
		super.second_Row();
		System.out.println("Additional Second row : Research Section");
	}

	public void last_Row() {

		System.out.println("Last row: Periodical Section like published journals and magazines ");

	}
	
	public static void main(String[] args) {
		
		Special_Library book = new Special_Library();
		
		book.first_Row();
		book.second_Row();
		book.third_Row();
		book.fourth_Row();
		book.last_Row();
		
		
			
			
	}

	
}

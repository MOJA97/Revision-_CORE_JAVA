package com.javatest.com;

public class My_Favourites implements Favourite_Foods {
	@Override
	public void fav_Foods1() {
		System.out.println("BRIYANI");
	}
	@Override
	public void fav_Foods2() {
		System.out.println("Shawarma");
	}
	public static void main(String[] args) {
		My_Favourites data = new My_Favourites();
		data.first_Wonder();
		data.second_Wonder();
		data.fav_Foods1();
		data.fav_Foods2();
		data.fav_Place1();
		data.fav_Place2();
		
		
	}

}

package com.javatest.com;

public interface Favourite_Foods extends Favourite_Tourist_Places {
	@Override
	default void first_Wonder() {
		Favourite_Tourist_Places.super.first_Wonder();
		System.out.println("The Pyramid");
	}
	@Override
	default void second_Wonder() {
		Favourite_Tourist_Places.super.second_Wonder();
		System.out.println("EIFFEL TOWER");
	}
	@Override
	default void fav_Place1() {

		System.out.println("PARIS");
	}
	@Override
	default void fav_Place2() {

		System.out.println("JAPAN");
	}
	void fav_Foods1();
	
	void fav_Foods2();
}

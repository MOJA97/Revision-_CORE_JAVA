package com.javatest.com;

public interface Favourite_Tourist_Places extends World_Wonders {
	void fav_Place1();
	void fav_Place2();
	@Override
	default void first_Wonder() {
		System.out.println("Liberty statue");
	}
	@Override
	default void second_Wonder() {
		System.out.println("The Pyramid");
	}
}

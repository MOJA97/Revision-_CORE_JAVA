package com.inheritance.com;

public interface Netflix {

	void movies();

	void series();

	void anime();

	public static void main(String[] args) {

		// upcasting

		Netflix list = new Hotstar();

		list.movies();
		list.anime();
		list.series();

	}

}

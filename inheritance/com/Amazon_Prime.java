package com.inheritance.com;

public interface Amazon_Prime {

	void tamil_Movies();

	void english_Movies();

	public static void main(String[] args) {

		Amazon_Prime file = new Hotstar();

		file.tamil_Movies();
		file.english_Movies();

	}
}

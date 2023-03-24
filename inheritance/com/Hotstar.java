package com.inheritance.com;

public class Hotstar implements Netflix, Amazon_Prime {

	@Override
	public void tamil_Movies() {
		System.out.println("Tamil Movie name AP: JAI BHIM");

	}

	@Override
	public void english_Movies() {
		System.out.println("English Movie Name AP : INCEPTION ");

	}

	@Override
	public void movies() {
		System.out.println("movies on netflix : Spiderman, no way home ");

	}

	@Override
	public void series() {
		System.out.println("series on netflix : Walking Dead");

	}

	@Override
	public void anime() {
		System.out.println("anime on netflix : Demon slayer, one punch man");

	}

}

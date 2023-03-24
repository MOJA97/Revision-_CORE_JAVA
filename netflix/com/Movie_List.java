package com.netflix.com;

public class Movie_List {

	public void horror_Movie() {
		// TODO Auto-generated method stub Green color

		System.out.println("Movie Name: Conjuring");
	}
	
	private void action_Movie() {
		// TODO Auto-generated method stub red color

		System.out.println("Movie Name : Fast and Furious");
	}
	
	protected void crime_Movies() {
		// TODO Auto-generated method stub yellow color
		
		System.out.println("Movie name : Zodiac");
	}
	
	void comedy_Movie() {
		// TODO Auto-generated method stub blue color

		System.out.println("Movie name : HANGOVER");
	}
	
	public static void main(String[] args) {
		
		Movie_List list = new Movie_List();
		
		list.action_Movie();
		list.comedy_Movie();
		list.horror_Movie();
		list.crime_Movies();
		
	}
}

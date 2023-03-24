package com.netflix.com;

public class Movie_Listone extends Movie_List {

	public void fav_Movie() {
		// TODO Auto-generated method stub

		System.out.println("Movie name : Batman, Dark Knight");
	}
	
	public static void main(String[] args) {
		
		Movie_Listone list2 = new Movie_Listone();
		list2.fav_Movie();
		list2.comedy_Movie();
		list2.crime_Movies();
		list2.horror_Movie();
		
		
		
		
		
		
		
	}
}

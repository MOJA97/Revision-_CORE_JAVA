package com.fullyabstraction.com;

public interface Movie_Overview {

	// It supports only abstract method ( no method body and implementation part)

	void movie_Name();

	void movie_Cast();

	void movie_Collection();

	public static void main(String[] args) {

		// upcasting

		Movie_Overview data = new Movie_Review();
		// ParentClassName objName = new ChildClassName();

		data.movie_Name();
		data.movie_Cast();
		data.movie_Collection();

	}

}

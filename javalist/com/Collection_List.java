package com.javalist.com;

import java.util.ArrayList;
import java.util.List;

public class Collection_List {

	public static void main(String[] args) {

		List<Object> m = new ArrayList<>();

		m.add(16);
		m.add(6);
		m.add(455);
		m.add(14);
		m.add(1);

		System.out.println(m);

		String string = m.toString();
		System.out.println(string);
		
		int length = string.length();
		System.out.println(length);
		
		int index = string.length()-1;
		System.out.println(index);
		
		

	}

}

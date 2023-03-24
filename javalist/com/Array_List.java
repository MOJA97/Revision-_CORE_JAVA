package com.javalist.com;

import java.util.ArrayList;
import java.util.List; 

public class Array_List {
	
	public static void main(String[] args) {
		//SYNTAX
		List<Object> j = new ArrayList<Object>();
		//before List<Object> = new ArrayList<Object>();
		//its an index based
		j.add(12);
		j.add("Mohammed Javed");
		j.add(45.63f);
		j.add(125);
		j.add(true);
		j.add('J');
		System.out.println(j);
		
		j.add(3,2);
		System.out.println(j);
		
		int size = j.size();
		System.out.println("LENGTH:"+size);
		int size1 = j.size()-1;
		System.out.println("Index:"+size1); //dynamic and resizeable
		int indexOf = j.indexOf(j);
		System.out.println("First Index:"+indexOf);
		int lastIndexOf = j.lastIndexOf(j);
		System.out.println("Last INdex:"+lastIndexOf);
		boolean contains = j.contains(j);
		System.out.println("Contains or Not:"+contains);
		Object object = j.get(5);
		System.out.println("Particular Index:"+object);
		j.get(5);
		System.out.println(j); // it will go to upcasting printout
		Object set = j.set(3, 19);
		System.out.println("replace:"+set);
		Object remove = j.remove(2);
		System.out.println("Removing index:"+ remove);
		j.clear();
		System.out.println(j);
		Object object2 = j.get(18);
		System.out.println("RUN TIME ERROR:"+object2);
		
		
	}

}

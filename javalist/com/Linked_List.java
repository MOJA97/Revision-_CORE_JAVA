package com.javalist.com;


import java.util.List;
import java.util.Vector;

public class Linked_List {
	
	public static void main(String[] args) {
		
		List<Object> j = new Vector<Object>();
		j.add(19);
		j.add("MOJA");
		j.add(22.6343f);
		j.add(878);
		j.add(false);
		j.add('M');
		System.out.println(j);
		
		j.add(4,9);
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

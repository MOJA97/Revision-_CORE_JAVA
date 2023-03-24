package com.javasets.com;

import java.util.HashSet;
import java.util.Set;

public class Hash_Set {

	public static void main(String[] args) {
		Set<Object> i = new HashSet<>();
		// heterogenous,Asynchronized,Class,random order.
		i.add(17);
		i.add('j');
		i.add(423);
		i.add(210987);
		i.add(43.54f);
		i.add(7678.345678d);
		i.add("JAVED");
		i.add(false);
		System.out.println(i);
		Set<Object> j = new HashSet<>();
		j.add(21);
		j.add('m');
		j.add(333);
		j.add(897687);
		j.add(33.89f);
		j.add(3432.8767d);
		j.add("MOHAMMED");
		j.add(true);
		System.out.println(j);
		System.out.println("****************************");
		j.addAll(i);
		System.out.println(j);
		i.addAll(j);
		System.out.println(i);
		System.out.println("****************************");
		int length = i.size();
		System.out.println("i Length:" + length);
		int index = i.size() - 1;
		System.out.println("i Index:" + index);
		System.out.println("****************************");
		boolean equals = i.equals(j);
		System.out.println("Equals or not (i==j):" + equals);
		System.out.println("***************************");
		int length1 = j.size();
		System.out.println("j Length:" + length1);
		int index1 = j.size() - 1;
		System.out.println("j Index" + index1);
		System.out.println("****************************");
		Object[] array = i.toArray();
		for (Object object : array) {
			System.out.println(object);
		}
		boolean contains = i.contains("Mohammed");
		System.out.println("i Contains or not:" + contains);

		boolean contains2 = j.contains(333);
		System.out.println("j Contains or not:" + contains2);
	

		i.retainAll(j);
		System.out.println("Retain value of i:" + i);

		j.retainAll(i);
		System.out.println("Retain value of j:" + j);
		i.remove(false);
		System.out.println(i);

		j.remove('m');
		System.out.println(j);

		i.removeAll(j);
		System.out.println(i);

		j.removeAll(i);
		System.out.println(j);

		System.out.println("*******************************");

		boolean empty = i.isEmpty();
		System.out.println("Is empty:" + empty);
		System.out.println("*****************************");

		i.clear();
		System.out.println(i);

		System.out.println("******************Hash Set END*******************************");

	}

}

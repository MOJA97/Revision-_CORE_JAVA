package com.javasets.com;
import java.util.Set;
import java.util.TreeSet;
public class Tree_Set {
	
	public static void main(String[] args) {
		Set<Object> a = new TreeSet<>();
		a.add('J');
		a.add('e');
		a.add('A');
		a.add('p');
		a.add('V');
		a.add('P');
		a.add('q');
		System.out.println(a);
		Set<Object> b = new TreeSet<>();
		b.add('S');
		b.add('L');
		b.add('e');
		b.add('q');
		b.add('D');
		b.add('B');
		System.out.println(b);
		System.out.println("********************************");
		int size = a.size();
		System.out.println("a Length:"+size);
		int size2 = a.size();
		System.out.println("a index:"+size2);
		int size3 = a.size()-1;
		System.out.println("a Index:"+size3);
		int size4 = b.size();
		System.out.println("b index:"+size4);
			System.out.println("******************************");
		boolean contains = a.contains('o');
		System.out.println("Contains or not a:"+contains);
		boolean contains2 = b.contains('D');
		System.out.println("Contains or not a:"+contains);
		System.out.println("*************************************");
		a.remove('V');
		System.out.println("Remove a:"+a);
		b.remove('B');
		System.out.println("Remove b:"+b);
		System.out.println("**************************************");
		a.removeAll(b);
		System.out.println(a);
		System.out.println("***********************************");
		boolean empty = a.isEmpty();
		System.out.println("Is empty:"+empty);
		System.out.println("***********************************");
		b.clear();
		System.out.println(b);
		
//		try {
//			System.out.println(a.add(null));
//			
//		} catch (NullPointerException e) {
//			e.printStackTrace();
//			System.out.println("NULL POINTER EXCEPTION HANDLED");
//		}
//		
		
			
			
		}
		
	}

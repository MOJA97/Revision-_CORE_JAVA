package com.javaArray.com;

import java.util.Iterator;

public class Array {


	public static void main(String[] args) {
		
		// dataType refname[]= {};
		
		int i[] = {12,35,77,88,94,94,874,240,252};
		
		int j= i.length;
		System.out.println("Length value:" + i.length);
		
		int k = i.length-1;
		System.out.println("Index value:"+ k);
		
		for (int k2 = 0; k2 < i.length; k2++) {
			 System.out.println(k2);
		}
		
		for (int m : i) {
			System.out.println(m);
			
		}
		
	}
	
}

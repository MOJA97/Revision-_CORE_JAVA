package com.JavaMap.com;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_Map {
		//Class,Key and value based,Asynchronized
		//key = allow duplicate value but overrides it and allow null values
		//Value = allows duplicate values and null values
	
	public static void main(String[] args) {
		
		Map<Integer,Object> j = new HashMap<>();
		//ADD values
		j.put(1, "Fantasy");
		j.put(9,"Javed");
		j.put(null, 7);
		j.put(7, "Ronaldo");
		j.put(null,null);
		j.put(100, "Marks");
		j.put(6, false);
		j.put(1, "Fantasy");
		//LIFO order Last in first out
		System.out.println(j);
		
		int size = j.size();
		System.out.println("Length:"+size);
		
		int size2 = j.size()-1;
		System.out.println("Index:"+size2);
		
		boolean empty = j.isEmpty();
		System.out.println("Empty or not:"+empty);
		
		
		Object object = j.get(7);
		System.out.println("Object Key:"+object);
		
		Set<Integer> keySet = j.keySet();
		System.out.println(keySet);
		
		Collection<Object> values = j.values();
		System.out.println(values);
		
		Set<Entry<Integer, Object>> entrySet = j.entrySet();
		for (Entry<Integer, Object> each : entrySet) {
			System.out.println("Each values:"+each);
			
		}
		j.clear();
		System.out.println(j);
		
	
		
		
		
	}

}

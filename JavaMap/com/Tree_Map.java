package com.JavaMap.com;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Tree_Map {
	//class,key-allows duplicate values but overrides it
	//value- allow duplicate values and allows null values
	//Asynchronized
	public static void main(String[] args) {
		
		Map<Integer, Object> k = new TreeMap<>();
		
		k.put(1, "Javed");
		k.put(77, 'D');
		k.put(12, 'v');
		k.put(16, 'm');
		k.put(13, 'W');
		k.put(7, 'h');
		k.put(99, 'N');
		k.put(1, 'H');
		k.put(17, 't');
		
		System.out.println(k);
		
		int size = k.size();
		System.out.println("length:"+size);
		int size2 = k.size()-1;
		System.out.println("Index:"+size2);
		
		boolean empty = k.isEmpty();
		System.out.println("Empty or not:"+empty);
		
		Object object = k.get(99);
		System.out.println("Specific character:"+object);
		
		Set<Integer> keySet = k.keySet();
		System.out.println("Keyset values:"+keySet);
		
		Collection<Object> values = k.values();
		System.out.println("Values:"+values);
		
		Set<Entry<Integer,Object>> entrySet = k.entrySet();
		for (Entry<Integer, Object> each : entrySet) {
			System.out.println(each);
		}
		k.clear();
		System.out.println(k);
		
	}

}

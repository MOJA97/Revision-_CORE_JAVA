package com.JavaMap.com;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHash_Map {
	//Class,key- allow duplicate value but overrides it.
	//value- allow duplicate value and null value
	//Asynchronized
	
	public static void main(String[] args) {
		Map<Integer, Object> i = new LinkedHashMap<>();
		
		i.put(1, 'J');
		i.put(4, 'E');
		i.put(3, 'v');
		i.put(12, "Mohammed");
		i.put(2, 'A');
		i.put(null, false);
		i.put(null, null);
		i.put(5, 'D');
		i.put(1, 'J');
		//insertion order
		System.out.println(i);
		
		int size = i.size();
		System.out.println("Length:"+size);
		
		int size2 = i.size()-1;
		System.out.println("Index:"+size2);
		
		boolean empty = i.isEmpty();
		System.out.println("Empty or not:"+empty);
		
		Object object = i.get('A');
		System.out.println("Specific Object:"+object);
		
		Set<Integer> keySet = i.keySet();
		System.out.println("Keyset:"+keySet);
		
		Collection<Object> values = i.values();
		System.out.println("Values:"+values);
		
		Set<Entry<Integer,Object>> entrySet = i.entrySet();
		for (Entry<Integer, Object> each : entrySet) {
			System.out.println("Each Values"+each);
		}
		i.clear();
		System.out.println(i);
		
		
		
		
		
		
		
	}
	
	

}

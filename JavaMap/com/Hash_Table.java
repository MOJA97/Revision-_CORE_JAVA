package com.JavaMap.com;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_Table {
	//Class,key-allows duplicate values but overrides it,
	//doesn't allow single null values
	//key-allow duplicate values but  doesnt allows single null values
	//Synchronized
	
	public static void main(String[] args) {
		
		Map<Integer, Object> m = new Hashtable<>();
		
		m.put(1,"Mohammed");
		m.put(7, "Numb");
		m.put(3, "I dont find love");
		m.put(9, "Haha");
		m.put(10, "why");
		m.put(17, "Really");
		m.put(9,"Haha");
		m.put(10, 'f');
		System.out.println(m);
		//Random order
		
		int size = m.size();
		System.out.println("Length:"+size);
		
		int size2 = m.size()-1;
		System.out.println("Index:"+size2);
		
		boolean empty = m.isEmpty();
		System.out.println("empty or not:"+empty);
		
		Object object = m.get(3);
		System.out.println("Specific object:"+object);
		
		Set<Integer> keySet = m.keySet();
		System.out.println("Keysets:"+keySet);
		
		Collection<Object> values = m.values();
		System.out.println(values);
		
		Set<Entry<Integer,Object>> entrySet = m.entrySet();
		for (Entry<Integer, Object> each : entrySet) {
			System.out.println(each);
		}

		m.clear();
		System.out.println(m);
		
		
		
		
		
	}

}

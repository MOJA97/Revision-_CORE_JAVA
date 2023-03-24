package com.JavaMap.com;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Concurrent_HashMap {
	//Class, key- allows duplicate values but overrides it
	//value- allows duplicate but doesn't allow null values
	//Asynchronized
	
	public static void main(String[] args) {
		Map<Integer, Object> a = new ConcurrentHashMap<>();
		a.put(11,"Thaney di");
		a.put(12, "Neela Vaanammm....");
		a.put(15,true);
		a.put(17, "Naam");
		a.put(87, "Vaazhndha vaalvuku");
		a.put(89, "Saandravuthu");
		a.put(9, "innoru Uyir");
		System.out.println(a);

		int size = a.size();
		System.out.println("Length:"+size);
		
		int size2 = a.size();
		System.out.println("index:"+size2);
		
		boolean empty = a.isEmpty();
		System.out.println("emoty:"+empty);
		
		Object object = a.get(12);
		System.out.println(object);
		
		Set<Integer> keySet = a.keySet();
		System.out.println(keySet);
		
		Collection<Object> values = a.values();
		System.out.println(values);
		
		Set<Entry<Integer,Object>> entrySet = a.entrySet();
		for (Entry<Integer, Object> each : entrySet) {
			System.out.println(each);
		}
		a.clear();
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
	}

}

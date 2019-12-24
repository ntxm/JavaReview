package com.syntax.class13;

import java.util.*;

public class TableDemo {

	public static void main(String[] args) {
		
		Map<String, String> map1 = createMap1();
		System.out.println(map1);
		
		Map<String, String> map2 = createMap2();
		System.out.println(map2);
		
		List <Map<String, String>> mapList = new ArrayList<>();
		mapList.add(map1);
		mapList.add(map2);
		mapList.add(createMap3());
		
		System.out.println();
		System.out.println("---List of maps---");
		System.out.println(mapList);
		
		System.out.println();
		System.out.println("---Map iterator---");
		Iterator<Map<String, String>> mapIterator = mapList.iterator();
		while(mapIterator.hasNext()) {
			Map<String, String> map = mapIterator.next();
			System.out.println(map);
			
			
		}

	}
	
	public static Map<String, String> createMap1() {
		Map<String, String> map1 = new HashMap<>();
		map1.put("Company", "Alfreds Futterkiste");
		map1.put("Contact", "Maria Anders");
		map1.put("Country", "Germany");
		
		return map1;
	}
	
	public static Map<String, String> createMap2() {
		Map<String, String> map2 = new HashMap<>();
		map2.put("Company", "Centro Commerical");
		map2.put("Contact", "Julia Anders");
		map2.put("Country", "Austria");
		
		return map2;
	}
	
	public static Map<String, String> createMap3() {
		Map<String, String> map3 = new HashMap<>();
		map3.put("Company", "Emst Handled");
		map3.put("Contact", "Jonh Grend");
		map3.put("Country", "Russia");
		
		return map3;
	}
	

}

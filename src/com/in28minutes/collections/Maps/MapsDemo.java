package com.in28minutes.collections.Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsDemo {

	public static void main(String[] args) {

		Map<String, Integer> map = Map.of("A", 3, "B", 5, "Z", 10);

		System.out.println(map);
		System.out.println(map.get("Z"));
		System.out.println(map.isEmpty());
		System.out.println(map.containsKey("A"));
		System.out.println(map.containsValue(3));
		System.out.println(map.keySet());
		System.out.println(map.values());

		Map<String, Integer> hashmap = new HashMap<>(map);

		hashmap.put("K", 24);
		System.out.println(hashmap);

		HashMap<String, Integer> hashmap1 = new HashMap<>();

		hashmap1.put("Z", 5);
		hashmap1.put("A", 15);
		hashmap1.put("F", 25);
		hashmap1.put("L", 250);
		System.out.println(hashmap1);

		LinkedHashMap<String, Integer> linkedhashmap1 = new LinkedHashMap<>();

		linkedhashmap1.put("F", 25);
		linkedhashmap1.put("A", 15);
		linkedhashmap1.put("Z", 5);
		linkedhashmap1.put("L", 250);
		System.out.println(linkedhashmap1);
		
		TreeMap<String, Integer> treemap1 = new TreeMap<>();

		treemap1.put("F", 25);
		treemap1.put("A", 15);
		treemap1.put("Z", 5);
		treemap1.put("L", 250);
		System.out.println(treemap1);

	}

}

package com.arora.example.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemoMain {

	public static void main(String[] args) {

		Map<String, Integer> trialMap = new HashMap<>();
		trialMap.put("hello", 1);
		trialMap.put("hello1", 2);
		trialMap.put("hello2", null);
		trialMap.put("hello3", 4);
		trialMap.put("hello4", 5);
		trialMap.put(null, 6);

		trialMap.forEach((k, v) -> System.out.println("befor add Key is : " + k + " value is  : " + v));

		trialMap.put("hello", 55);
//		while key matched, value remained changed
		System.out.println();
		System.out.println("after put same Key : 'hello' value alter to : " + trialMap.get("hello"));

		System.out.println("**************************************************");

		Map<String, Integer> trialTreeMap = new TreeMap<>();

		trialTreeMap.put("Deepak", 1);
		trialTreeMap.put("Sachin", 5);
		trialTreeMap.put("Suhas", null);
		trialTreeMap.put("Anand", 6);
		trialTreeMap.put("Prakash", 8);
//		trialTreeMap.put(null, 9);   // Null not allowed in TreeMap

		for (Map.Entry<String, Integer> entry : trialTreeMap.entrySet()) {
			System.out.println("Key is : " + entry.getKey() + " value is  : " + entry.getValue());
		}

		System.out.println("**************************************************");

//		Maintain Instertion Order		

		Map<String, Integer> trialTreeMap1 = new LinkedHashMap<>();

		trialTreeMap1.put("Deepak", 1);
		trialTreeMap1.put("Sachin", 5);
		trialTreeMap1.put("Suhas", 3);
		trialTreeMap1.put("Anand", 6);
		trialTreeMap1.put("Prakash", 8);
		trialTreeMap1.put("Prakash", 9);
		trialTreeMap1.put(null, 10);

		for (Map.Entry<String, Integer> entry : trialTreeMap1.entrySet()) {
			System.out.println("Key is : " + entry.getKey() + " value is  : " + entry.getValue());
		}

		System.out.println("*********************Hash table*****************************");

		Hashtable<String, Integer> hashTable = new Hashtable<>();
		hashTable.put("Name", 1);
		hashTable.put("Age", 2);
		hashTable.put("Class", 3);
		hashTable.put("Group", 4);
		hashTable.put("School", 5);
		hashTable.put("null", null);

		hashTable.forEach((k, v) -> System.out.println("Key is : " + k + " value is  : " + v));

	}

}

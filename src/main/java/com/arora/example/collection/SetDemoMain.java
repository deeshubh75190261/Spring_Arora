package com.arora.example.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemoMain {

	public static void main(String[] args) {

		Set<String> myset = new HashSet<>();
		myset.add("Deepak");
		myset.add("Suhas");
		myset.add("Sachin");
		myset.add("Anand");
		myset.add("Anil");
		myset.add(null);

		for (String element : myset) {
			System.out.println(element);
		}
		System.out.println();

		Iterator<String> itr = myset.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}

		System.out.println("******************************************");
		
//		TODO Maintain order

		Set<String> strSet = new LinkedHashSet<>();
		strSet.add("Deepak");
		strSet.add("Vikas");
		strSet.add("Guddu");
		strSet.add("Anand");
		strSet.add("Sachin");
		strSet.add(null);
		strSet.add("Pratham");

		for (String str : strSet) {
			System.out.println(str);
		}

		System.out.println("******************************************");

		// Maintain Ascending order
		Set<String> treSet = new TreeSet<>();
		treSet.add("Ram");
		treSet.add("KAm");
		treSet.add("Ham");
//		treSet.add(null); // Null not allowed in TreeSet
		treSet.add("Ram1");
		treSet.add("Kam1");

		try {

			for (String st : treSet) {
				System.out.println(st);
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}

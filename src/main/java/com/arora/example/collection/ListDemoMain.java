package com.arora.example.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class ListDemoMain {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("Deepak");
		names.add("Suhas");
		names.add(null);
		names.add(null);
		names.add("Sushant");
		names.add(null);
		names.add("Anand");
		names.add("");

		System.out.println("Size of the list is :" + names.size());
		names.forEach(System.out::println);

		names.remove(1);
		names.remove("Anand");

		System.out.println("Size of the list after element removed :" + names.size());
		names.forEach(System.out::println);

		// Declared list as final exception will arise
//		names = new ArrayList<>();
//		System.out.println(names);

		System.out.println("*****************Immutable List***************");

//		names = Collections.unmodifiableList(names);
//		names.add("Sachin");
//		names.forEach(System.out::println);

//		System.out.println("**********************************************");
////		newNames.add("Sachin");
//		List<String> newNames = Collections.unmodifiableList(names);
//		newNames.add("Sachin");
//		newNames.forEach(System.out::println);
//		System.out.println("**********************************************");

		List<Integer> digit = new LinkedList<>();
		digit.add(1);
		digit.add(5);
		digit.add(5);
		digit.add(null);
		digit.add(null);
		digit.add(0);

		System.out.println("Size of the list is :" + digit.size());
		digit.forEach(System.out::println);

		System.out.println("Get 5 " + digit.get(4));

		digit.remove(3);

		System.out.println("Size of the list after element removed :" + digit.size());
		digit.forEach(System.out::println);

		System.out.println("**********************************************");

		Object[] myobject = new Object[10];

		myobject[1] = 5;
		myobject[5] = "GGGG";
		myobject[3] = 5.66;
		myobject[2] = false;

		for (Object ob : myobject) {
			System.out.println(ob);
		}

		System.out.println("**********************************************");

		List<Object> myObjList = new ArrayList<>();
		myObjList.add(5);
		myObjList.add(53);
		myObjList.add("Deepak");
		myObjList.add(5.1666);

		for (Object obj : myObjList) {
			System.out.println(obj);
		}

		System.out.println("*****************Prime number*****************************");

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.stream().filter(num -> num % 2 == 0).forEach(System.out::println);

		System.out.println("******************Reverse & sort****************************");

		Integer arr[] = { 4, 9, 7, 5, 3, 1 };

		List<Integer> myList = new ArrayList<>(Arrays.asList(arr));

		myList.forEach(str -> System.out.println(str));
		System.out.println();
		System.out.println(Arrays.toString(arr));
		System.out.println();
		Collections.sort(myList);
		System.out.println(myList);
		System.out.println();
		Collections.reverse(myList);
		System.out.println(myList);

		System.out.println("**********************************************************");

		List<String> words = Arrays.asList("Hello", "World");

		// Using flatMap() to flatten characters
		List<String> result = words.stream().flatMap(word -> Arrays.stream(word.split("")))
				.collect(Collectors.toList());

		System.out.println("result : " + result); // Output: [H, e, l, l, o, W, o, r, l, d]
		
		System.out.println("==========================================================");

		List<String[]> result1 = words.stream().map(word -> word.split("")).collect(Collectors.toList());

		for (String[] str : result1) {

			System.out.println(Arrays.toString(str));
		}
		
		System.out.println("==========================================================");

		List<String> result2 = words.stream().flatMap(word -> Arrays.stream(word.split(",")))
				.collect(Collectors.toList());

		System.out.println("result2 : " + result2);

		System.out.println("**********************************************************");

		List<Integer> intList = new ArrayList<>(2);
		intList.add(1);
		intList.add(2);
		intList.add(3);

		System.out.println("List Size : " + intList.size());

		System.out.println("************************Vector**********************************");

		Vector<Integer> list = new Vector<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(2);
		list.add(null);

		list.forEach(System.out::println);

	}

}

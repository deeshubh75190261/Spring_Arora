package com.arora.example.codingExample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {

		Integer[] intArr = { 1, 2, 3, 5, 1, 9, 1, 6, 8 };

		List<Integer> list1 = Arrays.asList(intArr);

		System.out.println(list1);

		System.out.println("******************************************");

		List<Integer> list2 = Arrays.asList(intArr).stream().distinct().collect(Collectors.toList());

//		Arrays.asList(intArr).stream().distinct().forEach(System.out::println);

		System.out.println("Distinct : " + list2);

		System.out.println("******************************************");

		Integer[] arr1 = { 1, 2, 3, 5, 4, 6 };
		Integer[] arr2 = { 7, 8, 9, 10, 11, 12 };

		List<Integer> combinedList = Stream.of(Arrays.asList(arr1), Arrays.asList(arr2))
				.flatMap(Collections -> Collections.stream()).collect(Collectors.toList());

		System.out.println("Combined List : " + combinedList);

		List<Integer> combinedList1 = Stream.concat(Arrays.asList(arr1).stream(), Arrays.asList(arr2).stream())
				.collect(Collectors.toList());

		System.out.println("Combined List : " + combinedList1);

		List<Integer> combinedList2 = Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
				.collect(Collectors.toList());

		System.out.println("Combined List : " + combinedList2);

		System.out.println("******************************************");

		String str = "Deepak is a Deepak is a Java Developer";

		List<String> list = Arrays.asList(str.split(" ")).stream().distinct().collect(Collectors.toList());

		List<Integer> list8 = Arrays.stream(arr1).distinct().collect(Collectors.toList());

		System.out.println("Distinct list : " + list + "\n");
		System.out.println("Distinct list : " + list8 + "\n");

		Map<String, Long> countMap = Arrays.asList(str.split(" ")).stream()
				.collect(Collectors.groupingBy(word -> word, Collectors.counting()));

		countMap.forEach((k, v) -> System.out.println(k + " " + v));

		System.out.println("******************************************");

		List<String> list3 = Arrays.asList("Deepak", "Suhas", "Sachin", "Anand");
		System.out.println("List3 : " + list3);

		List<Integer> list4 = list3.stream().map(word -> word.length()).collect(Collectors.toList());

		System.out.println("New Integer List : " + list4);

		System.out.println("******************************************");

		List<String> list5 = list3.stream().sorted().collect(Collectors.toList());

		List<Integer> intList = Arrays.asList(intArr).stream().sorted().collect(Collectors.toList());

		System.out.println("Sorted Integer list : " + intList);
		System.out.println("Sorted String list : " + list5);

		System.out.println("******************************************");

		List<String> list6 = list3.stream().filter(word -> word.startsWith("S")).collect(Collectors.toList());

		System.out.println("Filter list : " + list6);

		System.out.println("******************************************");

		List<String> list7 = list3.stream().limit(2).collect(Collectors.toList());

		System.out.println("Limit list : " + list7);

		System.out.println("******************************************");

	}

}

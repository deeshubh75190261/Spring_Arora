package com.arora.example.codingExample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CombinedListMain {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9, 3, 5, 1);
		List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);

		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 6, 7, 8, 9, 4, 5 };

		List<Integer> combinedList = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());

		System.out.println("Combined List : " + combinedList);

		List<Integer> combinedArray = Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
				.collect(Collectors.toList());

		System.out.println("Combined List : " + combinedArray);

		List<Integer> combinedList1 = Stream.of(list1, list2).flatMap(Collections -> Collections.stream())
				.collect(Collectors.toList());

		System.out.println(combinedList1);

		list1.stream().distinct().forEach(System.out::println);

		Map<Integer, Long> wordCount = list1.stream().collect(Collectors.groupingBy(num -> num, Collectors.counting()));

		wordCount.forEach((k, v) -> System.out.println("Number " + k + " " + " Count " + v));

	}

}

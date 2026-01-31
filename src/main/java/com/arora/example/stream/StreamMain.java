package com.arora.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 4, 6, 7, 8, 4, 5, 9, 1, 6);
		Integer[] arra = { 1, 4, 6, 7, 8, 4, 5, 9, 1, 6, null, null };
		System.out.println("arr : " + arra);
		for (Integer arr : arra) {
			System.out.println(arr);
		}
		List<Integer> arraList = Arrays.asList(arra);
		Arrays.stream(arra);

		System.out.println("************************************");

//		TODO Use filter -- Filter the data 

		List<Integer> filterList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		filterList.forEach(System.out::println);
		System.out.println("-----------------------------------");
		filterList.forEach(i -> System.out.println(i));

		System.out.println("************************************");

//		TODO Use map -- Transform the data
		List<Integer> transformList = list.stream().map(i -> i * 2).collect(Collectors.toList());
		transformList.forEach(System.out::println);

		System.out.println("************************************");

		List<Integer> marks = Arrays.asList(20, 45, 35, 80, 90, 76, 10);

		List<Integer> passed = marks.stream().filter(i -> i > 35).collect(Collectors.toList());
		passed.forEach(System.out::println);

		System.out.println("************************************");

		List<Integer> failedPlus = marks.stream().filter(i -> i <= 35).map(j -> j + 5).collect(Collectors.toList());
		failedPlus.forEach(System.out::println);

		System.out.println("************************************");

		Long failedCount = marks.stream().filter(i -> i < 35).count();
		System.out.println("Filed student count : " + failedCount);

		System.out.println("*************Natural sorting -- ascending order***********************");

//		TODO Natural sorting -- ascending order

		List<Integer> sortedList = marks.stream().sorted().collect(Collectors.toList());
		sortedList.forEach(System.out::println);

		System.out.println("*************Customize sorting  -- descending order***********************");

//		TODO Customize sorting  -- descending order

		List<Integer> descSorting = marks.stream().sorted((a, b) -> (a < b) ? 1 : (a > b) ? -1 : 0)
				.collect(Collectors.toList());
		descSorting.forEach(System.out::println);

		System.out.println("-----------------------------------");

//		TODO Customize sorting  -- using comparator interface descending order

		List<Integer> descSorting1 = marks.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		descSorting1.forEach(System.out::println);
		System.out.println();

		List<Integer> descSorting2 = marks.stream().sorted((a, b) -> Integer.compare(b, a))
				.collect(Collectors.toList());
		descSorting2.forEach(System.out::println);

		System.out.println("***********gg************************");

//		TODO Customize sorting using comparable interface -- ascending order

		List<Integer> ascSorting = marks.stream().sorted((a, b) -> a.compareTo(b)).collect(Collectors.toList());
		ascSorting.forEach(System.out::println);

		System.out.println("************************************");

//		TODO Customize sorting using comparable interface -- descending order

		List<Integer> ascSorting1 = marks.stream().sorted((a, b) -> -a.compareTo(b)).collect(Collectors.toList());
		ascSorting1.forEach(System.out::println);

		System.out.println("************************************");

		List<String> strList = Arrays.asList("A", "AAA", "BB", "BBBBB", "AAAAAA");

		List<String> strSortList = strList.stream().sorted((a, b) -> Integer.compare(b.length(), a.length()))
				.collect(Collectors.toList());
		strSortList.forEach(System.out::println);

		System.out.println("************************************");

		List<String> strSortList1 = strList.stream().sorted(Comparator.comparingInt(String::length))
				.collect(Collectors.toList());
		strSortList1.forEach(System.out::println);

		System.out.println("************************************");

		String maxString = strList.stream().max((a, b) -> Integer.compare(a.length(), b.length())).get();
		System.out.println("Maximum string is : " + maxString);

		System.out.println("************************************");

		String minString = strList.stream().min((a, b) -> Integer.compare(a.length(), b.length())).get();
		System.out.println("Minimum string is : " + minString);

		System.out.println("************************************");

		Stream<?> arr = Stream.of("D", 5, 'A', 9999999999999L, 5.9);
		arr.forEach(System.out::println);

	}

}

package com.arora.example.codingExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountSwapMain {

	public static void main(String[] args) {

//		Q. Find the missing number in an array?

//		int total;
//		int[] numbers = new int[]{1, 2, 3, 4, 6, 7};
//		total = 7;
//		int expected_sum = total * ((total + 1) / 2);
//		int num_sum = 0;
//		for (int i: numbers) {
//		num_sum += i;
//		}
//		System.out.print( expected_sum - num_sum );

//		Q. Write a java program to swap two string variables without using temp variable?		

//		String a = "Hello";
//		String b = "World";
//
//		System.out.println("Strings before swap: a = " + a + " and b = " + b);
//
//		a = a + b;
//		b = a.substring(0, (a.length() - b.length()));
//		a = a.substring(b.length());
//		System.out.println("Strings after swap: a = " + a + " and b = " + b);

//		Find count of each word from String   // Q Find count of each element using Java 8

		String str = "mango is a mango";

		String arr[] = str.split(" ");

		List<String> strList = new ArrayList<>(Arrays.asList(arr));// 1st

		strList.stream().forEach(str1 -> System.out.println(str1));

		System.out.println("*******************************");

		System.out.println(Arrays.toString(arr));// 2nd

		System.out.println("*******************************");

		Map<String, Long> countMap = Arrays.stream(arr)// 3rd
				.collect(Collectors.groupingBy(fWord -> fWord, Collectors.counting()));

		countMap.forEach((k, v) -> System.out.println(k + " " + v));

		System.out.println("*******************************");
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					count++;
					arr[j] = "0";
				}
			}

			if (arr[i] != "0") {
				System.out.println(arr[i] + " " + count);
			}
		}

		System.out.println("*******************************");

		String str1 = "My name is Deepak or Deepak is me";

		String[] arrStr1 = str1.split(" ");

		Map<String, Long> countMap1 = Arrays.stream(arrStr1)
				.collect(Collectors.groupingBy(s -> s, Collectors.counting()));

		countMap1.forEach((k, v) -> {
			if (v > 1) {
				System.out.println(k + "  " + v);
			}
		});

	}

}

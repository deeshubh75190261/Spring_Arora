package com.arora.example.codingExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DuplicateFound {

	public static void main(String[] args) {

//		Q. Write a function to find out duplicate words in a given string?

		String str = "Big black bug bit a big black dog on his big black nose";
		int count = 0;
		str = str.toLowerCase();

		String[] words = str.split(" ");

		for (int i = 0; i < words.length; i++) {
			count = 1;

			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "0";
				}
			}

			if (count > 1 && words[i] != "0") {
				System.out.println(words[i]);
			}
		}

//		System.out.println("************************************************");
//
//		Map<String, Integer> wordCountMap = new HashMap<>();
//
//		for (String word : words) {
//			if (!word.isEmpty()) {
//				wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
//			}
//		}
//
//		for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
//
//			if (entry.getValue() > 1) {
//				System.out.println(entry.getKey());
//			}
//		}

		System.out.println("************************************************");

//		Q. Write a function to find out duplicate characters in a given string?

		String word = "DEEPADDDK";
		word = word.toUpperCase();
		int count1 = 0;

		char[] charArray = word.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			count1 = 1;
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] == charArray[j]) {
					count1++;
					charArray[j] = '0';
				}
			}

			if (count1 > 1 && charArray[i] != '0') {
				System.out.println(charArray[i]);
			}
		}

		System.out.println("************************************************");

		Integer intArr[] = { 1, 2, 3, 4, 5, 4, 5 };

		System.out.println("Array : " + Arrays.toString(intArr));

		List<Integer> list1 = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();

		for (int num : intArr) {

			Boolean flag = set.add(num);
			if (!flag) {
				list1.add(num);
			}

		}

		System.out.println("Duplicate element : " + list1);

		System.out.println("************************************************");

		String[] wordss = str.split(" ");
		Set<String> dupStr = new HashSet<>();
		Set<String> dupStr1 = new HashSet<>();

		for (String str1 : wordss) {

			Boolean flag = dupStr.add(str1);
			if (!flag) {
				dupStr1.add(str1);
			}
		}
		
		System.out.println(dupStr1);

	}

}

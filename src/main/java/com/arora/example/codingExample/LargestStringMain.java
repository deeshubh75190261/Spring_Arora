package com.arora.example.codingExample;
import java.util.HashMap;
import java.util.Map;

public class LargestStringMain {

	public static void main(String[] args) {

		String str = "abcabcdeabcdef";

		int length = str.length();

		int count = 1, sumCount = 0;

		int i = 0, j = 0;

		Map<String, Integer> myMap = new HashMap<>();

		for (j = i + 1; j < length; j++) {

			if (str.charAt(i) == str.charAt(j)) {
				myMap.put(str.substring(i, j), count);
				sumCount += count;
				i = sumCount;
				count = 0;
			}
			count++;
		}
		if (length > sumCount) {
			myMap.put(str.substring(i, j), count);
		}

		myMap.forEach((k, v) -> System.out.println(k + " " + v));
	}

}

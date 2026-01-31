package com.arora.example.codingExample;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
	public static int lengthOfLongestSubstring(String s) {
		int n = s.length();
		int maxLength = 0;
		int left = 0;
		Map<Character, Integer> map = new HashMap<>();

		for (int right = 0; right < n; right++) {
			char currentChar = s.charAt(right);

			if (map.containsKey(currentChar) && map.get(currentChar) >= left) {
				left = map.get(currentChar) + 1;
			}

			map.put(currentChar, right);

			maxLength = Math.max(maxLength, right - left + 1);
		}

		return maxLength;
	}

	public static void main(String[] args) {
		String str = "abcabcbb";
		int length = lengthOfLongestSubstring(str);
		System.out.println("Length: " + length);
	}

}

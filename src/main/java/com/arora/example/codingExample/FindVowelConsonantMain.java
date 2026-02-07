package com.arora.example.codingExample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindVowelConsonantMain {

	public static void main(String[] args) {

		String str = "My NaME Is Deepak";

		str = str.toLowerCase();

		String[] arr = str.toLowerCase().split(" ");

		for (String word : arr) {
			findChars(word);
		}

		System.out.println("====================================================");

		for (int i = 0; i < str.length(); i++) {

			String vowels = "aeiou";

			char ch = str.charAt(i) != ' ' ? str.charAt(i) : '0';

			if (ch != '0') {

				if (vowels.indexOf(ch) != -1) {
					System.out.println("Vowel : " + ch + " index is " + i);
				} else {
					System.out.println("Consonant : " + ch + " index is " + i);
				}
			}
		}

		System.out.println("================================");

		Set<Character> vowels = new HashSet<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');

		String name = "Deepak";

		char[] strCharArray = name.toLowerCase().toCharArray();

		for (Character ch : strCharArray) {

			if (vowels.contains(ch)) {
				System.out.println("Character is vowels : " + ch);
			} else {
				System.out.println("Character is consonent : " + ch);
			}
		}

		System.out.println("=============================");

		for (int i = 0; i < strCharArray.length; i++) {
			if (vowels.contains(strCharArray[i])) {
				System.out.println("Character is vowels : " + strCharArray[i] + " with index value : " + i);
			} else {
				System.out.println("Character is consonent : " + strCharArray[i] + " with index value : " + i);

			}
		}

		System.out.println("=============================");

		char[] strArray1 = str.toCharArray();

		System.out.println("Str array " + Arrays.toString(str.toCharArray()));

		for (int j = 0; j < strArray1.length; j++) {
			char ch = strArray1[j];
			if (ch == ' ') {
				continue;
			} else if (vowels.contains(strArray1[j])) {
				System.out.println("Character is vowels : " + strArray1[j] + " with index value : " + j);
			} else {
				System.out.println("Character is consonent : " + strArray1[j] + " with index value : " + j);

			}
		}

	}

	static void findChars(String str) {

		String vowels = "aeiou";

		for (int i = 0; i < str.length(); i++) {

			if (vowels.indexOf(str.charAt(i)) != -1) {
				System.out.println("Vowel : " + str.charAt(i));
			} else {
				System.out.println("Consonant : " + str.charAt(i));
			}

		}
	}

}

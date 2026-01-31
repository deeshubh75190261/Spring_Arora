package com.arora.example.codingExample;

public class FindVowelConsonantMain {

	public static void main(String[] args) {

		String str = "My NaME Is Deepak";

//		String[] arr = str.toLowerCase().split(" ");
//
//		for (String word : arr) {
//			findChars(word);
//		}

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

	}

	static void findChars(String str) {

		String vowels = "aeiou";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (vowels.indexOf(ch) != -1) {
				System.out.println("Vowel : " + ch);
			} else {
				System.out.println("Consonant : " + ch);
			}

		}
	}

}

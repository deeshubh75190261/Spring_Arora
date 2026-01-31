package com.arora.example.codingExample;

public class FindVowelsCharIndex {

	public static void main(String[] args) {

		String str = "Deepak is a java Developer";

		String vowels = "aeiouAEIOU";

		char[] vArr = vowels.toCharArray();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

//			if (vowels.indexOf(ch) != -1) {
//				System.out.println("Vowels: " + ch + ", Index is " + i);
//			}

			for (char c : vArr) {
				if (c == ch) {
					System.out.println("Vowels: " + ch + ", Index is " + i);
				}
			}

		}

	}

}

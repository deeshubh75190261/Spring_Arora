package com.arora.example.codingExample;

import java.util.Scanner;

public class PalindromMain {

	public static void main(String[] args) {

// 		String

		StringBuffer sb = null;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please provide string ....");
			String inputStr = sc.nextLine();

			sb = new StringBuffer(inputStr);

			sb.reverse();

//			String reversedStr = sb.toString();

//			String reversedStr = reverseString(inputStr);

			if (inputStr.equals(sb.toString())) {
				System.out.println("Provided string is palindrom  " + inputStr);
			} else {
				System.out.println("Provided string is not palindrom  " + inputStr);
			}

			System.out.println("***************************");

//		Integer

			System.out.println("Please provide integer ....");
			int inputInteger = sc.nextInt();

			int reversed = 0;
			int number = inputInteger;

			if (number > 0) {
				while (number > 0) {
					reversed = reversed * 10 + number % 10;
					number /= 10;
				}
			}

			if (inputInteger == reversed) {
				System.out.println("Provided Integer is palindrom  " + inputInteger);
			} else {
				System.out.println("Provided Integer is not palindrom  " + inputInteger);
			}
		}

	}

	private static String reverseString(String str) {

		StringBuffer sb = new StringBuffer();

		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}

		return sb.toString();
	}

}

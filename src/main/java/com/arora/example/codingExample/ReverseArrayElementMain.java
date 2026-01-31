package com.arora.example.codingExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayElementMain {

	public static void main(String[] args) {

		int arr[] = { 4, 8, 6, 2, 6, 4, 3, 5, 9 };

		System.out.println("Before reverse array");

		System.out.println(Arrays.toString(arr) + "\n");

//		for (int num : arr) {
//			System.out.println(num);
//		}

		int i, j, temp;

		System.out.println("Array Length : " + arr.length + "\n");

		for (i = 0, j = arr.length - 1; i < j; i++, j--) {

			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

		}

		System.out.println("After reverse array");

//		for (int num : arr) {
//			System.out.println(num);
//		}

		System.out.println(Arrays.toString(arr));

		System.out.println("*******************************************");

		List<Integer> intList = new ArrayList<>();

//		intList = Arrays.stream(arr).boxed().collect(Collectors.toList());

		for (int num : arr) {
			intList.add(num);
		}

		Collections.reverse(intList);

		System.out.println(intList);

		System.out.println("***************Reverse Array Element****************************");

		int[] arr1 = { 123, 154, 6598, 985 };

		System.out.println(Arrays.toString(arr1));

		List<Integer> newList = new ArrayList<>();

		for (int num : arr1) {

			newList.add(reverseInt(num));

		}

		System.out.println(newList);

		System.out.println("********************************************");

		String strArr[] = { "Deepak", "Abhi", "Rahul" };

		System.out.println(Arrays.toString(strArr));
		List<String> myStr = new ArrayList<>();
		StringBuffer sb = null;

		for (String str1 : strArr) {

			sb = new StringBuffer(str1);
			sb.reverse();
			myStr.add(sb.toString());

		}

		System.out.println(myStr);
		Collections.reverse(myStr);
		System.out.println(myStr);

		System.out.println("*******************************");

		String syntense = "India is my country";

		String[] arr2 = syntense.split(" ");

		String ans = "";

		String ans1 = "";

		System.out.println("Input String is   : " + syntense);

		for (int ii = arr2.length - 1; ii >= 0; ii--) {

			ans = ans + arr2[ii] + " ";
		}

		for (int k = syntense.length() - 1; k >= 0; k--) {
			ans1 = ans1 + syntense.charAt(k);
		}

		System.out.println("Reverse String is : " + ans1);

		System.out.println("Reverse String is : " + ans);

		System.out.println("*******************************");

		String str = "abc#de@f";

		char[] chars = str.toCharArray();

		i = 0;
		j = chars.length - 1;

		while (i < j) {

			if (!Character.isLetterOrDigit(chars[i])) {
				i++;
			} else if (!Character.isLetterOrDigit(chars[j])) {
				j--;
			} else {
				char temp1 = chars[i];
				chars[i] = chars[j];
				chars[j] = temp1;
				i++;
				j--;
			}

		}

		System.out.println("Original String : " + str);
		System.out.println("Reversed string : " + new String(chars));
	}

//	private static int reverseInt(int num) {
//
//		String strNum = String.valueOf(num);
//
//		StringBuffer sb = new StringBuffer(strNum);
//		sb.reverse();
//
//		int newNum = Integer.parseInt(sb.toString());
//
//		return newNum;
//	}

	private static int reverseInt(int number) {

		int reversed = 0;
		if (number > 0) {
			while (number > 0) {
				reversed = reversed * 10 + number % 10;
				number /= 10;
			}
		}
		return reversed;
	}

}

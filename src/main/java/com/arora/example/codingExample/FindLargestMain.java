package com.arora.example.codingExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindLargestMain {

	public static void main(String args[]) {

		int[] arr1 = { 10, 20, 4, 45, 99, 54 };
		int n1 = 4; // Change this to find the nth largest number

		if (arr1.length < n1) {
			System.out.println("Array must have at least " + n1 + " elements.");
			return;
		}

		Arrays.sort(arr1); // Sort the array in ascending order

//		for (int i : arr1) {
//			System.out.println(i);
//		}

		int nthLargest = arr1[arr1.length - n1]; // Access the nth largest element

		System.out.println(Arrays.toString(arr1));
		System.out.println("The " + n1 + "th largest number is: " + nthLargest);

		System.out.println("*********************************************************");

		int[] arr2 = { 10, 20, 4, 45, 99, 54 };
		int n = 3;

		if (arr2.length < n) {
			System.out.println("Array must have at least " + n + " elements.");
			return;
		}

		for (int i = 0; i < arr2.length; i++) {
			int maxIndex = i;
			for (int j = i + 1; j < arr2.length; j++) {
				if (arr2[j] > arr2[maxIndex]) {
					maxIndex = j;
				}
			}

			// Swap the largest found with the ith element
			int temp = arr2[i];
			arr2[i] = arr2[maxIndex];
			arr2[maxIndex] = temp;
		}

//		for (int num : arr2) {
//			System.out.println(num);
//		}

		System.out.println(Arrays.toString(arr2));

		int nLargest = arr2[n - 1]; // Access the nth largest element

		System.out.println("The " + n + "th largest number is: " + nLargest);

		System.out.println("*********************************************************");

		int[] arr3 = { 10, 20, 4, 45, 99, 54 };

		int maxOne = 0;
		int maxTwo = 0;
		int maxThird = 0;

		for (int num : arr3) {

			if (maxOne < num) {
				maxTwo = maxOne;
				maxThird = maxTwo;
				maxOne = num;
			} else if (maxTwo < num) {
				maxThird = maxTwo;
				maxTwo = num;
			} else if (maxThird < num) {
				maxThird = num;
			}
		}

		System.out.println("Max one is : " + maxOne);
		System.out.println("Max two is : " + maxTwo);
		System.out.println("Max third is : " + maxThird);

		System.out.println("*********************************************************");

		List<Integer> intList = new ArrayList<>();

		intList = Arrays.stream(arr3).boxed().collect(Collectors.toList());

		int index = 3;

		Collections.sort(intList);
		System.out.println(index + "rd largest sort(): " + intList.get(intList.size() - index));
		Collections.reverse(intList);
		System.out.println(index + "rd largest reverse(): " + intList.get(2));

		System.out.println("*********************************************************");

		int[] arr4 = { 4, 8, 9, 7, 6, 3, 1, 2, 5 };

		System.out.println("Without Sort array is : " + Arrays.toString(arr4));

		int findNum = 3;

		for (int i = 0; i < arr4.length; i++) {
			for (int j = i + 1; j < arr4.length; j++) {
				if (arr4[i] > arr4[j]) { // ascending sort
					int temp = arr4[i];
					arr4[i] = arr4[j];
					arr4[j] = temp;
				}
			}
		}

		System.out.println("Sort array is         : " + Arrays.toString(arr4));

		System.out.println("Found " + findNum + "rd largest is  : " + arr4[arr4.length - findNum]);

	}

}

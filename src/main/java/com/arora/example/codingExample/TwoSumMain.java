package com.arora.example.codingExample;

import java.util.Arrays;

public class TwoSumMain {

	public static void main(String[] args) {

//		Input: arr = [2, 7, 11, 15], n = 9   
//		Output: [2, 7]

		int[] arr = { 2, 7, 4, 5, 11, 15 };

		int target = 16;

		boolean flag = true;

		System.out.println("Sum of two element : " + target);

		int count = 0, targetCount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (targetCount < 1) {
				for (int j = i + 1; j < arr.length; j++) {
					if (count < 1) {
						if (target == (arr[i] + arr[j])) {
//							System.out.println(arr[i] + " & " + arr[j]);
							System.out.println(Arrays.toString(new int[] { arr[i], arr[j] }));
							count++;
							targetCount++;
							flag = false;
						}
					}
				}
			}
		}
		if (flag) {
			System.out.println(Arrays.toString(arr));
		}

	}

}

package com.arora.example.justCheck;

public class SharedExample {
	public static void main(String[] args) {
		int[] array = new int[3]; // Original array in heap memory
		array[0] = 10;

		modifyArray(array); // Pass array to a method
		System.out.println(array[0]); // Output: 100
	}

	public static void modifyArray(int[] arr) {
		System.out.println(arr[0]);
		arr[0] = 100; // Modifies the same array in memory
	}
}

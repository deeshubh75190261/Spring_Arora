package com.arora.example.codingExample;

public class ArraySum {

	public static void main(String[] args) {

//		Output should be 6 6 6 6

		int[] intArray = { 15, 123, 96, 1050, 56 };

		for (Integer number : intArray) {
			int sum = 0;

			sum = reduceSingleDigit(number);

			System.out.println("Sum of " + number + " is " + sum);

		}

		System.out.println("***********************************");

//		Using String 

		for (Integer number : intArray) {
			int arrSum = usingString(number);
			while (arrSum > 10) {
				arrSum = usingString(arrSum);
			}

			System.out.println("Sum of " + number + " is " + arrSum);
		}

	}

	public static int reduceSingleDigit(int number) {

		while (number > 10) {
			number = sumOfDigits(number);
		}
		return number;
	}

	public static int sumOfDigits(int number) {
		int sum = 0;
		if (number > 0) {
			while (number > 0) {
				sum += number % 10;
				number /= 10;

			}

		}
		return sum;

	}

	public static int usingString(int number) {
		int sum = 0;
//		String arrElement = Integer.toString(number);
		String arrElement = String.valueOf(number);

		char[] arrElementCharArray = arrElement.toCharArray();

		for (char c : arrElementCharArray) {

			sum += Character.getNumericValue(c);

		}
		return sum;
	}
}

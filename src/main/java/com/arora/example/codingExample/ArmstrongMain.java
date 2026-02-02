package com.arora.example.codingExample;

import java.util.Scanner;

public class ArmstrongMain {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number");
			int destination = sc.nextInt();

			int count = 0;

			for (int i = 1; i < destination; i++) {

				if (getArmstrong(i)) {
					count++;
					System.out.println(i);
				}
			}

			System.out.println("Total Armstrong numbers: " + count);
		}

	}

	private static boolean getArmstrong(int number) {

		int temp = 0, sum = 0, ref = 0;

		if (number > 0) {
			temp = number;
			while (number > 0) {
				ref = number % 10;
				number = number / 10;
				sum = sum + (ref * ref * ref);
			}

		} else {
			System.out.println("Number should be greater than 0");
		}

		return temp == sum;
	}

}

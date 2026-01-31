package com.arora.example.codingExample;

import java.io.InputStreamReader;
import java.util.Scanner;

public class PrimeMain {

	public static boolean isPrime(int number) {

//		System.out.println(number + "  =  " + Math.sqrt(number));

//		for (int i = 2; i <= Math.sqrt(number); i++) {
		for (int i = 2; i * i <= number; i++) {

			if (number % i == 0) {

				return false;
			}

		}

		return true;

	}

	public static void main(String[] args) {

//		Scanner sc = new Scanner(new InputStreamReader(System.in));
//
//		System.out.println("Enter number for check isPrime or not");
//
//		int number = sc.nextInt();
//
//		Boolean result = isPrime(number);
//
//		if (result) {
//			System.out.println("Number is prime");
//		} else {
//			System.out.println("Number is not prime");
//		}

		for (int i = 2; i <= 100; i++) {

			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}

	}

}

package com.arora.example.codingExample;

import java.util.Scanner;

public class FibonacciSeriesMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide integer ....");
		int n = sc.nextInt();

		int a = 0, b = 1;

		System.out.print("Fibonacci Series: " + a + ", " + b);

		for (int i = 2; i <= n; i++) {
			int next = a + b;
			System.out.print(", " + next);
			a = b;
			b = next;
		}

	}

}

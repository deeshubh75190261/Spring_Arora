package com.arora.example.justCheck;

public class ReverseDigit {

	public static void main(String[] args) {

		int number = 123;
		int reversed = 0;
		while (number > 0) {
			reversed = reversed * 10 + number % 10;
			number /= 10;
		}
		System.out.println(reversed);
	}

}

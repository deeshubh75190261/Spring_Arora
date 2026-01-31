package com.arora.example.polymorphism;

public class OverrideClass {

	public static void main(String[] args) {

		B obj = new B();

		int sum = B.getSum(5, 6);

		System.out.println("Sum :" + sum);

		obj.eat("I want to eat mango");

	}

}

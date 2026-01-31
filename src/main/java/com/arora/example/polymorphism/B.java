package com.arora.example.polymorphism;

public class B extends A {

	@Override
	public void eat(String message) {
//		super.eat(message);
		System.out.println("Inside class B " + message);
	}

	public static int getSum(int a, int b) {
		return a + b;
	}

}

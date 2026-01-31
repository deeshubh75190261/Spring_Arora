package com.arora.example.java8Interface.staticMethod;

public interface Calculator {

	static int add(int a, int b) {
		return a + b;
	}

	static int multiply(int a, int b) {
		return a * b;
	}

}

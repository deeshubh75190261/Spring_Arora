package com.arora.example.java8Interface.staticMethod;

import com.arora.example.java8Interface.defaultMethod.DemoStaticCalculator;

public class CalculatorMain {

	public static void main(String[] args) {

		int sum = Calculator.add(5, 10);
		int multiply = Calculator.multiply(9, 9);
		int add = DemoStaticCalculator.add(2, 5);

		System.out.println("Sum : " + sum);
		System.out.println("Multiply : " + multiply);
		System.out.println("Add : " + add);

	}

}

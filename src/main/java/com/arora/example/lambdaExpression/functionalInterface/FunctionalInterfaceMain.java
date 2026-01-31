package com.arora.example.lambdaExpression.functionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceMain {

	public static void main(String[] args) {

		System.out.println("***********************Predicate******************************");

//		Predicate Functional Interface

		Predicate<Integer> obj1;
		obj1 = (num) -> num % 2 == 0;
		System.out.println("Provided number is even : " + obj1.test(4));

		obj1 = (num) -> num > 0;
		System.out.println("Provided number isPositive : " + obj1.test(-4));

		System.out.println("***********************Consumer*******************************");

//		Consumer Functional Interface

		Consumer<String> toUpperCase = (str) -> System.out.println("String uppercase : " + str.toUpperCase());
		Consumer<String> toLength = str -> System.out.println("String length : " + str.length());

		toUpperCase.accept("Deepak");
		toLength.accept("Deepak");

		Consumer<String> combined = toUpperCase.andThen(toLength);
		combined.accept("Patil");

		System.out.println("*********************Supplier*********************************");

//		Supplier Functional Interface

		Supplier<Double> randomValueGet = () -> Math.random();

		System.out.println("Random value  : " + randomValueGet.get());
		System.out.println("Another Random Value : " + randomValueGet.get());

		System.out.println("*********************Function*********************************");

//		Function Functional Interface

		Function<String, Integer> stringLength = str -> str.length();
		System.out.println("Length of Deepak : " + stringLength.apply("Deepak"));

		Function<Integer, Integer> square = num -> num * num;
		System.out.println("Square of number : " + square.apply(5));

		Function<String, Integer> lengthSquared = stringLength.andThen(square);
		System.out.println("Square of the length of 'Deepak' : " + lengthSquared.apply("Deepak"));

		System.out.println("**************************************************************");
	}

}

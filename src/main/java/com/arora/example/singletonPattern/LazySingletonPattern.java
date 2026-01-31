package com.arora.example.singletonPattern;

public class LazySingletonPattern {

	private static LazySingletonPattern instance;

	private LazySingletonPattern() {

	}

	public static synchronized LazySingletonPattern getinstance() {
		if (instance == null) {
			instance = new LazySingletonPattern();
		}
		return instance;
	}

	public static void main(String[] args) {

		LazySingletonPattern obj = LazySingletonPattern.getinstance();

		System.out.println("LazySingletonPattern object : " + obj);

	}
}

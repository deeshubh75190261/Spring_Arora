package com.arora.example.singletonPattern;

public class EagarSingletonPattern {

	private static final EagarSingletonPattern instance = new EagarSingletonPattern();

	// Private constructor to prevent instantiation
	private EagarSingletonPattern() {
	}

	public static EagarSingletonPattern getInstance() {
		return instance;
	}

	public static void main(String[] args) {

		EagarSingletonPattern obj = EagarSingletonPattern.getInstance();

		System.out.println("EangerSingletonPattern object : " + obj);

	}

}

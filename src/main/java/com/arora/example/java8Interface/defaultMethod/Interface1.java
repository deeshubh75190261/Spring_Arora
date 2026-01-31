package com.arora.example.java8Interface.defaultMethod;

public interface Interface1 {

	default void hello() {
		System.out.println("From interface 1");
	}

	public void getSum();

	static void display() {
		System.out.println("static() from interfece 1");
	}

}

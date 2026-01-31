package com.arora.example.staticInstanceBlockCheck;

public class Test {

	int instanceVariable = 42; // Instance variable

	static int b = 50;

	// static block
	static {

		System.out.println("Called static block");
		Test obj = new Test();

		System.out.println("static block access instane variable : " + obj.instanceVariable);

	}

	public static int getInt() {
		Test obj = new Test();

		return obj.instanceVariable;
	}

	// Instance initialization block

	{
		System.out.println("Instatnce block :");
		System.out.println("Instatnce block access static variable :" + b);
		staticMethod(); // Instance block access static method
	}

	// static method
	static void staticMethod() {

		System.out.println("Called static method");

	}

	public static void main(String[] args) {
		System.out.println("Access loacl variable from static() : " + Test.getInt());
	}
}

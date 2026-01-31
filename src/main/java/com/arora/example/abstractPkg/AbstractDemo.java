package com.arora.example.abstractPkg;

public abstract class AbstractDemo {

	int a = 0;
	int b = 0;

//	AbstractDemo() {
//
//		System.out.println("Default constructor");
//	}

	AbstractDemo(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void display() {
		System.out.println("Sum of a and b is :" + (a + b));
	}

}

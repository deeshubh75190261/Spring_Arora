package com.arora.example.java8Interface.defaultMethod;

public class ChildMain extends Child1 implements Interface1 {

	public static void main(String[] args) {

		// Do anything

		ChildMain obj = new ChildMain();
		obj.hello();
		obj.getSum();
		Interface1.display();
	}

	public void hello() {
		Interface1.super.hello();

		System.out.println("Call from Main()");
	}

	@Override
	public void getSum() {

		System.out.println("From ChildMain class");
	}

}

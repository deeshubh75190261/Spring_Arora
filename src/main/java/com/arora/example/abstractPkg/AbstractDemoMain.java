package com.arora.example.abstractPkg;

public class AbstractDemoMain extends AbstractDemo {

	AbstractDemoMain(int a, int b) {
		super(a, b);
	}
	
//	AbstractDemoMain(int a, int b) {
//
//		System.out.println("From Child Class " + a + " " + b);
//	}

	public static void main(String[] args) {

		AbstractDemoMain demo = new AbstractDemoMain(5, 6);
		demo.display();
	}
}

package com.arora.example.abstractPkg;

abstract class Demo {
	abstract void display2();

	void display() {
		System.out.println("Hello ");

	}
}

class Demo1 extends Demo {
	void display2() {
		System.out.println("Bye");

	}
}

public class abstractclassDemo2 {

	public static void main(String[] args) {

		Demo1 ob = new Demo1();
		ob.display();
		ob.display2();

	}

}

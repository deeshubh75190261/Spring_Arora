package com.arora.example.java8Interface.staticMethod;

public class Test {
	public static void main(String[] args) {
//		Parent obj1 = new Parent();
//		Parent obj2 = new Child();

		Parent.display(); // Output: Static method in Parent class
		Child.display(); // Output: Static method in Child class (method hiding)
		
		System.out.println();
		
//		obj1.display();
//		obj2.display();
	}
}

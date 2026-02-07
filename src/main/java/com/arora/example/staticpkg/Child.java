package com.arora.example.staticpkg;

public class Child extends Parent {

	static void show() {
		System.out.println("Child show()");
	}

	@Override
	void display() {
		System.out.println("Child dispaly()");
	}

	public static void main(String[] args) {

//		We can not override static method into the child class
//		This is called method hiding, not overriding.

		Parent obj = new Child();
		obj.show();

		Parent.show();
		Child.show();

//		Here runtime polymorphisom occurs  
//		This is called method overriding

		obj.display();

	}

}

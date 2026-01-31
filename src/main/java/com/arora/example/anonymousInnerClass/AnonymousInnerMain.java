package com.arora.example.anonymousInnerClass;

public class AnonymousInnerMain {

	private int x = 10;
	private static String HELLO = "Hellow";

	public static void main() {
		System.out.println("Overloded main method");
	}

	public void dummy() {
		System.out.println("This is dummy method");
	}

	private void print() {

		int y = 20;
		final int z = 30;
		int w = 40;

		Parent obj = new Parent() {

			static final int w = 50;

			public void display() {
				System.out.println("Display method in anonymous inner class");
				System.out.println("Enclosing class x : " + x);
				System.out.println("Enclosing class constant : " + HELLO);

				main();
				dummy();

				System.out.println("Enclosing Block y : " + y);
				System.out.println("Enclosing Block z : " + z);
				System.out.println("W varialble shadowing : " + w);
			}
		};

		obj.display();

	}

	public static void main(String[] args) {

		AnonymousInnerMain mainObj = new AnonymousInnerMain();
		mainObj.print();

	}

}

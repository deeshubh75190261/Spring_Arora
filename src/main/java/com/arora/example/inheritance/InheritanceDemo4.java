package com.arora.example.inheritance;

public class InheritanceDemo4 {

	static class A1 {
		int a = 10, b = 20;

		void display() {
			System.out.println("Class A1 " + (a + b));
		}
	}

	static class B1 extends A1 {
		int c = 30, d = 40;

		void display() {

//			super.display();
			System.out.println("Class B1 " + (c + d));
//			System.out.println("Class A1 from B1 " + (a * b));

		}
	}

	public static void main(String[] args) {

		A1 obj1 = new A1();
		B1 obj2 = new B1();

		obj1.display();
		obj2.display();

		A1 obj3 = new B1();

		obj3.display();

//		B1 obj4 = (B1) new A1();
//		obj4.display();

// 		Fix it 

		if (obj3 instanceof B1) {
			B1 obj4 = (B1) obj3;
			obj4.display();
		}

	}

}

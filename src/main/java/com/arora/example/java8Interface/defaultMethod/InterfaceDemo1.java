package com.arora.example.java8Interface.defaultMethod;

public class InterfaceDemo1 implements I1 {

	public static void main(String[] args) {

		InterfaceDemo1 obj = new InterfaceDemo1();
		obj.disp1();
		obj.disp2();
		obj.disp3();
		I1.disp4();

	}

	@Override
	public void disp1() {
		System.out.println("disp1()" + a + " " + b + " " + I1.a + " " + I1.b);
	}

	@Override
	public void disp2() {
		System.out.println("disp2()" + a + " " + b + " " + I1.a + " " + I1.b);

	}

}

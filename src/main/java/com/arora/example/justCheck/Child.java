package com.arora.example.justCheck;

public class Child extends Parent1 implements Parent2 {

	public static void main(String[] args) {

		Child obj = new Child();
		int a = obj.doSum(25, 30);

		System.out.println("Sum : " + a);

	}

	@Override
	public int doSum(int a, int b) {

		System.out.println("method called from main");
		return Parent2.doSum(a, b);
	}

}

package com.arora.example.abstractPkg;

import com.arora.example.polymorphism.A;

public class B extends A {

	public static void main(String[] args) {

		B obj = new B();

		System.out.println("Print A class fro m differnet package variable : " + obj.a);
	}

}

package com.arora.example.java8Interface.defaultMethod;

public class Child implements Interface1, Interface2 {

	public static void main(String[] args) {

		Child pobj = new Child();
		pobj.hello();

	}

	@Override
	public void hello() {
		System.out.println("From inside child class hello calling");
		Interface2.super.hello();
	}

	@Override
	public void getSum() {
		// TODO Auto-generated method stub
		
	}

}

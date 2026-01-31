package com.arora.example.markerInterface.cloneObject;

public class CloneDemo implements Cloneable {

	int a = 0;
	int b = 0;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	CloneDemo(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void print() {

		System.out.println("Value of a = " + a + " and b = " + b + "");
	}

}

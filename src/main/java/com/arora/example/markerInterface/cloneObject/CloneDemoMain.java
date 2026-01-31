package com.arora.example.markerInterface.cloneObject;

public class CloneDemoMain {

	public static void main(String[] args) throws CloneNotSupportedException {

		CloneDemo obj = new CloneDemo(5, 10);

		CloneDemo obj1 = (CloneDemo) obj.clone();

		obj1.setA(6);
		obj1.setB(15);
		obj.print();
		obj1.print();

		CloneDemo obj2 = new CloneDemo(55, 100);

		CloneDemo obj3 = obj2;
		obj3.setA(23);

		obj2.print();
		obj3.print();

	}

}

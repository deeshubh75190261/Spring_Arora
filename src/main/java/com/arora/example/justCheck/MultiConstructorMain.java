package com.arora.example.justCheck;

public class MultiConstructorMain {

	MultiConstructorMain() {

	}

	MultiConstructorMain(int a, int b) {

		System.out.println("Intger constructor call");
	}

	MultiConstructorMain(long a, long b) {

		System.out.println("Long constructor call");
	}

	MultiConstructorMain(float a, float b) {

		System.out.println("Float constructor call");
	}

	public static void main(String[] args) {

		MultiConstructorMain obj = new MultiConstructorMain(4, 5);
		MultiConstructorMain obj1 = new MultiConstructorMain(4L, 5L);
		MultiConstructorMain obj2 = new MultiConstructorMain(4f, 5f);

	}

}

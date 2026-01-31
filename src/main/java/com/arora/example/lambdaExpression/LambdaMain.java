package com.arora.example.lambdaExpression;

interface Calculator55 {
	public int sum(int a, int b);
}

class LambdaMain {
	public static void main(String[] args) {

//		Calculator55 obj = new Calculator55() {
//			public int sum(int a, int b) {
//				return a + b;
//			}
//		};
//		System.out.println("Sum : " + obj.sum(4, 5));

//		Calculator55 obj;
//
//		obj = (int a, int b) -> {
//			return a + b;
//		};
//		System.out.println("Sum : " + obj.sum(4, 5));

		Calculator55 obj;

		obj = (a, b) -> {
			return a + b;
		};

		System.out.println("Sum : " + obj.sum(4, 5));
	}
}
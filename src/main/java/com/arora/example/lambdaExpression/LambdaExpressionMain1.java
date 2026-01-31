package com.arora.example.lambdaExpression;

interface Calculator {

	int calculate(int a, int b);
}

//class CalculatorMain implements Calculator {
//
//	@Override
//	public int calculate(int a, int b) {
//
//		return a + b;
//	}
//
//}

public class LambdaExpressionMain1 {

	public static void main(String[] args) {

		Calculator obj;

//		1st way
//		obj = new CalculatorMain();
//		System.out.println("Addition of both digits : " + obj.calculate(5, 5));

//      2nd way		// Anonymous Inner Class
//		obj = new Calculator() {
//			@Override
//			public int calculate(int a, int b) {
//
//				return a + b;
//			}
//		};
//		System.out.println("Addition of both digits : " + obj.calculate(5, 5));

//		3rd way		// If Method with return_type, name and signature why should I write again 
//		obj = (int a, int b) -> {
//			return a + b;
//		};
//		System.out.println("Addition of both digits : " + obj.calculate(5, 5));

//		4th way
		obj = (a, b) -> {
			return a * b;
		};
		System.out.println("Addition of both digits : " + obj.calculate(5, 5));

		System.out.println("******************************************************");

	}

}

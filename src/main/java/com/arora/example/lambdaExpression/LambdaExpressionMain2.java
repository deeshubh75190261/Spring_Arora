package com.arora.example.lambdaExpression;

interface Calculatorr {

	int calculate(int a, int b);

	void show();
}

//class CalculatorMain implements Calculatorr {
//
//	@Override
//	public int calculate(int a, int b) {
//
//		return a + b;
//	}
//
//}

public class LambdaExpressionMain2 {

	public static void main(String[] args) {

		Calculatorr obj;

//		1st way
//		obj = new CalculatorMain();
//		System.out.println("Addition of both digits : " + obj.calculate(5, 5));

//      2nd way		// Anonymous Inner Class
//		obj = new Calculatorr() {
//			@Override
//			public int calculate(int a, int b) {
//
//				return a + b;
//			}
//		};
//		System.out.println("Addition of both digits : " + obj.calculate(5, 5));

//		3rd way 		// If Method with return_type, name and signature why should I written again 
//		obj = (int a, int b) -> {
//			return a + b;
//		};
//		System.out.println("Addition of both digits : " + obj.calculate(5, 5));

//		4th way
//		obj = (a, b) -> {
//			return a + b;
//		};
//		System.out.println("Addition of both digits : " + obj.calculate(5, 5));

//		If two methods are present in your interface

		obj = new Calculatorr() {

			@Override
			public int calculate(int a, int b) {

				return a + b;
			}

			@Override
			public void show() {
				System.out.println("From Calculatorr Interface");

			}
		};

		System.out.println("Addition of both digits : " + obj.calculate(5, 5));

		obj.show();

	}

}

package com.arora.example.lambdaExpression;

interface A {
	void show(int i);
}

//class AClass implements A {
//
//	@Override
//	public void show(int i) {
//
//		System.out.println("Hello Deepak...!!! "+ i);
//
//	}
//
//}

public class LambdaExpressionMain {

	public static void main(String[] args) {

//		1st way

		A obj;

//	    obj = new A() // Anonymous Inner Class
//		{
//			public void show(int i) {
//
//				System.out.println("1st way           Hellow Deepak...!!! "+ i);
//			}
//		};

//		2nd way

//		obj = (int i ) -> {
//
//			System.out.println("2nd way          Hello Deepak...!! "+ i);
//		};

//		3rd way
// Because single line of code
		obj = (int i) -> System.out.println("3rd way           Hello Deepak..!!! " + i);

		obj.show(4);

	}

}

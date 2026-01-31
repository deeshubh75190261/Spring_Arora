package com.arora.example.conversion;

public class ConversionMain {

	public static void main(String[] args) {

		int num = 5;
		long num1;

		long num2 = 456;

		num1 = num;

//		When two types are compatible
//		Destination type is larger than source type 
//		because long is larger datatype than int.
//		Widening Conversion comes under Automatic type conversion
		System.out.println("Atomatic type conversion : " + num1);

//		*******************************************************

//		When destination type is smaller than source type
		byte b = (byte) num2;
		System.out.println("Narrowing type conversion : " + b);

		int a = 15;
		Integer c = Integer.valueOf(a);// Auto_Boxing

		System.out.println("a is : " + a);
		System.out.println("c is : " + c);

		int d = c.intValue(); // Un_Boxing

		System.out.println("d is : " + d);

	}

}

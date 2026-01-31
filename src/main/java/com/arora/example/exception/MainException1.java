package com.arora.example.exception;

public class MainException1 {

	@SuppressWarnings("finally")
	public static int method1() {
		try {

			int a = 15 / 0;
			
			return 1;

		} catch (Exception e) {

			return 2;

		} finally {

			return 3;
		}
	}

	public static void main(String[] args) {

		int b = MainException1.method1();

		System.out.println(b);

	}

}

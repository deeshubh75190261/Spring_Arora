package com.arora.example.singletonPattern;

public class DoubleCheckLockingSinglePattern {

	private static volatile DoubleCheckLockingSinglePattern instance;

	private DoubleCheckLockingSinglePattern() {
	}

	public static synchronized DoubleCheckLockingSinglePattern getInstance() {

		if (instance == null) {
			synchronized (DoubleCheckLockingSinglePattern.class) {
				if (instance == null) {
					instance = new DoubleCheckLockingSinglePattern();
				}
			}
		}

		return instance;
	}

	public static void main(String[] args) {

		DoubleCheckLockingSinglePattern obj = DoubleCheckLockingSinglePattern.getInstance();

		System.out.println("DoubleCheckLockingSinglePattern object : " + obj);
	}
}

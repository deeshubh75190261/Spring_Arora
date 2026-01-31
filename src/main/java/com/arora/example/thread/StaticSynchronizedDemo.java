package com.arora.example.thread;

public class StaticSynchronizedDemo {

	// Check after static keywords removed from below method, do not change anything

	public static synchronized void m1() {

		System.out.println("Inside m1()");

		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " , i = " + i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

	public static synchronized void m2() {
		System.out.println("Inside m2()");

		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " , i = " + i);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

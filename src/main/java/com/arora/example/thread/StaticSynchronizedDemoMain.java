package com.arora.example.thread;

public class StaticSynchronizedDemoMain {

	public static void main(String[] args) {

		StaticSynchronizedDemo d1 = new StaticSynchronizedDemo();
		StaticSynchronizedDemo d2 = new StaticSynchronizedDemo();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				d1.m1();

			}
		});

		t1.setName("First Thread");

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				d2.m2();
			}
		});

		t2.setName("Second Thread");

		t1.start();
		t2.start();
	}

}

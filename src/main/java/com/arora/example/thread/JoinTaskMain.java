package com.arora.example.thread;

public class JoinTaskMain {

	public static void main(String[] args) {

		try {

			Thread t1 = new Thread(new JoinTask());
			t1.setName("First Thread");
			Thread t2 = new Thread(new JoinTask());
			t2.setName("Second Thread");
			Thread t3 = new Thread(new JoinTask());
			t3.setName("Third Thread");

			t1.start();
			System.out.println("Current thread " + Thread.currentThread().getName());

			t1.join();

			t3.start();
			System.out.println("Current thread " + Thread.currentThread().getName());

			t3.join();

			t2.start();
			System.out.println("Current thread " + Thread.currentThread().getName());

			t2.join();
			System.out.println("Existing from current thread " + Thread.currentThread().getName());

		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

}

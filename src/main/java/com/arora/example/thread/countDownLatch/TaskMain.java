package com.arora.example.thread.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class TaskMain {

	public static void main(String[] args) {

		CountDownLatch latch = new CountDownLatch(3);

		Thread t1 = new Thread(new Task("Service 1", latch));

		Thread t2 = new Thread(new Task("Service 2", latch));

		Thread t3 = new Thread(new Task("Service 3", latch));

		t1.start();
		t2.start();
		t3.start();

		try {

			latch.await();

			System.out.println("All services are up, Starting main application now");

		} catch (InterruptedException e) {
			System.out.println(e);
		}

	}

}

package com.arora.example.thread;

public class JoinTask implements Runnable {

	@Override
	public void run() {

		try {

			System.out.println(Thread.currentThread().getName());

			Thread.sleep(5000);

		} catch (InterruptedException e) {
			System.out.println(e);
		}

	}

}

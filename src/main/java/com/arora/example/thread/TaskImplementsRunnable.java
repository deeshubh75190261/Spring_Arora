package com.arora.example.thread;

public class TaskImplementsRunnable implements Runnable {

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName() + " is running");
		
	}

}

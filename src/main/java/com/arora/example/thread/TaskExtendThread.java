package com.arora.example.thread;

public class TaskExtendThread extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running ");
	}

}

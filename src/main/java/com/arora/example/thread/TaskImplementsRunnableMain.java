package com.arora.example.thread;

public class TaskImplementsRunnableMain {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {

			Thread task = new Thread(new TaskImplementsRunnable());
			task.setName("Thread " + i);
			task.start();
		}

	}

}

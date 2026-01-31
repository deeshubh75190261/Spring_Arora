package com.arora.example.thread;

public class TaskExtendThreadMain {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			TaskExtendThread task = new TaskExtendThread();
			task.setName("Thread " + i);
			task.start();
		}
	}

}

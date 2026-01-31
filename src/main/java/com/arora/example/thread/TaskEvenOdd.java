package com.arora.example.thread;

public class TaskEvenOdd implements Runnable {

	private String taskName = "";
	private Print printObj;
	private int max;

	TaskEvenOdd(String taskName, int max, Print obj) {

		this.taskName = taskName;
		this.printObj = obj;
		this.max = max;

	}

	@Override
	public void run() {

		for (int i = 1; i <= max; i++) {
			if ("even".equals(taskName) && i % 2 == 0) {
				printObj.handleEven(i);
			} else if ("odd".equals(taskName) && i % 2 != 0) {
				printObj.handleOdd(i);
			}
		}

	}

}

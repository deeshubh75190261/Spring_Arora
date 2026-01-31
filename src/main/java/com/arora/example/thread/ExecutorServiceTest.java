package com.arora.example.thread;

public class ExecutorServiceTest implements Runnable {

	private String taskName = "";
	int index;
	int max;

	ExecutorServiceTest(String taskName, int index, int max) {

		this.taskName = taskName;
		this.index = index;
		this.max = max;

	}

	@Override
	public void run() {

		if ("Even".equals(taskName)) {

			for (int i = 0; i <= max; i++) {

				if (i % 2 == 0) {
					System.out.println("Thread " + Thread.currentThread().getName() + "  " + taskName + " : " + i);
				}

			}

		} else if ("Odd".equals(taskName)) {

			for (int i = 0; i <= max; i++) {

				if (i % 2 != 0) {
					System.out.println("Thread " + Thread.currentThread().getName() + "  " + taskName + " : " + i);
				}
			}
		}

	}

}

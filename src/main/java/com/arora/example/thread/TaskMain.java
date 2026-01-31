package com.arora.example.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TaskMain {

	public static void main(String[] args) {

		System.out.println("***************************");
		System.out.println("*** Task Even Odd Start ***");
		System.out.println("***************************");

		ExecutorService executor = Executors.newFixedThreadPool(2);
		int max = 10;
		Print printObj = new Print();

		while (true) {

			for (int i = 0; i < 2; i++) {
				Runnable worker = new TaskEvenOdd(getTask(i), max, printObj);
				executor.execute(worker);
			}

			executor.shutdown();

			try {

				if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
					executor.shutdownNow();
				}

			} catch (InterruptedException e) {
				System.out.println(e);
				executor.shutdownNow();
			}

			try {
				Thread.sleep(5000);
				System.out.println();
			} catch (InterruptedException e) {
				System.out.println(e);
			}

			executor = Executors.newFixedThreadPool(2);

		}

	}

	private static String getTask(int index) {

		String[] task = { "even", "odd" };
		return task[index];
	}

}

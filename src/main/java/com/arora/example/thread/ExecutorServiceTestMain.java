package com.arora.example.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceTestMain {

	public static void main(String[] args) {

		System.out.println("***************************");
		System.out.println("** Welcome Execiutor Service ** ");
		System.out.println("***************************");

		ExecutorService executor = Executors.newFixedThreadPool(2);
		int max = 10;
		String taskName = "";

		while (true) {

			try {

				for (int i = 0; i < 2; i++) {
					taskName = getTaskName(i);

					Runnable worker = new ExecutorServiceTest(taskName, i, max);
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

				if (executor.isShutdown() || executor.isTerminated()) {
					executor = Executors.newFixedThreadPool(2);
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

	}

	private static String getTaskName(int i) {

		String[] strArray = { "Even", "Odd" };

		return strArray[i];
	}

}

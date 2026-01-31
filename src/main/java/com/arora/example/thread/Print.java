package com.arora.example.thread;

public class Print {

	private boolean isOddTurn = true;

	synchronized void handleEven(int number) {

		while (isOddTurn) {
			try {

				wait();

			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}

		System.out.println("Thread Even : " + number);
		isOddTurn = true;
		notifyAll();
	}

	synchronized void handleOdd(int number) {

		while (!isOddTurn) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e);
			}

		}

		System.out.println("Thread Odd : " + number);
		isOddTurn = false;
		notifyAll();

	}

}

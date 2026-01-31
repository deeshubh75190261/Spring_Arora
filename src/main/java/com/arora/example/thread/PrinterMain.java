package com.arora.example.thread;

public class PrinterMain {

	public static void main(String[] args) throws InterruptedException {

		Print printObj = new Print();
		int max = 5;

		Thread t1 = new Thread(new TaskEvenOdd("even", max, printObj));
		Thread t2 = new Thread(new TaskEvenOdd("odd", max, printObj));

		t1.start();
		t2.start();

	}

}

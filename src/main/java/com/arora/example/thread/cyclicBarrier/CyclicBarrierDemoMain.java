package com.arora.example.thread.cyclicBarrier;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemoMain {

	public static void main(String[] args) {

		List<Integer> numbers = new CopyOnWriteArrayList<>();

		CyclicBarrier barrier = new CyclicBarrier(2, new FinalTask("Final Thread", numbers));

		Thread t1 = new Thread(new Task1("First Thread", numbers, barrier));
		Thread t2 = new Thread(new Task2("Second Thread", numbers, barrier));
		
		t1.start();
		t2.start();
	}

}

package com.arora.example.thread.cyclicBarrier;

import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Task1 implements Runnable {

	String name;
	List<Integer> numbers;
	CyclicBarrier barrier;

	public Task1(String name, List<Integer> numbers, CyclicBarrier barrier) {
		super();
		this.name = name;
		this.numbers = numbers;
		this.barrier = barrier;
	}

	@Override
	public void run() {

		System.out.println(name + " is running");

		for (int i = 1; i <= 5; i++) {
			numbers.add(i);
		}

		try {

			barrier.await();

		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println(name + " has crossed the barrier");
	}

}

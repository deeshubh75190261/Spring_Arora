package com.arora.example.thread.cyclicBarrier;

import java.util.List;

public class FinalTask implements Runnable {

	String name;
	List<Integer> numbers;

	public FinalTask(String name, List<Integer> numbers) {
		super();
		this.name = name;
		this.numbers = numbers;
	}

	@Override
	public void run() {

		System.out.println(name + " is running");

		try {
			int sum = 0;
			for (Integer i : numbers) {
				sum += i;
			}
			System.out.println("Sum of first 10 natural numbers : " + sum);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

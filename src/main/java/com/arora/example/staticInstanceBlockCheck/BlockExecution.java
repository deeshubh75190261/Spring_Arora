package com.arora.example.staticInstanceBlockCheck;

public class BlockExecution {

	static {
		System.out.println("Called static block");
	}

	{
		System.out.println("Called instatnce block");
	}

	BlockExecution() {
		System.out.println("Constructor called");
	}

	public static void main(String[] args) {

		System.out.println("Called main method");

		BlockExecution obj = new BlockExecution();

		BlockExecution obj1 = new BlockExecution();
	}

}

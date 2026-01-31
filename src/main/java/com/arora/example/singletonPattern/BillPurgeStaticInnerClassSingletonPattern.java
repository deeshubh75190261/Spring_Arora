package com.arora.example.singletonPattern;

public class BillPurgeStaticInnerClassSingletonPattern {

	private BillPurgeStaticInnerClassSingletonPattern() {
	}

	private static class SingletonStaticInner {

		private static final BillPurgeStaticInnerClassSingletonPattern insatnce = new BillPurgeStaticInnerClassSingletonPattern();
	}

	public static BillPurgeStaticInnerClassSingletonPattern getInstance() {

		return SingletonStaticInner.insatnce;
	}

	public static void main(String[] args) {

		BillPurgeStaticInnerClassSingletonPattern obj = BillPurgeStaticInnerClassSingletonPattern.getInstance();

		System.out.println("BillPurgeStaticInnerClassSingletonPattern object : " + obj);

	}
}

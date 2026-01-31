package com.arora.example.java8Interface.defaultMethod;

public interface I1 {
	
	public static final int a=10;
	int b=20;
	
	public abstract void disp1();
	
	 void disp2();

	 default void disp3()
	 {

	 System.out.println("Default Method");
	 }

	 static void disp4()
	 {
	 System.out.println("Static Method");

	 }

}



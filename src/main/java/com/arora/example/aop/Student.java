package com.arora.example.aop;

import org.springframework.stereotype.Component;

@Component
public class Student {

	public int studySomething() {
		System.out.println("I am in school and studing right now...Student!!");
		return 0;
	}

}

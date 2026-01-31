package com.arora.example.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {

		System.out.println("\n****************************");

		System.out.println("Welcome In AOP Example");

		System.out.println("****************************");

		@SuppressWarnings("resource")
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Student student = context.getBean("student", Student.class);

		student.studySomething();

		Employee employee = context.getBean("employee", Employee.class);

		employee.studyAnything();

	}

}

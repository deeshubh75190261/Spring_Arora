package com.arora.example.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Human {

//	@After("execution(public void study())")
//	@After("execution(public void com.arora.example.aop.Student.study())")
//	@After("execution(public * study*())")

	@After("myPointCuts()")
	public void wakeUp() {
		System.out.println("Good Morning...!!");
	}

//	@Before("execution(public * study*())")
	@Before("myPointCuts()")
	public void sleep() {
		System.out.println("Good Night.........!!!");
	}

	@Pointcut("execution(public * study*())")
	public void myPointCuts() {

	}

}

package com.example.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect{
	
	
	//advice
	
	//cross - cutting logic
	
	//before payment 
	@Before("exeuction (*com.example.aop.service.PaymentService.Payment())")
	public void beforePayment() throws InterruptedException{
		System.out.println("Authention Starting...........");
		Thread.sleep(5000);
		System.out.println("Payment Started");
	}
	
	
	@After("exeuction (*com.example.aop.service.PaymentService.PaymentService())")
	public void afterPayment() throws InterruptedException{
		Thread.sleep(5000);
		System.out.println("Payment sucessfull....");
	}
}

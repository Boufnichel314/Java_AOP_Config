package com.main.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopLoggingAspect {

	@Before("execution(public void addAccount())")
	public void befforeAddAccount() {
		System.out.println("--> in the AopLoggingAspect class : do this before addAccount methode !");
	}
}

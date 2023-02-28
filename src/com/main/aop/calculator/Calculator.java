package com.main.aop.calculator;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

	public void add() {
		System.out.println("--> in the Calculator class : adding two numbers !");
			}
}

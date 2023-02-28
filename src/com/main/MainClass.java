package com.main;

import java.util.ArrayList;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.main.aop.AopConfig;
import com.main.aop.calculator.Calculator;
import com.main.aop.dao.AccountDAO;

public class MainClass {

	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AopConfig.class);
		///////////////////
		AccountDAO myAccount = context.getBean("accountDAO", AccountDAO.class);
		Calculator calculator = context.getBean("calculator", Calculator.class);
		///////////////////
		myAccount.addAccount();
		myAccount.randomMethod();
		myAccount.addListUser(new Calculator());
		System.out.println("This is some logical codes !");
		calculator.add();
		///////////////////
		context.close();
	}
}

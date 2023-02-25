package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.main.aop.AopConfig;
import com.main.aop.dao.AccountDAO;

public class MainClass {

	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AopConfig.class);
		///////////////////
		AccountDAO myAccount = context.getBean("accountDAO", AccountDAO.class);
		///////////////////
		myAccount.randomMethod();
		myAccount.addAccount();
		///////////////////
		context.close();
	}
}

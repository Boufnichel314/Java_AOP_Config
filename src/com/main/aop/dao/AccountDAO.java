package com.main.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	
	public void addAccount() {
		System.out.println("--> in the AccountDAO class : saving a new account !");
	}
	public void randomMethod() {
		System.out.println("A random method !");
	}
}

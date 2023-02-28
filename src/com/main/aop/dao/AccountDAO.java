package com.main.aop.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.main.aop.calculator.Calculator;

@Component
public class AccountDAO {
	
	public void addAccount() {
		System.out.println("--> in the AccountDAO class : saving a new account !");
	}
	public void addListUser(Calculator calc) {
		System.out.println("--> in the AccountDAO class : saving a list of accounts !");
	}
	public void randomMethod() {
		System.out.println("A random method hh !");
	}
}

package com.codes27May;

public class Methods_1 {
	public double principal = 0;
	private double rate = 3.5;
	
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	
	public void amount(int time) {
		double total = (double) (principal + (principal*time*rate)/100);
		System.out.println("Predicted total after " + time +" years = " + total);
	}
	
	public void deposit(double depo) {
		principal = principal+depo;
	}
	
	public void withdraw(double with) {
		principal = principal - with;
	}
	
	public void display() {
		System.out.println("Balance = " + principal);
	}
	
	
	// void method -> it does not return anything
	// return method -> it returns

}

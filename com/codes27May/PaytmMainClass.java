package com.codes27May;

public class PaytmMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PayTM p = new PayTM();
		
		p.displayBalance();
		System.out.println("-------------------------------------");
		p.deposit();
		
		p.displayBalance();
		
		System.out.println("-------------------------------------");
		p.send();
		p.displayBalance();
		
	}

}

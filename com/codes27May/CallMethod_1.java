package com.codes27May;


public class CallMethod_1 {

	public static void main(String[] args) {
		Methods_1 m = new Methods_1();
		
		m.setPrincipal(1000);
		m.display();
		m.amount(5);

		
		System.out.println();
		m.deposit(1500);
		m.display();
		m.amount(5);

		
		System.out.println();
		m.withdraw(2000);
		m.display();
		m.amount(5);


}
}
package com.codes27May;

public class Puri {
	
	public double puriQuantity = 2;
	public double torkariPlate = 1;
	public double pricePuri = 4;
	public double priceTorkari = 2;
	private double sumBill = 0;
	
	public void order() {
		sumBill = puriQuantity*pricePuri+torkariPlate* priceTorkari;
	}
	
	public  void TotalBill() {
		System.out.println("The total price is  " + sumBill);
	}
	public void takePuri(double no) {
		sumBill = sumBill + pricePuri*no;
		
	}public void takeTorkari(double torkNo) {
		sumBill = sumBill + priceTorkari*torkNo;
	}
	
	
	/*
	 * 1. Create a class Puri
	 * 2. Add some properties like : puriQuantity, torkariPlate
	 * 3. By default, one order will have 2 puri and 1 plate of torkari
	 * 4. Price of 1 puri is 4 rupees and price of 1 plate of torkari is 2 rupees
	 * 5. Hence default price is 10rs
	 * 6. If the customer takes extra puri then total price of additional puris will be added
	 * 7. If customer takes extra torkari, then total price of torkari plate will be added
	 * 8. There will be a function called totalBill(), which will print the total bill
	 * 9. Assume any additional property or function if required
	 * */
	
	
}

package com.codes27May;

import java.util.Scanner;

public class PayTM {

	/* WHOLE CODE SHOULD HAVE ONLY ONE VARIABLE --- private double balance = 0;
	 * 1. This is a backend code of paytm
	 * PROPERTY : BALANCE
	 * 2. deposit(), send(), displayBalance()
	 * 3. if we deposit(), it will ask for deposit methods : 1. debit/credit card, 2. upi
	 * 4. if debit/credit card option is choosen : it will ask to enter, amount, credit/debit card number and cvv
	 * (if we enter debit/credit card number < 16 digits or > 16 digits or if cvv is less than 3 or greater than 3 it will through error)
	 * 5. if we choose  upi, it will ask for the amount and upi address
	 * 6. after successful transaction it will show "xxxx amount deposited"
	 * 
	 * 7. if send option is chosen, it will ask for where to send? : 1. paytm user, 2. bank account or 3. upi id
	 * 8. If paytm user chosen, it will ask for amount and paytm number
	 * 9. if bank account chosen, it will as for amount, ifsc, account number, re enter account number, and benificiary name
	 * (account number and reenter account number should be same. otherwise it will throw error)
	 * 10. if upi id is chosen, it will ask for amount and upi id.
	 * 11. after successful transaction it will show "xxxx amound sent successfully"
	 * 11. ******SEND AMOUNT SHOULD BE LESS THAN OR EQUAL TO BALANCE. IF SEND AMOUNT IS GREATER THAN BALANCE, IT WILL THROW "INSUFFICIENT BALANCE*******
	 *
	 * */
	public double  balance = 0;
	
	Scanner sc = new Scanner(System.in);
	
	public void deposit() {
		double amount;
		String creditCard;
		String cvv;
		String upiId;
		
		System.out.println("How do you want to deposit money?\n1.Debit/Credit card\n2.UPI");
		System.out.print(">> ");
		int options = sc.nextInt();
		switch(options) {
		case 1:
			System.out.print("Enter the amount = ");
			amount = sc.nextDouble();
			System.out.print("Debit/Credit card number = ");
			creditCard = sc.next();
			System.out.print("CVV = ");
			cvv = sc.next();
			if(creditCard.length() == 16 && cvv.length() == 3 ) {
				balance = balance+amount;
				System.out.println(amount + " deposited successfully");
			} else {
				System.out.println("Credit/Debit card number or cvv is invalid");
			}
		break;
		case 2:
			System.out.print("Enter the amount = ");
			amount = sc.nextDouble();
			System.out.print("Enter UPI Id: ");
			upiId =  sc.next();
			balance = balance+amount;
			System.out.println(amount + " deposited successfully");
		break;
		default:
			System.out.println("Invalid option");
		break;
		}
	} 
	
	public void send() {
		String paytmNo;
		String bankAcc, reBankAcc;
		String upiId;
		String ifsc;
		String ben;
		double amount;
		System.out.println("How do you want to send money?\n1.paytmNo\n2.bankAcc\n3.upiId");
		System.out.print(">> ");
		int options = sc.nextInt();
		if(options == 1) {
			System.out.print("Enter amount: ");
			amount = sc.nextDouble();
			System.out.print("Enter the paytm no: ");
			paytmNo = sc.next();
			if(amount<=balance) {
				balance = balance-amount;
				System.out.println(amount + " successfully sent");
			} else {
				System.out.println("Insufficient balance");
			}
		}
		else if(options == 2) {
			System.out.println("Enter amount: ");
			amount = sc.nextDouble();
			System.out.print("Enter benificiary:  ");
			ben = sc.next();
			System.out.print("Enter IFSC no:  ");
			ifsc = sc.next();
			System.out.print("Enter bank account number: ");
			bankAcc = sc.next();
			System.out.print("Re-enter your bank account: ");
			reBankAcc = sc.next();
			if(bankAcc.equals(reBankAcc)) {
				if(amount<=balance) {
					balance = balance-amount;
					System.out.println(amount + " successfully sent");
				} else {
					System.out.print("Insufficient balance");
				}
			}else {
				System.out.println("Bank account number did not match");
			}
			
			
		}else if(options == 3) {

			System.out.print("Enter the amount = ");
			amount = sc.nextDouble();
			System.out.print("Enter UPI Id: ");
			upiId =  sc.next();
			balance = balance-amount;
			if(amount<=balance) {
				balance = balance-amount;
				System.out.println(amount + " successfully sent");
			} else {
				System.out.print("Insufficient balance");
			}
		}
		
	}
	public void displayBalance() {
		System.out.println("Current balance is: "+balance);
	}
	
}
	
	


package com.codes27May;

import java.util.ArrayList;

public class CallEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> arr = new ArrayList<Employee>();
		
		arr.add(new Employee("101","Shayan Saha",37400));
		arr.add(new Employee("102","Diptanu Debnath",37500));
		arr.add(new Employee("104","Sagardip Karmakar",38400));
		arr.add(new Employee("105","Sagar Bhattacharjee",39450));
		
		for(Employee e:arr ) {
			e.display();
			System.out.println();
		}

	}

}

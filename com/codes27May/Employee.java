package com.codes27May;

public class Employee {
	private String id;
	private String name;
	private double salary;
	
	public Employee(String id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("Employee ID : " + id + "\n"+"Name : "+name+"\n"+"Salary : "+salary);
	}
}


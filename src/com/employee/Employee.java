package com.employee;

public class Employee {
	int isFullTime;
	double empCheck;
	
	Employee(){
		isFullTime = 1;
	}

	public void isPresent() {
		empCheck = Math.floor(Math.random()*10%2);
		if( empCheck == isFullTime)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
	}
	
}

package com.employee;

public class Employee {
	int isFullTime;
	int wagePerHour;
	int empWage;
	int empHrs;
	double empCheck;

	Employee() {
		isFullTime = 1;
		wagePerHour = 20;
		empWage = 0;
		empHrs = 0;
	}

	public void isPresent() {
		empCheck = Math.floor(Math.random() * 10 % 2);
		if (empCheck == isFullTime) {
			System.out.println("Employee is present");
			empHrs = 8;
		}
		else {
			System.out.println("Employee is absent");
			empHrs = 4;
		}
		empWage = empHrs * wagePerHour; 
		System.out.println("Employee wage "+empWage);
	}

}

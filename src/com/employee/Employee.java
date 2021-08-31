package com.employee;

public class Employee {
	int isFullTime;
	int isPartTime;
	int wagePerHour;
	int empWage;
	int empHrs;
	double empCheck;

	Employee() {
		isFullTime = 2;
		isPartTime = 1;
		wagePerHour = 20;
		empWage = 0;
		empHrs = 0;
	}

	public void isPresent() {
		empCheck = Math.floor(Math.random() * 10 % 3);
		if (empCheck == isFullTime) {
			System.out.println("Employee is full time");
			empHrs = 8;
		} else if(empCheck == isPartTime) {
			System.out.println("Employee is part time");
			empHrs = 4;
		}
		else {
			System.out.println("Employee is absent");
		}
		empWage = empHrs * wagePerHour;
		System.out.println("Employee wage " + empWage);
	}

}

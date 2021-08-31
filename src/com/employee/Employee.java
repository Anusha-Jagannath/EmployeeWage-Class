package com.employee;

public class Employee {
	int isFullTime;
	int isPartTime;
	int wagePerHour;
	int empWage;
	int empHrs;
	static int empCheck;

	Employee() {
		isFullTime = 2;
		isPartTime = 1;
		wagePerHour = 20;
		empWage = 0;
		empHrs = 0;
	}

	public void isPresent() {
		empCheck = (int) Math.floor(Math.random() * 10 % 3);
		switch (empCheck) {
		case 2:
			System.out.println("Employee is full time");
			empHrs = 8;
			break;
		case 1:
			System.out.println("Employee is part time");
			empHrs = 4;
			break;
		default:
			System.out.println("Employee is absent");
		}
		empWage = empHrs * wagePerHour;
		System.out.println("Employee wage " + empWage);
	}

}

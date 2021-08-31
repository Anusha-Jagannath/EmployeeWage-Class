package com.employee;

public class Employee {
	private int isFullTime;
	private int isPartTime;
	private int wagePerHour;
	private int empWage;
	private int empHrs;
	private int noOfWorkingDays;
	private int totalWage;
	private static int empCheck;

	Employee() {
		isFullTime = 2;
		isPartTime = 1;
		wagePerHour = 20;
		noOfWorkingDays = 20;
		empWage = 0;
		empHrs = 0;
		totalWage = 0;
	}

	public void isPresent() {
		for (int day = 0; day < noOfWorkingDays; day++) {
			empCheck = (int) Math.floor(Math.random() * 10 % 3);
			switch (empCheck) {
			case 2: empHrs = 8;
					break;
			case 1: empHrs = 4;
					break;
			default: empHrs = 0;

			}
			empWage = empHrs * wagePerHour;
			totalWage += empWage;
		}
		System.out.println("Total Employee wage " + totalWage);
	}

}

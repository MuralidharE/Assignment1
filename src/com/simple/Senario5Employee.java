package com.simple;

import java.util.Scanner;

public class Senario5Employee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary: ");
		double sal = sc.nextDouble();
		System.out.println("Enter Experience: ");
		double exp = sc.nextDouble();
		double bonus = 0;

		if (exp >= 10) {
			bonus = sal * (20.0 / 100.0);
		} else if (exp >= 1 && exp < 5) {
			bonus = sal * (5.0 / 100.0);
		} else if (exp >= 5 && exp < 10) {
			bonus = sal * (10.0 / 100.0);
		} else {
			bonus = 0;
		}
		double totsal = sal + bonus;
		System.out.println("Salary: " + sal);
		System.out.println("Salary After bonus: " + totsal);
		sc.close();
	}
}

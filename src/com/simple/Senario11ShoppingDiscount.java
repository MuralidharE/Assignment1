package com.simple;

import java.util.Scanner;

public class Senario11ShoppingDiscount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount: ");
		double amount = sc.nextDouble();
		double disc = 0;

		if (amount >= 5000) {
			disc = amount * (30.0 / 100);
		} else if (amount >= 3000 && amount < 5000) {
			disc = amount * (20.0 / 100);
		} else if (amount >= 1000 && amount < 3000) {
			disc = amount * (10.0 / 100);
		} else {
			disc = 0;
		}
		double finalAmount = amount - disc;
		System.out.println("AMount Before Discount: " + amount);
		System.out.println("AMount After Discount: " + finalAmount);
		sc.close();
	}
}

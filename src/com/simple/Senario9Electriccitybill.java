package com.simple;

import java.util.Scanner;

public class Senario9Electriccitybill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter units: ");
		int units = sc.nextInt();
		double bill = 0;

		if (units <= 100) {
			bill = units * 2;
		} else if (units <= 300) {
			bill = (100 * 2) + ((units - 100) * 3);
		} else {
			bill = (100 * 2) + (200 * 3) + ((units - 300) * 5);
		}
		System.out.println("Total Bill Amount: " + bill);
		sc.close();
	}
}

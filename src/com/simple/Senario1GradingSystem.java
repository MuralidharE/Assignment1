package com.simple;

import java.util.Scanner;

public class Senario1GradingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter student marks: ");
		double marks = sc.nextDouble();

		if (marks >= 90) {
			System.out.println("A");
		} else if (marks >= 75 && marks <= 89) {
			System.out.println("B");
		} else if (marks >= 50 && marks <= 74) {
			System.out.println("c");
		} else {
			System.out.println("Fail");
		}
		sc.close();

	}

}

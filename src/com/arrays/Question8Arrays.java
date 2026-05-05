package com.arrays;

import java.util.Scanner;

public class Question8Arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array1: ");
		int n = sc.nextInt();
		int[] array1 = new int[n];

		System.out.println("Enter the Elements of Array1: ");
		for (int i = 0; i < n; i++) {
			array1[i] = sc.nextInt();
		}

		boolean isPalindrome = true;
		for (int i = 0; i < n / 2; i++) {
			if (array1[i] != array1[n - 1 - i]) {
				isPalindrome = false;
				break;
			}
		}
		if (isPalindrome == true) {
			System.out.println("Is PLaindrome Array");
		} else {
			System.out.println("Is NOT PLaindrome Array");
		}
		sc.close();
	}
}

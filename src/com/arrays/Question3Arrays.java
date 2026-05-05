package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Question3Arrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		if (n == 1) {
			System.out.println("Need more Elements to calculate the Second Smallest");
		} else {
			System.out.println("Second Smallest NUmber is: " + arr[1]);
		}

		sc.close();
	}
}
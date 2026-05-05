package com.arrays;

import java.util.Scanner;

public class Question2Arrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int position = 0;
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (i >= max) {
				max = arr[i];
				position = i;
			}
		}

		System.out.println("Max Element is: " + max);
		System.out.println("Position of that element is: " + position);
		sc.close();
	}
}
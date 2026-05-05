package com.arrays;

import java.util.Scanner;


public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter element to be searched: ");
		int target = sc.nextInt();
		boolean found = false;
		for (int i = 0; i < n; i++) {
			if (arr[i] == target) {
				System.out.println("Element found at: " + i);
				found = true;
				break;
			}
		}
		if (found == false) {
			System.out.println(" element not found:");
		}
		sc.close();
	}

}
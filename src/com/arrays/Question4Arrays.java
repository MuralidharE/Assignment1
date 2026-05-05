package com.arrays;

import java.util.Scanner;

public class Question4Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int evenCount = 0;
		int oddCount = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				evenCount += 1;
			} else {
				oddCount += 1;
			}
		}
		System.out.println("Even count: " + evenCount);
		System.out.println("Odd count: " + oddCount);
		sc.close();
	}

}
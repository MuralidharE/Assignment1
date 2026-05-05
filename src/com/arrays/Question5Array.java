package com.arrays;

import java.util.Scanner;

public class Question5Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of Items: ");
        int n = sc.nextInt();
        int []arr = new int[n];
 
        System.out.println("Enter the Prices of Items: ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("-------After discount--------------");
        double newPrice = 0;
        for(int i = 0;i<n;i++){
            newPrice = arr[i] - (arr[i]*(10.0/100));
            System.out.println("Item " + (i + 1) + ": " + newPrice);
        }
		sc.close();
	}
}
package com.arrays;

import java.util.Scanner;

public class Question6Array {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the size of Array1: ");
	        int n = sc.nextInt();
	        int []array1 = new int[n];
	 
	        System.out.println("Enter the Elements of Array1: ");
	        for(int i = 0;i<n;i++){
	            array1[i] = sc.nextInt();
	        }
	 
	        System.out.println("Enter the size of Array2: ");
	        int n1 = sc.nextInt();
	        int []array2 = new int[n1];
	 
	        System.out.println("Enter the Elements of Array2: ");
	        for(int i = 0;i<n1;i++){
	            array2[i] = sc.nextInt();
	        }
	 
	        for(int i = 0;i<array1.length;i++){
	            for(int j = 0;j<array2.length;j++){
	                if(array1[i] == array2[j]){
	                    System.out.print(array1[i] + " ");
	                }
	            }
	        }
		sc.close();
	}
}
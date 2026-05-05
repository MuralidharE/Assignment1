package com.arrays;
 
import java.util.Scanner;
 
public class Question9Array {
 
	public static void main(String[] args) {
 
		System.out.println("Enter the size: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the ELements: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array in Reverse order");
		for (int j = a.length - 1; j >= 0; j--) {
			System.out.print(a[j]+ " ");
		}
		sc.close();
	}
 
}
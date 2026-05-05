package com.arrays;
import java.util.Scanner;

public class Question7Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array1: ");
		int n = sc.nextInt();
		int[] array1 = new int[n];

		System.out.println("Enter the Elements of Array1: ");
		for (int i = 0; i < n; i++) {
			array1[i] = sc.nextInt();
		}
		int sum = 0;
		int highest = array1[0];

		for (int i = 0; i < array1.length; i++) {
			sum = sum + array1[i];
			if (array1[i] > highest) {
				highest = array1[i];
			}
		}
		double avg = (double) sum / array1.length;
		int count = 0;
		for(int i = 0;i<array1.length;i++) {
			if(array1[i]>=avg) {
				count+=1;
			}
		}
		System.out.println("Average Marks: " + avg);
		System.out.println("Highest Marks: " + highest);
		System.out.println("Total Number of students Scored More than Average: " + count);
		sc.close();
	}

}
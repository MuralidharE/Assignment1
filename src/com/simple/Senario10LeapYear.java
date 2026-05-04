package com.simple;

import java.util.Scanner;

public class Senario10LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int leap = sc.nextInt();
		
		if(leap % 4 == 0) {
			if(leap % 100 == 0) {
				if(leap % 400 == 0) {
					System.out.println("The Year is Leap Year: " + leap);
				}else {
					System.out.println("The Year is Not Leap Year: " + leap);
				}
			}else {
				System.out.println("The Year is Not Leap Year: " + leap);
			}
		}else {
			System.out.println("The Year is Not Leap Year: " + leap);
		}
		sc.close();
	}

}

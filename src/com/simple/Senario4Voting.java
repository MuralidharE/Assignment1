package com.simple;

import java.util.Scanner;
public class Senario4Voting {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		
		int age = sc.nextInt();
		
 
		 if(age < 0 || age > 100) {
		            System.out.println("Invalid age");
 
		 } else if(age >= 18 ) {
			System.out.println("Eligible");
		}
		else {
			System.out.println("Not eligible");
		}
		sc.close();
	}
 
}

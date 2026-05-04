package com.simple;

import java.util.Scanner;

public class Senario3Largest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number A: ");
		int a= sc.nextInt();
		System.out.println("Enter Number B: ");
		int b= sc.nextInt();
		System.out.println("Enter Number C: ");
		int c= sc.nextInt();

		if(a>b && a>c) {
			System.out.println("Largest Number: " + a);
		}
		else if(b>a && b>c) {
			System.out.println("Largest Number: " + b);
		}
		else{
			System.out.println("Largest Number: " + c);
		}
		sc.close();
	}

}

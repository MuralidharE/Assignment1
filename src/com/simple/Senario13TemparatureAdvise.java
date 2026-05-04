package com.simple;

import java.util.Scanner;

public class Senario13TemparatureAdvise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temperature: ");
		int temperature = sc.nextInt();
		
		if(temperature < 15) {
			System.out.println("Cold");
		}else if(temperature > 15 && temperature <= 24) {
			System.out.println("Cool");
		}else if(temperature >= 25 && temperature <= 35) {
			System.out.println("warm");
		}else {
			System.out.println("Very hot");
		}
		
		sc.close();
	}
}

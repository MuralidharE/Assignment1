package com.simple;

import java.util.Scanner;

public class Senario7SimpleCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number A: ");
		int a = sc.nextInt();
		System.out.println("Enter the Number B: ");
		int b = sc.nextInt();
		System.out.println("Enter the Symbol(+, -, *, %, /): ");
		String symb = sc.next();
		switch (symb) {
		case "+": {
			System.out.println("Addition of two Numbers: "+ (a+b));
			break;
		}
		case "-": {
			System.out.println("Subraction of two Numbers: "+ (a-b));
			break;
		}
		case "*": {
			System.out.println("Multiplication of two Numbers: "+ (a*b));
			break;

		}
		case "/": {
			System.out.println("Division of two Numbers: "+ (a/b));
			break;

		}
		case "%": {
			System.out.println("Modulus of two Numbers: "+ (a%b));
			break;

		}
		default:
			System.out.println("Error: Please enter valid Symbol!!");
		}
		sc.close();
	}
}

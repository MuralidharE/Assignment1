package com.simple;

import java.util.Scanner;

public class Senario12CharacterTypeCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char ch = sc.next().charAt(0);

		if (ch >= 'a' && ch <= 'z') {
			System.out.println(ch + ": is an Alphabet");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println(ch + ": is an Digit");
		} else {
			System.out.println(ch + ": is a Special Symbol");
		}
		sc.close();
	}
}

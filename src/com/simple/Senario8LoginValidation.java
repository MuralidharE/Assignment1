package com.simple;

import java.util.Scanner;

public class Senario8LoginValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the UserName: ");
		String userName = sc.next();
		System.out.println("Enter the Password: ");
		int password = sc.nextInt();
		
		if(userName.equals("admin")) {
			if(password == 1234) {
				System.out.println("Login Successfull");
			}else {
				System.out.println("login Unsucessfull");
			}
		}else {
			System.out.println("Login Unsuccessfull");
		}
		sc.close();
	}

}

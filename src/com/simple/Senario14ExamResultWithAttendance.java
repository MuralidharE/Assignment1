package com.simple;

import java.util.Scanner;

public class Senario14ExamResultWithAttendance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks: ");
		int marks = sc.nextInt();
		System.out.println("Enter Attandance: ");
		int attend = sc.nextInt();
		if (marks >= 50) {
			if (attend >= 75) {
				System.out.println("Student Passed");
			} else {
				System.out.println("Student Fail (Attandance issue)");
			}
		} else {
			System.out.println("Student Fail (Marks issue)");
		}
		sc.close();
	}
}

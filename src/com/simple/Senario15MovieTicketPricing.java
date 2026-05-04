package com.simple;

import java.util.Scanner;

public class Senario15MovieTicketPricing {
	class Main {
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter age: ");
	        int age = sc.nextInt();
	        int price = 0;
	 
	        if(age> 60){
	            price = 120;
	        }else if(age >= 12 && age<=60){
	            price = 200;
	        }else{
	            price = 100;
	        }
	        System.out.println("Ticket price: " + price);
	        sc.close();
	    }
	}

}

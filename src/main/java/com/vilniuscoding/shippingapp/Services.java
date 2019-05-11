package com.vilniuscoding.shippingapp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Services {
	
	public void chooseService() {
		System.out.println("Please select service - Express or Economy: ");
		Scanner input = new Scanner(System.in);
		String userChoice = input.nextLine(); 
		input.close();
		
		// use while to get back if exceptions.
		if (userChoice.equals("Express")) {
			System.out.println("Service: Express");
		} else if (userChoice.equals("Express")) {
			System.out.println("Service: Economy");
		} else {
			throw new InputMismatchException("Incorrect imput");
		}
	}
	
}

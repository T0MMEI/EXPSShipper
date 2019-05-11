package com.vilniuscoding.shippingapp;

public class Console {

	public void welcome() {

		for (int i = 0; i < 2; i++) {
			System.out.println("************************************************");
		}
		System.out.println("\n" + "             WELCOME TO EXPS SHIPPER" + "\n");
		for (int i = 0; i < 2; i++) {
			System.out.println("************************************************");
		}

		System.out.println("Please choose: " + "Add Consignment / " + "View Consignments / " + "Print Docs");

	}

}

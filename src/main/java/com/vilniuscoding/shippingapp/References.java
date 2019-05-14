package com.vilniuscoding.shippingapp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class References {

	private String custRef;
	private String Service;
	
	public String getCustRef() {
		return custRef;
	}

	public String getService() {
		return Service;
	}

	public void setCustRef(String custRef) {
		System.out.println("Please enter Your shipment reference");
		Scanner refInput = new Scanner(System.in);
		this.custRef = refInput.nextLine();
	}

	public void setService(String service) {
		System.out.println("Please enter your desired service: Express or Economy or Cheap-nogood-slow");
		Scanner servInput = new Scanner(System.in);
		this.Service = servInput.nextLine();
	}

	public String awbGenerator() {
		String awb;
		String prefix = "EXPS-";
		int random = 10000 + new Random().nextInt(90000);
		awb = prefix + random;
		return awb;
	}

	public String docDate() {
		DateFormat currentDate = new SimpleDateFormat("yyyy-MM-dd");
		String date = currentDate.format(new Date());
		System.out.println(date);
		return date;
	}
	
	/*
	public String custRef() {
		System.out.println("Customer reference: ?");
		Scanner inputRef = new Scanner(System.in);
		String custRef = inputRef.nextLine();
		return custRef;

	}

	public void service() {
		Scanner inputService = new Scanner(System.in);
		System.out.println("Please choose desired service - Express or Economy");
		String serviceChoice = inputService.nextLine();

		if (serviceChoice.equals("Express")) {
			System.out.println("Express");
		}
		if (serviceChoice.equalsIgnoreCase("Economy")) {
			System.out.println("Economy");
		}
	}
	*/
	
	public void welcome() {

		for (int i = 0; i < 2; i++) {
			System.out.println("************************************************");
		}
		System.out.println("\n" + "             WELCOME TO EXPS SHIPPER" + "\n");
		for (int i = 0; i < 2; i++) {
			System.out.println("************************************************");
		}

	}

}

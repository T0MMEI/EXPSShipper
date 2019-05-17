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
	private String service;
		
	
	public String getCustRef() {
		System.out.println(custRef);
		return custRef;
	}

	public String getService() {
		System.out.println(service);
		return service;
	}

	public void setCustRef() {
		System.out.println("Please enter Your shipment reference");
		Scanner refInput = new Scanner(System.in);
		this.custRef = refInput.nextLine();
	}

	public void setService() {
		System.out.println("Please enter direction: International or Domestic");
		Scanner servInput = new Scanner(System.in);
		this.service = servInput.nextLine();
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
		return date;
	}
	
	public void welcome() {
		System.out.println(" >>> ---  WELCOME TO SHIPPER" + "\n" + "******************************************************************************************************************************************************************************************");
		System.out.println("WARNING MESSAGE: Dear valuable customer please bear in mind that You are fully responsible for the quality of entered data quality" + "******************************************************************************************************************************************************************************************");
	}
	
	public void menu() {
		System.out.println("Menu: " + "1. Add shipment " + "2. View List " + "3. Generate Waybill");
	}
}

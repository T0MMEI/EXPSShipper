package com.vilniuscoding.shippingapp;

import java.util.Scanner;

public class Shipper {

	private String shippersName;
	private String shippersAddress;
	private String shippersCity;
	private String shippersCountry;
	private String shippersEntity;
	private String shippersPhoNum;

	Scanner inputShipper = new Scanner(System.in);

	public String getShippersName() {
		return shippersName;
	}

	public String getShippersAddress() {
		return shippersAddress;
	}

	public String getShippersCity() {
		return shippersCity;
	}

	public String getShippersCountry() {
		return shippersCountry;
	}

	public String getShippersEntity() {
		return shippersEntity;
	}

	public String getShippersPhoNum() {
		return shippersPhoNum;
	}

	public void setShippersName(String shippersName) {
		print("Please enter senders name:");
		this.shippersName = inputShipper.nextLine();
	}

	public void setShippersAddress(String shippersAddress) {
		print("Please enter senders address:");
		this.shippersAddress = inputShipper.nextLine();
	}

	public void setShippersCity(String shippersCity) {
		print("Please enter senders city:");
		this.shippersCity = inputShipper.nextLine();
	}

	public void setShippersCountry(String shippersCountry) {
		print("Please enter senders country:");
		this.shippersCountry = inputShipper.nextLine();
	}

	public void setShippersEntity(String shippersEntity) {
		print("Please enter contact persons name & surname:");
		this.shippersEntity = inputShipper.nextLine();
	}

	public void setShippersPhoNum(String shippersPhoNum) {
		print("Please enter senders phone number:");
		this.shippersPhoNum = inputShipper.nextLine();
	}
	// SCENNER IS OPEN!!!
	public void displayShippersInfo() {
		print(" *** SENDERS DETAILS: " + "\n" 
				+ "COMPANY NAME: " + this.shippersName + "\n" 
				+ "ADDRESS: " + this.shippersAddress + "\n" 
				+ "CITY: " + this.shippersCity + "\n" 
				+ "COUNTRY: " + this.shippersCountry + "\n" 
				+ "NAME & SURNAME: " + this.shippersEntity + "\n" 
				+ "PHONE NUMER: " + this.shippersPhoNum);
	}

	private static void print(String text) {
		System.out.println(text);
	}

}

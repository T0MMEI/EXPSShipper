package com.vilniuscoding.shippingapp;

import java.util.Scanner;

public class Shipper {

	private int accNo;
	private String shippersName;
	private String shippersAddress;
	private String shippersCity;
	private String shippersCountry;
	private String shippersEntity;
	private String shippersPhoNum;
	private String shippersEmail;

	Scanner input = new Scanner(System.in);

	private static void print(String text) {
		System.out.println(text);
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		print("Please enter Your account number: ");
		this.accNo = input.nextInt();
	}

	public String getShippersName() {
		return shippersName;
	}
	
	public void setShippersName(String shippersName) {
		print("Company name: ");
		this.shippersName = input.next();
	}

	public String getShippersAddress() {
		return shippersAddress;
	}

	public void setShippersAddress(String shippersAddress) {
		print("Company address: ");
		this.shippersAddress = input.next();
	}

	public String getShippersCity() {
		return shippersCity;
	}

	public void setShippersCity(String shippersCity) {
		print("City: ");
		this.shippersCity = input.next();
	}

	public String getShippersCountry() {
		return shippersCountry;
	}

	public void setShippersCountry(String shippersCountry) {
		print("Country: ");
		this.shippersCountry = input.next();
	}

	public String getShippersEntity() {
		return shippersEntity;
	}

	public void setShippersEntity(String shippersEntity) {
		print("Please enter Your name & surname: ");
		this.shippersEntity = input.next();
	}

	public String getShippersPhoNum() {
		return shippersPhoNum;
	}

	public void setShippersPhoNum(String shippersPhoNum) {
		print("Please enter Your phone number: ");
		this.shippersPhoNum = input.next();
	}

	public String getShippersEmail() {
		return shippersEmail;
	}

	public void setShippersEmail(String shippersEmail) {
		print("Please enter Your email address: ");
		this.shippersEmail = input.next();
	}

	public void displayShippersInfo() {
		print("ACCOUNT NUMBER: " + this.accNo + "\n" + "COMPANY NAME: " + this.shippersName + "\n" + "ADDRESS: "
				+ this.shippersAddress + "\n" + "CITY: " + this.shippersCity + "\n" + "COUNTRY: " + this.shippersCountry
				+ "\n" + "NAME & SURNAME: " + this.shippersEntity + "\n" + "PHONE NUMER: " + this.shippersPhoNum + "\n"
				+ "EMAIL: " + this.shippersEmail);
	}
}

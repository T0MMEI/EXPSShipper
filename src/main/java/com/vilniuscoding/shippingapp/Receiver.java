package com.vilniuscoding.shippingapp;

import java.util.Scanner;

public class Receiver {

	private String receiversName;
	private String receiversAddress;
	private String receiversCity;
	private String receiversCountry;
	private String receiversEntity;
	private String receiversPhoNum;
	private String receiversEmail;

	Scanner input = new Scanner(System.in);

	private static void print(String text) {
		System.out.println(text);
	}

	public String getReceiversName() {
		return receiversName;
	}

	public void setReceiversName(String receiversName) {
		print("Company name: ");
		this.receiversName = input.next();
	}

	public String getReceiversAddress() {
		return receiversAddress;
	}

	public void setReceiversAddress(String receiversAddress) {
		print("Company address: ");
		this.receiversAddress = input.next();
	}

	public String getReceiversCity() {
		return receiversCity;
	}

	public void setReceiversCity(String receiversCity) {
		print("City: ");
		this.receiversCity = input.next();
	}

	public String getReceiversCountry() {
		return receiversCountry;
	}

	public void setReceiversCountry(String receiversCountry) {
		print("Country: ");
		this.receiversCountry = input.next();
	}

	public String getReceiversEntity() {
		return receiversEntity;
	}

	public void setReceiversEntity(String receiversEntity) {
		print("Please enter receivers name & surname: ");
		this.receiversEntity = input.next();
	}

	public String getReceiversPhoNum() {
		return receiversPhoNum;
	}

	public void setReceiversPhoNum(String receiversPhoNum) {
		print("Please enter contact phone number: ");
		this.receiversPhoNum = input.next();
	}

	public String getReceiversEmail() {
		return receiversEmail;
	}

	public void setReceiversEmail(String receiversEmail) {
		print("Please enter contact email address: ");
		this.receiversEmail = input.next();
	}

	public void displayReceiversInfo() {
		print("COMPANY NAME: " + this.receiversName + "\n" + "ADDRESS: " + this.receiversAddress + "\n" + "CITY: "
				+ this.receiversCity + "\n" + "COUNTRY: " + this.receiversCountry + "\n" + "NAME & SURNAME: "
				+ this.receiversEntity + "\n" + "PHONE NUMER: " + this.receiversPhoNum + "\n" + "EMAIL: "
				+ this.receiversEmail);
	}

	public void readReceiversDataFromDB() {

	}
}

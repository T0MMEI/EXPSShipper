package com.vilniuscoding.shippingapp;

import java.util.Scanner;

public class Receiver {

	private String receiversName;
	private String receiversAddress;
	private String receiversCity;
	private String receiversCountry;
	private String receiversEntity;
	private String receiversPhoNum;

	Scanner inputReceiver = new Scanner(System.in);

	public String getReceiversName() {
		return receiversName;
	}

	public String getReceiversAddress() {
		return receiversAddress;
	}

	public String getReceiversCity() {
		return receiversCity;
	}

	public String getReceiversCountry() {
		return receiversCountry;
	}

	public String getReceiversEntity() {
		return receiversEntity;
	}
	public String getReceiversPhoNum() {
		return receiversPhoNum;
	}
	
	public void setReceiversName(String receiversName) {
		print("Please enter receivers company name:");
		this.receiversName = inputReceiver.nextLine();
	}
	
	public void setReceiversAddress(String receiversAddress) {
		print("Please enter receivers address:");
		this.receiversAddress = inputReceiver.nextLine();
	}

	public void setReceiversCity(String receiversCity) {
		print("Please enter receivers city:");
		this.receiversCity = inputReceiver.nextLine();
	}
	public void setReceiversCountry(String receiversCountry) {
		print("Please enter receivers country:");
		this.receiversCountry = inputReceiver.nextLine();
	}
	public void setReceiversEntity(String receiversEntity) {
		print("Please enter receivers name & surname:");
		this.receiversEntity = inputReceiver.nextLine();
	}
	public void setReceiversPhoNum(String receiversPhoNum) {
		print("Please enter receivers contact phone number:");
		this.receiversPhoNum = inputReceiver.nextLine();
	}
	// SCENNER IS OPEN!!!
	public void displayReceiversInfo() {
		print(" *** RECEIVERS DETAILS: " + "\n"
				+ "COMPANY NAME: " + this.receiversName + "\n" 
				+ "ADDRESS: " + this.receiversAddress + "\n" 
				+ "CITY: "+ this.receiversCity + "\n" 
				+ "COUNTRY: " + this.receiversCountry + "\n" 
				+ "NAME & SURNAME: " + this.receiversEntity + "\n" 
				+ "PHONE NUMER: " + this.receiversPhoNum);
		}

	private static void print(String text) {
		System.out.println(text);
	}

}

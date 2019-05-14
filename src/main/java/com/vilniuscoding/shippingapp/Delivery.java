package com.vilniuscoding.shippingapp;

import java.util.Scanner;

public class Delivery {

	private String deliveryName;
	private String deliveryAddress;
	private String deliveryCity;
	private String deliveryCountry;
	private String deliveryEntity;
	private String deliveryPhoNum;

	Scanner inputDelivery = new Scanner(System.in);

	public String getDeliveryName() {
		return deliveryName;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public String getDeliveryCity() {
		return deliveryCity;
	}

	public String getDeliveryCountry() {
		return deliveryCountry;
	}

	public String getDeliveryEntity() {
		return deliveryEntity;
	}

	public String getDeliveryPhoNum() {
		return deliveryPhoNum;
	}
	
	public void setDeliveryName(String deliveryName) {
		print("Please enter company/name for delivery:");
		this.deliveryName = inputDelivery.nextLine();
	}

	public void setDeliveryAddress(String deliveryAddress) {
		print("Please enter delivery address:");
		this.deliveryAddress = inputDelivery.nextLine();
	}
	public void setDeliveryCity(String deliveryCity) {
		print("Please enter delivery city:");
		this.deliveryCity = inputDelivery.nextLine();
	}
	public void setDeliveryCountry(String deliveryCountry) {
		print("Please enter delivery country:");
		this.deliveryCountry = inputDelivery.nextLine();
	}
	
	public void setDeliveryEntity(String deliveryEntity) {
		print("Please enter contact persons name & surname:");
		this.deliveryEntity = inputDelivery.nextLine();
	}
	
	public void setDeliveryPhoNum(String deliveryPhoNum) {
		print("Please enter contact phone number:");
		this.deliveryPhoNum = inputDelivery.nextLine();
	}
	//SCANNER IS OPEN!!!
	public void displayDeliveryInfo() {
		print(" *** DELIVERY DETAILS:" + "\n" 
				+ "COMPANY NAME: " + this.deliveryName + "\n" 
				+ "DELIVERY - ADDRESS: " + this.deliveryAddress + "\n" 
				+ "DELIVERY - CITY: " + this.deliveryCity + "\n"
				+ "DELIVERY - COUNTRY: " + this.deliveryCountry + "\n" 
				+ "DELIVERY - NAME & SURNAME: " + this.deliveryEntity + "\n" 
				+ "DELIVERY - PHONE NUMER: " + this.deliveryPhoNum);
	}
	
	private static void print(String text) {
		System.out.println(text);
	}

}

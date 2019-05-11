package com.vilniuscoding.shippingapp;

import java.util.Scanner;

public class Delivery {

	private String deliveryName;
	private String deliveryAddress;
	private String deliveryCity;
	private String deliveryCountry;
	private String deliveryEntity;
	private String deliveryPhoNum;
	private String deliveryEmail;

	Scanner input = new Scanner(System.in);

	private static void print(String text) {
		System.out.println(text);
	}

	public String getDeliveryName() {
		return deliveryName;
	}

	public void setDeliveryName(String deliveryName) {
		print("Company name: ");
		this.deliveryName = input.next();
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		print("Delivery address: ");
		this.deliveryAddress = input.next();
	}

	public String getDeliveryCity() {
		return deliveryCity;
	}

	public void setDeliveryCity(String deliveryCity) {
		print("City: ");
		this.deliveryCity = input.next();
	}

	public String getDeliveryCountry() {
		return deliveryCountry;
	}

	public void setDeliveryCountry(String deliveryCountry) {
		print("Country: ");
		this.deliveryCountry = input.next();
	}

	public String getDeliveryEntity() {
		return deliveryEntity;
	}

	public void setDeliveryEntity(String deliveryEntity) {
		print("Please enter contact persons name & surname: ");
		this.deliveryEntity = input.next();
	}

	public String getDeliveryPhoNum() {
		return deliveryPhoNum;
	}

	public void setDeliveryPhoNum(String deliveryPhoNum) {
		print("Please enter contact phone number: ");
		this.deliveryPhoNum = input.next();
	}

	public String getDeliveryEmail() {
		return deliveryEmail;
	}

	public void setDeliveryEmail(String deliveryEmail) {
		print("Please enter contact email address: ");
		this.deliveryEmail = input.next();
	}

	public void displayReceiversInfo() {
		print("DELIVERY - COMPANY NAME: " + this.deliveryName + "\n" + "DELIVERY - ADDRESS: " + this.deliveryAddress
				+ "\n" + "DELIVERY - CITY: " + this.deliveryCity + "\n" + "DELIVERY - COUNTRY: " + this.deliveryCountry
				+ "\n" + "DELIVERY - NAME & SURNAME: " + this.deliveryEntity + "\n" + "DELIVERY - PHONE NUMER: "
				+ this.deliveryPhoNum + "\n" + "DELIVERY - EMAIL: " + this.deliveryEmail);
	}

}

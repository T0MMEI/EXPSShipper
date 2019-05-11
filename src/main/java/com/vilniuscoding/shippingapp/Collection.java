package com.vilniuscoding.shippingapp;

import java.util.Scanner;

public class Collection {

	private String collectionName;
	private String collectionAddress;
	private String collectionCity;
	private String collectionCountry;
	private String collectionEntity;
	private String collectionPhoNum;
	private String collectionEmail;

	Scanner input = new Scanner(System.in);

	private static void print(String text) {
		System.out.println(text);
	}

	public String getCollectionName() {
		return collectionName;
	}

	public void setCollectionName(String collectionName) {
		print("Company name: ");
		this.collectionName = input.next();
	}

	public String getCollectionAddress() {
		return collectionAddress;
	}

	public void setCollectionAddress(String collectionAddress) {
		print("Loading address: ");
		this.collectionAddress = input.next();
	}

	public String getCollectionCity() {
		return collectionCity;
	}

	public void setCollectionCity(String collectionCity) {
		print("City: ");
		this.collectionCity = input.next();
	}

	public String getCollectionCountry() {
		return collectionCountry;
	}

	public void setCollectionCountry(String collectionCountry) {
		print("Country: ");
		this.collectionCountry = input.next();
	}

	public String getCollectionEntity() {
		return collectionEntity;
	}

	public void setCollectionEntity(String collectionEntity) {
		print("Please enter rep. persons name & surname: ");
		this.collectionEntity = input.next();
	}

	public String getCollectionPhoNum() {
		return collectionPhoNum;
	}

	public void setCollectionPhoNum(String collectionPhoNum) {
		print("Please enter contact phone number: ");
		this.collectionPhoNum = input.next();
	}

	public String getCollectionEmail() {
		return collectionEmail;
	}

	public void setCollectionEmail(String collectionEmail) {
		print("Please enter contact email address: ");
		this.collectionEmail = input.next();
	}

	public void displayCollectionInfo() {
		print("COMPANY NAME: " + this.collectionName + "\n" + "ADDRESS: " + this.collectionAddress + "\n" + "CITY: "
				+ this.collectionCity + "\n" + "COUNTRY: " + this.collectionCountry + "\n" + "NAME & SURNAME: "
				+ this.collectionEntity + "\n" + "PHONE NUMER: " + this.collectionPhoNum + "\n" + "EMAIL: "
				+ this.collectionEmail);
	}

}

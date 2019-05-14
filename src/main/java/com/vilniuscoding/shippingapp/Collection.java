package com.vilniuscoding.shippingapp;

import java.util.Scanner;

public class Collection {

	private String collectionName;
	private String collectionAddress;
	private String collectionCity;
	private String collectionCountry;
	private String collectionEntity;
	private String collectionPhoNum;

	Scanner inputCollection = new Scanner(System.in);

	public String getCollectionName() {
		return collectionName;
	}

	public String getCollectionAddress() {
		return collectionAddress;
	}

	public String getCollectionCity() {
		return collectionCity;
	}

	public String getCollectionCountry() {
		return collectionCountry;
	}

	public String getCollectionEntity() {
		return collectionEntity;
	}

	public String getCollectionPhoNum() {
		return collectionPhoNum;
	}

	public void setCollectionName(String collectionName) {
		print("Please enter loading warehouse name or company name:");
		this.collectionName = inputCollection.nextLine();
	}

	public void setCollectionAddress(String collectionAddress) {
		print("Please enter collection address:");
		this.collectionAddress = inputCollection.nextLine();
	}

	public void setCollectionCity(String collectionCity) {
		print("Please enter City name:");
		this.collectionCity = inputCollection.nextLine();
	}

	public void setCollectionCountry(String collectionCountry) {
		print("Please enter country: ");
		this.collectionCountry = inputCollection.nextLine();
	}

	public void setCollectionEntity(String collectionEntity) {
		print("Please enter rep. persons name & surname: ");
		this.collectionEntity = inputCollection.nextLine();
	}

	public void setCollectionPhoNum(String collectionPhoNum) {
		print("Please enter contact phone number: ");
		this.collectionPhoNum = inputCollection.nextLine();
	}

	/// SCANNER IS OPEN!!!
	public void displayCollectionInfo() {
		print(" *** COLLECTION DETAILS: " + "\n"
				+ "COMPANY NAME: " + this.collectionName + "\n" 
				+ "ADDRESS: " + this.collectionAddress + "\n" 
				+ "CITY: " + this.collectionCity + "\n"	
				+ "COUNTRY: " + this.collectionCountry + "\n" 
				+ "NAME & SURNAME: " + this.collectionEntity + "\n" 
				+ "PHONE NUMER: " + this.collectionPhoNum);
	}

	private static void print(String text) {
		System.out.println(text);
	}

}

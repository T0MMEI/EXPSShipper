package com.vilniuscoding.shippingapp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Consignment {

	public void createConsignment() {

		References newAWB = new References();
		References date = new References();
		References service = new References();
		Shipper sender = new Shipper();
		Collection loading = new Collection();
		Receiver receiver = new Receiver();
		Delivery delivery = new Delivery();
		References ref = new References();
		Package cargo = new Package();
		DBoperations dbSaver = new DBoperations();
		
		// Creating a con.
		System.out.println("PLEASE ENTER SENDERS DETAILS");
		sender.setShippersName();
		sender.setShippersAddress();
		sender.setShippersCity();
		sender.setShippersCountry();
		sender.setShippersEntity();
		sender.setShippersPhoNum();
		
		Scanner inputConsignment = new Scanner(System.in);
		System.out.println("Would You like to add collection details? (Yes/No)");
		String choiceForCollection = inputConsignment.nextLine();

		if (choiceForCollection.equalsIgnoreCase("Yes")) {

			System.out.println("PLEASE ENTER COLLECTION DETAILS");
			loading.setCollectionName();
			loading.setCollectionAddress();
			loading.setCollectionCity();
			loading.setCollectionCountry();
			loading.setCollectionEntity();
			loading.setCollectionPhoNum();
		} else if (choiceForCollection.equalsIgnoreCase("No")) {
			// Catch answer & proceed
		} else throw new InputMismatchException("INPUT ERROR: Please enter Yes or No");

		System.out.println("PLEASE ENTER RECEIVERS DETAILS");
		receiver.setReceiversName();
		receiver.setReceiversAddress();
		receiver.setReceiversCity();
		receiver.setReceiversCountry();
		receiver.setReceiversEntity();
		receiver.setReceiversPhoNum();

		System.out.println("Delivery to Different Location? (Yes/No)");
		String choiceForDelivery = inputConsignment.nextLine();
		if (choiceForDelivery.equalsIgnoreCase("Yes")) {

			System.out.println("PLEASE ENTER DELIVERY DETAILS");
			delivery.setDeliveryName();
			delivery.setDeliveryAddress();
			delivery.setDeliveryCity();
			delivery.setDeliveryCountry();
			delivery.setDeliveryEntity();
			delivery.setDeliveryPhoNum();
		} else if (choiceForDelivery.equalsIgnoreCase("No")) {
			// Catch answer & proceed
		} else throw new InputMismatchException("INPUT ERROR: Please enter Yes or No");
		
		newAWB.awbGenerator();
		ref.setCustRef();
		cargo.getPackageData();
		service.setService();
		date.docDate();
		dbSaver.insertToDatabase(newAWB.awbGenerator(), date.docDate(), ref.getCustRef(), receiver.getReceiversName(), cargo.shipmentPackages(), cargo.shipmentWeight(), receiver.getReceiversCountry());
	}
}

package com.vilniuscoding.shippingapp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Consignment {

	public void createConsignment() {

		References newAWB = new References();
		References date = new References();
		// References service = new References(); // FAILD - java scanner no such element exeption error
		Shipper sender = new Shipper();
		Collection loading = new Collection();
		Receiver receiver = new Receiver();
		Delivery delivery = new Delivery();
		References ref = new References();
		Package cargo = new Package();
		DBoperations dbSaver = new DBoperations();
		
		
		// Creating a consigment
		System.out.println("PLEASE ENTER SENDERS DETAILS");
		sender.setShippersName(null);
		sender.setShippersAddress(null);
		sender.setShippersCity(null);
		sender.setShippersCountry(null);
		sender.setShippersEntity(null);
		sender.setShippersPhoNum(null);
		
		Scanner inputConsignment = new Scanner(System.in);
		System.out.println("Would You like to add collection details? (Yes/No)");
		String choiceForCollection = inputConsignment.nextLine();
		if (choiceForCollection.equalsIgnoreCase("Yes")) {

			System.out.println("PLEASE ENTER COLLECTION DETAILS");
			loading.setCollectionName(null);
			loading.setCollectionAddress(null);
			loading.setCollectionCity(null);
			loading.setCollectionCountry(null);
			loading.setCollectionEntity(null);
			loading.setCollectionPhoNum(null);
		} else if (choiceForCollection.equalsIgnoreCase("No")) {
			// Catch answer & proceed
		} //else throw new InputMismatchException("INPUT ERROR: Please enter Yes or No");

		System.out.println("PLEASE ENTER RECEIVERS DETAILS");
		receiver.setReceiversName(null);
		receiver.setReceiversAddress(null);
		receiver.setReceiversCity(null);
		receiver.setReceiversCountry(null);
		receiver.setReceiversEntity(null);
		receiver.setReceiversPhoNum(null);

		System.out.println("Delivery to Different Location? (Yes/No)");
		String choiceForDelivery = inputConsignment.nextLine();
		if (choiceForDelivery.equalsIgnoreCase("Yes")) {

			System.out.println("PLEASE ENTER DELIVERY DETAILS");
			delivery.setDeliveryName(null);
			delivery.setDeliveryAddress(null);
			delivery.setDeliveryCity(null);
			delivery.setDeliveryCountry(null);
			delivery.setDeliveryEntity(null);
			delivery.setDeliveryPhoNum(null);
		} else if (choiceForDelivery.equalsIgnoreCase("No")) {
			// Catch answer & proceed
		} // else throw new InputMismatchException("INPUT ERROR: Please enter Yes or No");
		
		newAWB.awbGenerator();
		
		sender.displayShippersInfo();
		loading.displayCollectionInfo();
		receiver.displayReceiversInfo();
		delivery.displayDeliveryInfo();
		ref.setCustRef(null);
		cargo.getPackageData();
		//service.setService(null); // FAILD - java scanner no such element exeption error
		date.docDate();
		dbSaver.insertToDatabase(newAWB.awbGenerator(), date.docDate(), ref.getCustRef(), receiver.getReceiversName(), cargo.getPackQnty(), cargo.getWeight(), receiver.getReceiversCountry());
		
	}

	

}

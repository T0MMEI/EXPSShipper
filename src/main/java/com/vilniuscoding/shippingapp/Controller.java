package com.vilniuscoding.shippingapp;

import java.nio.channels.ShutdownChannelGroupException;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

	References startup = new References();
	ArrayList<Consignment> listOfShipments = new ArrayList<>();
	
	public void launchApp() {

		DBoperations.createNewDatabase("shipments.db");
		DBoperations.createNewTable();
		startup.welcome();
		startup.menu();
		System.out.println("Please choose Your option:");
		options();
	}
	
	private void options() {
		Scanner inputController = new Scanner(System.in);
		String meniuChoice = inputController.nextLine();

		if (meniuChoice.equals("1") || meniuChoice.equals("Add shipment")) {
			
			Scanner addAnotherShipment = new Scanner(System.in);
			String userReply = "Yes";

			while (userReply.equalsIgnoreCase("Yes")) {

				Consignment con = new Consignment();
				con.createConsignment();
				listOfShipments.add(con);

				System.out.println("Add another shipment? (Yes/No)");
				userReply = addAnotherShipment.nextLine();
			}

			if (userReply.equalsIgnoreCase("no")) {
				startup.menu();
				options();
			}
		}

		if (meniuChoice.matches("View List") || meniuChoice.matches("2")) {
			DBoperations list = new DBoperations();
			list.selectAll();
			startup.menu();
			options();
		}

		if (meniuChoice.matches("Generate Waybill") || meniuChoice.matches("3")) {
			// Get shipment from listOFShipments
			// setup JFX
			// generate output on JFX
		}

	}
	
	
}

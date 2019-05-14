package com.vilniuscoding.shippingapp;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {

		DBoperations.createNewDatabase("shipments.db");
		DBoperations.createNewTable();
		
		
		References startup = new References();
		startup.welcome();
		System.out.println("Meniu: " + "1. Add shipment " + "2. View List " + "3. Print Document" + "\n"
				+ "************************************************");
		System.out.println("Please chose Your option:");
		
		Scanner inputController = new Scanner(System.in);
		String meniuChoice = inputController.nextLine();

		if (meniuChoice.equals("1") || meniuChoice.equals("Add shipment")) {
			
			ArrayList<Consignment> listOfShipments = new ArrayList<>();
			//Scanner addAnotherShipment = new Scanner(System.in);
			//String userReply = "Yes";
			
			//while (userReply.equalsIgnoreCase("Yes")) {
				
				Consignment con = new Consignment();
				con.createConsignment();
				listOfShipments.add(con);
				
				//System.out.println("Add another shipment? (Yes/No)");
				//userReply = addAnotherShipment.nextLine();
				//}
			//addAnotherShipment.close();
			}
			
		if (meniuChoice.matches("View List") || meniuChoice.matches("2")) {
		DBoperations list = new DBoperations();
		list.selectAll();
		}

		if (meniuChoice.matches("Print Document") || meniuChoice.matches("3")) {
			// // Print document
			inputController.close();
		 	}
			
		}
	}


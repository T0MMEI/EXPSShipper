package com.vilniuscoding.shippingapp;

import java.util.ArrayList;
import java.util.Scanner;

public class Package {

	private String pakCommodity;
	private int packQnty;
	private double weight;
	private double lenght;
	private double width;
	private double height;
	double volume;
	double packTotalWeight;

	private double packageVolume() {
		volume = packQnty * (lenght * width * height) / 1000000;
		return volume;
	}

	private double packageWeight() {
		packTotalWeight = packQnty * weight;
		return packTotalWeight;
	}

	private static void print(String text) {
		System.out.println(text);
	}

	public void printpackdetails() {
		print("Package details: " + "\n" + "Number of boxes: " + packQnty + "\n" + "Weight: " + packTotalWeight + "KG"
				+ "\n" + "Dimensions: " + lenght + " x " + width + " x " + height + "CM" + "\n" + "Volume: " + volume
				+ "CBM");
	}
	// GATHER OBJECTS!

	public static void getPackageData() {
		ArrayList<Package> shipment = new ArrayList<>();

		Scanner input = new Scanner(System.in);
		String a = "Yes";

		print("Please add package details");

		while (a.equalsIgnoreCase("Yes")) {
			
			

			Package pak = new Package();

			print("Please enter commodity: ");
			pak.pakCommodity = input.next();
			print("Please enter number of boxes: ");
			pak.packQnty = input.nextInt();
			print("Please enter weight: ");
			pak.weight = input.nextDouble();
			print("Please enter lenght(cm): ");
			pak.lenght = input.nextDouble();
			print("Please enter width(cm): ");
			pak.width = input.nextDouble();
			print("Please enter height(cm): ");
			pak.height = input.nextDouble();
			pak.packageVolume();
			pak.packageWeight();
			shipment.add(pak);

			print("Add another package? (Yes/No)");
			a = input.next();

		}
		input.close();
		

		// PRINT OBJECTS data
		for (int i = 0; i < shipment.size(); i++) {
		shipment.get(i).printpackdetails();
		}

	}

	
	
	
	
	
	
}

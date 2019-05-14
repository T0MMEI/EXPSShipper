package com.vilniuscoding.shippingapp;

import java.util.ArrayList;
import java.util.Scanner;

public class Package {

	String commodity;
	int packQnty;
	
	double weight;
	double lenght;
	double width;
	double height;

	
	public String getCommodity() {
		return commodity;
	}

	public int getPackQnty() {
		return packQnty;
	}

	public double getWeight() {
		return weight;
	}

	public double getLenght() {
		return lenght;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}

	public void setPackQnty(int packQnty) {
		this.packQnty = packQnty;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setLenght(double lenght) {
		this.lenght = lenght;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	

	private double packageVolume(Double volume) {
		volume = packQnty * (lenght * width * height) / 1000000;
		return volume;
	}

	private static void print(String text) {
		System.out.println(text);
	}

	public void printpackdetails() {
		print("Package details: " + "\n" 
				+ "Number of boxes: " + packQnty + "\n" 
				+ "Weight: " + weight + "KG" + "\n"
				+ "Dimensions: " + lenght + " x " + width + " x " + height + "cm" + "\n"
				+ "Volume: " + packageVolume(null) + "CBM");
	}

	public void getPackageData() {
		ArrayList<Package> shipment = new ArrayList<>();

		Scanner input = new Scanner(System.in);
		String a = "Yes";

		print("Please add package details");

		while (a.equalsIgnoreCase("Yes")) {

			Package pak = new Package();
			
			print("Please enter commodity: ");
			pak.setCommodity(input.nextLine()); // SKIPPED ON 2ND ENTRY
			print("Please enter number of boxes: ");
			pak.setPackQnty(input.nextInt());
			print("Please enter weight: ");
			pak.setWeight(input.nextDouble());
			print("Please enter lenght(cm): ");
			pak.setLenght(input.nextDouble());
			print("Please enter width(cm): ");
			pak.setWidth(input.nextDouble());
			print("Please enter height(cm): ");
			pak.setHeight(input.nextDouble());
			pak.packageVolume(null);
			shipment.add(pak);

			print("Add another package? (Yes/No)");
			a = input.next();

		}
		input.close();

		// PRINT TO CHECK
		for (int i = 0; i < shipment.size(); i++) {
		shipment.get(i).printpackdetails();
		}
	}

}

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

	private static ArrayList<Package> shipment = new ArrayList<>();
	
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
	

	public double packageVolume() {
		double volume = packQnty * (lenght * width * height) / 1000000;
		return volume;
	}
	
	
	public double shipmentWeight() {
		double totalWeigth = 0;
			for (int i = 0; i < shipment.size(); i++) {
				totalWeigth = totalWeigth + shipment.get(i).weight;
			}
		return totalWeigth;	
	}
	
	public int shipmentPackages() {
		int totalUnits =0;
			for (int i = 0; i < shipment.size(); i++) {
				totalUnits = totalUnits + shipment.get(i).packQnty;
			}
		return totalUnits;
	}

	public void getPackageData() {
		Scanner input = new Scanner(System.in);
		String addPackage = "Yes";
		print("Please add package details");

		while (addPackage.equalsIgnoreCase("Yes")) {
			Package pak = new Package();
			print("Please enter commodity: ");
			pak.setCommodity(input.nextLine());
			print("Please enter number of pieces: ");
			pak.setPackQnty(input.nextInt());
			print("Please enter weight: ");
			pak.setWeight(input.nextDouble());
			print("Please enter lenght(cm): ");
			pak.setLenght(input.nextDouble());
			print("Please enter width(cm): ");
			pak.setWidth(input.nextDouble());
			print("Please enter height(cm): ");
			pak.setHeight(input.nextDouble());
			pak.packageVolume();
			shipment.add(pak);
			print("Add another package? (Yes/No)");
			addPackage = input.next();
		}
	}
	
	private static void print(String text) {
		System.out.println(text);
	}

	public void displayPacksData () {
		for (int i = 0; i < shipment.size(); i++) {
			shipment.get(i).printpackdetails();
		}
	}
	
	private void printpackdetails() {
		print("Package details: " + "\n" 
				+ "Number of boxes: " + packQnty + "\n" 
				+ "Weight: " + weight + "KG" + "\n"
				+ "Dimensions: " + lenght + " x " + width + " x " + height + "cm" + "\n"
				+ "Volume: " + packageVolume() + "CBM");
	}

	
}

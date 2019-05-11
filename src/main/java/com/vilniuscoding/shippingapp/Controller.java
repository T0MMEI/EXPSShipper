package com.vilniuscoding.shippingapp;

public class Controller {
	
	public static void main(String[] args) {
	
	Console run = new Console();
	run.welcome(); 
		
	Shipper sender = new Shipper();
	sender.setAccNo(0);
	sender.setShippersName(null);
	sender.setShippersAddress(null);
	sender.setShippersCity(null);
	sender.setShippersCountry(null);
	sender.setShippersEntity(null);
	sender.setShippersPhoNum(null);
	sender.setShippersEmail(null);
	
	Receiver receiver = new Receiver();
	receiver.setReceiversName(null);
	receiver.setReceiversAddress(null);
	receiver.setReceiversCity(null);
	receiver.setReceiversCountry(null);
	receiver.setReceiversEntity(null);
	receiver.setReceiversPhoNum(null);
	receiver.setReceiversPhoNum(null);
	receiver.setReceiversEmail(null);
	
	
	Package ladungen = new Package();
	ladungen.getPackageData();
	((Package) ladungen).printpackdetails();
	
	
	}

}

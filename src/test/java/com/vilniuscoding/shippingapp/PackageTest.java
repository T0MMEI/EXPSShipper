package com.vilniuscoding.shippingapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class PackageTest {

	@Test
	public void test_packageVolume() {
		//setup
		Package volumetester = new Package();
		//test
		double output = volumetester.packageVolume();
		//assertation
		assertEquals(1, volumetester);
	}
}

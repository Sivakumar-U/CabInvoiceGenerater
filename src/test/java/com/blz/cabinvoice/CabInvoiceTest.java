package com.blz.cabinvoice;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CabInvoiceTest {

	static InvoiceGenerator invoiceGenerator;

	@BeforeClass
	public static void createInvoiceGeneratorObj() {
		invoiceGenerator = new InvoiceGenerator();
	}

	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare() {
		double distance = 2.0;
		int time = 5;
		double fare = invoiceGenerator.calaculateFare(distance, time);
		Assert.assertEquals(25, fare, 0.0);
	}

	@Test
	public void givenLessDistanceAndTime_ShouldReturnMinimumFare() {
		double distance = 0.1;
		int time = 1;
		double fare = invoiceGenerator.calaculateFare(distance, time);
		Assert.assertEquals(5, fare, 0.0);
	}

}

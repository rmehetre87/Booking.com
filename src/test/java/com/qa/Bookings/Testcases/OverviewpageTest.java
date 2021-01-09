package com.qa.Bookings.Testcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Bookings.Base.TestBase;
import com.qa.Bookings.pages.Overviewpage;

public class OverviewpageTest extends TestBase{
	private static final String VerifyNewyorkcity = null;
	Overviewpage overvw;
	public OverviewpageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		inetialization();
		overvw = new Overviewpage();
	}
	
	@Test
	public void VerifyOverviewpage() throws InterruptedException {
		
		//overvw.searchNew("New");
		overvw.VerifyNewyorkcity();
		overvw.selectstartdate();
		overvw.selectenddate();
		overvw.selectguests();
		overvw.filterhotels();
		
	}

	@AfterMethod(enabled = false)
	public void teardown() {
		
		driver.quit();
	}
	

}

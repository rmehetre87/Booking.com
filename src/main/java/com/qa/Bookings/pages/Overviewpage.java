package com.qa.Bookings.pages;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.Bookings.Base.TestBase;

public class Overviewpage extends TestBase {
	
	@FindBy(xpath = "//span[contains (text(), 'Stays')]")
	WebElement Staystab;
	
	@FindBy(xpath = "//span[contains(text(), 'New York')]//span[@class=\"search_hl_name\"]")
	WebElement Newyorkcity;
	
	@FindBy(xpath = "//span[@aria-label=\"8 January 2021\"]")
	WebElement checkindate;
	
	@FindBy(xpath = "//span[@aria-label=\"29 January 2021\"]")
	WebElement checkoutdate;
	
	@FindBy(xpath = "//*[@id=\"ss\"]")
	WebElement search;
	
	@FindBy(xpath = "//button[@aria-label=\"Increase number of Children\"]")
	WebElement selectchildren;
	
	@FindBy(xpath = "//button[@data-sb-id=\"main\"]")
	WebElement searchbutton;
	
	@FindBy(xpath = "//*[contains(text(), '            Age at check-out')]")
	WebElement selectchildrenage;
	
	@FindBy(xpath = "//*[contains(text(), '                3 years old')]")
	WebElement selectchildrenage3;
	
	@FindBy(xpath = "//h1[contains(text(),'properties found')]")
	WebElement searchedproperties;
	
	@FindBy(xpath = "//*[@id=\"filter_class\"]/div[2]/a[3]/label/div")
	WebElement filter3star;
	
	@FindBy(xpath = "//a[contains(text(), 'Price (lowest first)')]")
	WebElement sortlistwithprice;
	
	@FindBy(xpath = "//*[@id=\"hotellist_inner\"]/div[1]/div[2]/div[1]/div[1]/div[1]/h3/a")
	WebElement printfirsthotel;
	
	
	
	
	
	
	
	
	
	
	
	
	//Initialising the page object
	public Overviewpage() {
		PageFactory.initElements(driver, this);
		}
	
	// Entering new in search box
	public void searchNew(String city) {
		//search.sendKeys("new");
		//Newyorkcity.click();
		
	}
	//verifying newyork city from landing page
	public void VerifyNewyorkcity() {
			
		search.sendKeys("new");
		
				
		WebElement element = driver.findElement(By.xpath("//span[contains(text(), 'New York')]//span[@class=\"search_hl_name\"]"));
		
		String ExpectedText = "New York";
		
		Assert.assertEquals(ExpectedText, element.getText());
		
		System.out.println("City text is as expected – Assert passed");
		
		element.click();
	}
	

	
	// select start day	
	public void selectstartdate() {
		
		checkindate.click();
		
		/*//WebElement checkindate = driver.findElement(By.xpath("//td[@data-date=\"2020-12-28\"]"));
		
		Calendar st = Calendar.getInstance(TimeZone.getDefault());
		
		st.setTime(new Date());
		
		//get next day as a date
		st.add(Calendar.DATE, 1);
		
		
		String str1= "//span[@aria-label=";
		Date str2= st.getTime();
		String str3 = str1+str2;
		
		
		WebElement checkindate = driver.findElement(By.xpath("str3"));
				//span[@aria-label="24 December 2020"]
				return st.getTime();
		//checkindate.click();
		
		//System.out.println("Checkin date is: "+checkindate.getText());
*/		
}
	
	public void selectenddate() {
		
		checkoutdate.click();
				
		/*Calendar st = Calendar.getInstance();
		
		st.setTime(new Date());
		
		st.add(Calendar.WEEK_OF_MONTH, 3);
		
		return st.getTime();*/
		
		/*WebElement checkoutdate = driver.findElement(By.xpath(" //td[@data-date=\"2020-12-31\"]"));
		
		checkoutdate.click();
		
		System.out.println("Checkout date is: "+checkoutdate.getText());*/
		
			
	}
	
	public void selectguests() throws InterruptedException {
		
		WebElement guests = driver.findElement(By.xpath("//*[@id=\"xp__guests__toggle\"]/span[2]"));
		guests.click();
		
		selectchildren.click();
		
		System.out.println("1 children selected.." +selectchildren.getText());
		
		selectchildrenage.click();
		
		selectchildrenage3.click();
		
		System.out.println("Children age selected = " +selectchildrenage3.getText());
				
		searchbutton.click();
		
		Thread.sleep(3000);
		
		//Validate searched properties
		
		System.out.println("Searched properties: "+searchedproperties.getText());
		
	}
	
	public void filterhotels() throws InterruptedException {
		
		// filter 3 star hotels
		filter3star.click();
		
		//sort 3 star hotels with lowest price first
		sortlistwithprice.click();
		
		Thread.sleep(5000);
		
		System.out.println("Searched 3 star hotels with lowest price first: "+searchedproperties.getText());
		
		
		
		
		
		
		
	}

}

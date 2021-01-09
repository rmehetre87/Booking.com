package com.qa.Bookings.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.qa.Bookings.utils.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\mehetrr\\Project workspace\\Booking.com"
				+ "\\src\\main\\java\\com\\qa\\Bookings\\config\\config.properties");
					prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e){
			
			e.printStackTrace();
		}
		
	
	}
	
	public static void inetialization() {
		
		String browsername = prop.getProperty("browser");
		
		if(browsername.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\OSS\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();
		}
		else if(browsername.equals("IE")) {
			
			System.setProperty("webdriver.ie.driver","C:\\Users\\home\\Desktop\\work\\software\\selenium_jars\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();	
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("testURL"));
		
	}
	
	

}






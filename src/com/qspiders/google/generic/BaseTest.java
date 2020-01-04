package com.qspiders.google.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * 
 * @author Ramya
 *
 */
public class BaseTest {
	public WebDriver driver;
	
	/**
	 * This method opens the browser to Google Search Page
	 */
	@BeforeMethod
	public void openBrowser() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://google.com");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}

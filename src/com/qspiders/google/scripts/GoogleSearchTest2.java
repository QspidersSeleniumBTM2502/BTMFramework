package com.qspiders.google.scripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qspiders.google.generic.BaseTest;
import com.qspiders.google.pages.GoogleSearchPage;

public class GoogleSearchTest2 extends BaseTest{
	
	@Test
	public void googleSearch() {
		GoogleSearchPage gsp = new GoogleSearchPage(driver);
		
		WebElement searchBox = gsp.searchFor();
		searchBox.sendKeys("Selenium", Keys.ENTER);
	}

}

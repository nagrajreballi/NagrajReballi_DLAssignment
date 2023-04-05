package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class homePage {
	
	private WebDriver driver;

	//Page factory of Object Repository
	
		@FindBy(xpath = "//*[@class='header_label']//div")
		//@CacheLookup
		WebElement txt_swaglab;

		
		public homePage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
		}

		public String getHomePageTitle() {
			return driver.getTitle();
			}
}

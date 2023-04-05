package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class loginPage {
	
private WebDriver driver;

	
	//Page factory of Object Repository
	
	@FindBy(xpath = "//*[@id='user-name']")
	@CacheLookup
	WebElement txt_username;

	@FindBy(xpath = "//*[@id='password']")
	
	WebElement txt_password;
	
	@FindBy(xpath = "//*[@id='login-button']")
	WebElement signInButton;
	
	
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
	}

	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public void enterUserName(String username) {
		txt_username.sendKeys(username);
	}

	public void enterPassword(String pwd) {
		txt_password.sendKeys(pwd);
	}

	public void clickOnLogin() {
		signInButton.click();
	}
	
	public homePage doLogin(String un, String pwd) {
		System.out.println("login with: " + un + " and " + pwd);
		txt_username.sendKeys(un);
		txt_password.sendKeys(pwd);
		signInButton.click();
		return new homePage(driver);
	}
}

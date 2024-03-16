package com.amazon.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {

	WebDriver webDriver;

	public SignUpPage(WebDriver webDriver) {

		this.webDriver = webDriver;
	}

	By accountsListsLink = By.xpath("//*[contains(text(),'Account & Lists')]");
	By signUpLink = By.xpath("//a[text()='Start here.']");

	public WebElement getAccountsAndListLink() {

		return webDriver.findElement(accountsListsLink);
	}
	
	public WebElement getSignUpLink() {

		return webDriver.findElement(signUpLink);
	}

	
}

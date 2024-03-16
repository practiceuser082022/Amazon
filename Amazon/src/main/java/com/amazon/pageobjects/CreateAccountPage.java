package com.amazon.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccountPage {

	WebDriver driver;

	public CreateAccountPage(WebDriver driver) {

		this.driver = driver;
	}

	By userName = By.id("ap_customer_name");
	By phoneNumber = By.id("ap_phone_number");
	By password = By.id("ap_password");
	By verifyMobileNumberBtn = By.id("continue");
	By createBtn = By.id("continue");
	
	public WebElement getUserNameTextBox() {

		return driver.findElement(userName);
	}

	public WebElement getPhoneNumberTextBox() {

		return driver.findElement(phoneNumber);
	}

	public WebElement getPasswordTextBox() {

		return driver.findElement(password);
	}
	public WebElement getVerifyMobileNumber() {

		return driver.findElement(verifyMobileNumberBtn);
	}
	public WebElement getCreateBtn() {

		return driver.findElement(createBtn);
	}
}

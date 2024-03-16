package com.amazon.pageoperations;

import org.openqa.selenium.WebDriver;

import com.amazon.pageobjects.CreateAccountPage;

public class CreateAccountPageOperations {

	
	CreateAccountPage createAccountPage;
	
	public 	CreateAccountPageOperations(WebDriver driver){
		createAccountPage=new CreateAccountPage(driver);
	}
	

	public void enterUserName(String name) {
		createAccountPage.getUserNameTextBox().sendKeys(name);
	}
	
	public void enterPhoneNumber(String name) {
		createAccountPage.getPhoneNumberTextBox().sendKeys(name);
	}
	
	public void enterPassword(String name) {
		createAccountPage.getPasswordTextBox().sendKeys(name);
	}
	
	public void clickOnVerifyMobileNumber() {
		createAccountPage.getVerifyMobileNumber().click();
	}
	
	public void clickOnCreateBtn() {
		createAccountPage.getCreateBtn().click();
	}
}

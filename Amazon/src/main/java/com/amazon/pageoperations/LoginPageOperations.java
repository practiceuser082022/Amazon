package com.amazon.pageoperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.amazon.pageobjects.LoginPage;

public class LoginPageOperations {

	WebDriver webDriver;
	LoginPage loginPage;

	public LoginPageOperations(WebDriver webDriver) {

		this.webDriver = webDriver;
		loginPage = new LoginPage(webDriver);
	}

	public void enterEmailOrPhoneNumber(String emailOrphone) {
		loginPage.getEmailOrPhoneTextBox().sendKeys(emailOrphone);
	}

	public void enterPassword(String password) {
		loginPage.getPasswordTextBox().sendKeys(password);

	}

	public void enterOtp(String otp) {
		loginPage.getOtpTextBox().sendKeys(otp);

	}

	public void clickOnContinue() {
		loginPage.getCotinueBtn().click();
	}

	public void clickOnSignInLink() {
		
		Actions actions=new Actions(webDriver);
		actions.moveToElement(loginPage.getSignInLink()).click().perform();
		
	}
	
	public void clickOnSignIn() {
		loginPage.getSignInBtn().click();
	}

	public void clickOnOtpSubmitBtn() {
		loginPage.getOtpSubmitBtn().click();
	}
}

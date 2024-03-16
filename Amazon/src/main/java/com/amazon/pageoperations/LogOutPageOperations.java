package com.amazon.pageoperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.amazon.pageobjects.LogOutPage;
import com.amazon.pageobjects.LoginPage;
import com.amazon.utils.Utilities;

public class LogOutPageOperations {

	WebDriver webDriver;
	LogOutPage logOutPage;
	Actions actions;
	Utilities utilities;
	
	public LogOutPageOperations(WebDriver webDriver) {

		this.webDriver = webDriver;
		logOutPage = new LogOutPage(webDriver);
		actions = new Actions(webDriver);
		utilities=new Utilities(webDriver);
		
	}

	public void clickOnAccountsAndListLink() {

		actions.moveToElement(utilities.waitForElement(logOutPage.getAccountsAndListLink())).click().perform();

	}

	public void clickOnSignOutLink() {
		actions.moveToElement(utilities.waitForElement(logOutPage.getSignOutLink())).click().perform();
	}

}

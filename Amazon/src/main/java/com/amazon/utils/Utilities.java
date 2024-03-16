package com.amazon.utils;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {

	public WebDriver webDriver;

	public Utilities(WebDriver webDriver) {

		this.webDriver = webDriver;
	}

	public void clickUsingJS(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		js.executeScript("arguments[0].click();", element);
	}

	public WebElement waitForElement(WebElement element) {

		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
		return wait.until(ExpectedConditions.visibilityOf(element));

	}
}

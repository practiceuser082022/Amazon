package com.amazon.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class SearchProdcutPage {

	WebDriver driver;

	public SearchProdcutPage(WebDriver driver){
		
		this.driver=driver;
	}

	By searchBox = By.id("twotabsearchtextbox");

	By searchBtn = By.id("nav-search-submit-button");
	
	public WebElement getSearchBox() {

		return driver.findElement(searchBox);
	}
	
	public WebElement getSearchButton() {
		return driver.findElement(searchBtn);
	}

	public void clickOnProductByPrice(String amount) {
		
		List<WebElement> cheapProducts = driver.findElements(By.xpath("//span[@class='a-price']/span[@class='a-offscreen' and translate(substring(., 2), ',', '') > '"+amount+"']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(cheapProducts.get(0)).click().perform();
		
	}
	public void clickOnProductByPriceRange(String lowAmount,String highAmount) {
		
		List<WebElement> cheapProducts = driver.findElements(By.xpath("//span[@class='a-price']/span[@class='a-offscreen' and translate(substring(., 2), ',', '') >"+lowAmount+" and @class='a-offscreen' and translate(substring(., 2), ',', '')<"+highAmount+" ]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(cheapProducts.get(0)).click().perform();
		
	}
}

package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class ItemBasePage {	
	
	WebDriver driver;
	WebDriverWait wait;
	
private By BuyNowButton = By.id("//*[@id=\"binBtn_btn\"]");
private	By AddToCartButton = By.id("//*[@id=\"atcRedesignId_btn\"]");
private	By MakeAnOffer = By.id("//*[@id=\"boBtn_btn\"]");
private By itemPrice = By.id("prcIsum");

public By getBuyNowButtonById() {
	return BuyNowButton;
}
public By getAddToCartButtonById() {
	return AddToCartButton;
}
public By getMakeAnOfferById() {
	return MakeAnOffer;
}

public By getItemPriceById() {
	return itemPrice;
}
/**
 * @return 
 * @getNumberOfTimesViewedPerHour returns number of times the watch is viewed
 */ 
public abstract String getNumberOfTimesViewedPerHour();
/**
 * @return 
 * @getMyUrl() returns the current Url
 */
public abstract String getMyUrl();
/**
 * @return 
 * @
 */
public abstract String trimViewedPerHourText();
	
	

}

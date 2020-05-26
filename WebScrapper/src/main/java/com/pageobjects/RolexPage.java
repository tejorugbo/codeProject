package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.resources.BasePage;

public class RolexPage extends BasePage{

	// define locators
	private By featuredEventImage = By.cssSelector(".b-img[role=presentation");
	private By ebayLogo = By.id("gh-logo");
	private String getLogo;

	public RolexPage(WebDriver driver) {
		super(driver);

	}
	
	

	/**
	 * @param driver
	 * @param featuredEventImage
	 * @param ebayLogo
	 * @param getLogo
	 */
	public RolexPage(WebDriver driver, By featuredEventImage, By ebayLogo, String getLogo) {
		super(driver);
		this.featuredEventImage = featuredEventImage;
		this.ebayLogo = ebayLogo;
		this.getLogo = getLogo;
		getEbayLogo();
		getFeaturedEventImage();
		
	}



	public String getLogoText() {
		String getLogo = driver.findElement(ebayLogo).getAttribute("alt");
		System.out.println("The home page displays the eBay logo and the displayed text is: " + getLogo.toString());
		return getLogo;
	}

	public WebElement getFeaturedEventImage() {
		return getElement(featuredEventImage);
	}

	public String getEbayLogo() {
		return getLogo;
	}
	public void clickFeaturedEventImg() {
		
		driver.findElement(featuredEventImage).click();
		System.out.println("I clicked the feature page image");
	}



}

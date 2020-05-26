package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.resources.BasePage;
import com.utils.BasePageConstants;

public class HomePage extends BasePage implements BasePageConstants{
	public WebDriver driver;
	public WebDriverWait wait;
	By newEbayLogo = By.id("gh-logo"); 
	By ebayLogo = By.id("//*[contains(@id, 'gh-logo')]");// *[@id="gh-la"]
	By tableHeader = By.xpath("//*[@id=\"gh\"]");     //By.tagName("header"); 
	By  getLogoText = By.xpath("//a[@href='https://www.ebay.com/']");      //By.tagName("a");
	By featuredEvent = By.xpath("//*[@id='s0-25-9-0-1[1]-0-0-bModCarousel']/div[1]/div/h2");
	By featuredEventFooter = By.xpath("//*[@class='b-event__footer-title']");
	
	
	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
	//	this.wait = new WebDriverWait(this.driver, 15);
	}

//	public HomePage(WebDriver driver) {
//		this.driver = driver;
//	}
	
//	@Override
//	public void waitForElementToBePresent(By ebayLogo) {
//		try{
//			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(ebayLogo));
//			driver.findElement(ebayLogo).isDisplayed();
//		}catch(Exception e) {
//			System.out.println("Unable to locate the eBay logo: " + ebayLogo.toString());
//		}
//		
//	}
//	public String getLogoText() {
//		
//		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(newEbayLogo));
//		String getLogo = driver.findElement(newEbayLogo).getAttribute("alt"); 
//		System.out.println("The home page displays the eBay logo and the displayed text is: " + getLogo);
//		return getLogo;
//	}
	@Override
	public void getTitle() {
		String 	actualTitle = driver.getTitle();
			System.out.println("ActualTitle is :" + actualTitle );
			
		}
}

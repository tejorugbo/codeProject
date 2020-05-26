package com.pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.resources.BasePage;
import com.utils.RolexPageConstants;

public class RolexWatchesPage extends BasePage implements RolexPageConstants {

	public WebDriver driver;
	public WebElement nextModelItemButton;
	public WebElement nextAuthenticityItemButton;
	public WebElement nextLimitedTimeDealsItemButton;
	public String pagetitle;
	public String featuredEventHeader;
	public WebDriverWait wait;
	public By featuredEventPage = By.cssSelector(".b-event__footer-title");
	BasePage launchBrowser = new BasePage();
	
	
	//public String searchUpTo30PercentOffButton;
	//  searchUpTo30PercentOffButton = By.xpath("//button[@class='ks__form__submit']");
	public RolexWatchesPage() {
		super();
		this.driver = driver;
	}
	
	public RolexWatchesPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		try {
			launchBrowser.initializeDriver();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("The driver supplied is not recognized as the current driver. supplied driver =  " + driver);
		}
	}
	
	

	@Override
	public void shopByModel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void goToSubmarinerModel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void goToCosmographDaytonaModel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void goToDateJustModel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void goToGmtMasterModel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void goToExplorerModel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void goToDayDateModel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void goToYatchMasterModel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void goToAirKingModel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void goToFeaturedEvent() {
	try {
		driver.findElement(featuredEventPage).click();
		wait = new WebDriverWait(driver, 10);
		Thread.sleep(3000L);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@role='presentation']")));
	}catch(Exception e) {
		System.out.println("The search button on featured events page was not found.");
	}
	}

	@Override
	public void shopByAuthenticityVerified() {
		// TODO Auto-generated method stub

	}

}

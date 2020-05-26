package com.pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.resources.BasePage;

public class ItemPage extends ItemBasePage{
	
	WebDriver driver;
	WebDriverWait wait;
	String url, numberOfTimesViewed;
	String numberOfTimesViewedCount;
	private By numberOFTimesViewed = By.xpath("//*[@id='vi_notification_new']/span");
	
	public ItemPage() {
		super();
		this.driver = driver;
		//this.wait = new WebDriverWait(driver, 15);
		
		BasePage basePage = new BasePage();
		try {
			basePage.initializeDriver();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	
	
	
	
	
	
	@Override
	public String getNumberOfTimesViewedPerHour() {
		String numT = numberOfTimesViewed.toString();
		return numT;
		
	}

	@Override
	public String getMyUrl() {
		String url = driver.getCurrentUrl().toString();
		return url;		
	}

	@Override
	public String trimViewedPerHourText() {
		numberOfTimesViewed = url;
		numberOfTimesViewed.toString().substring(0, 3);
		return numberOfTimesViewed;
	}
	

}

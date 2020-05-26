package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.resources.BasePage;

public class RetrieveFeaturedWatches extends BasePage {

RolexPage rolexPage;
WebDriver driver;


	
	public RetrieveFeaturedWatches(WebDriver driver) {
	super(driver);
	// TODO Auto-generated constructor stub
}



	public void doFeatureClick() {
	rolexPage = new RolexPage( driver);
	}

}

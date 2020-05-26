package com.testpages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pageobjects.FeaturedEventPage;
import com.pageobjects.HomePage;
import com.pageobjects.RolexWatchesPage;
import com.resources.BasePage;
import com.utils.BasePageConstants;

public class NewTest extends BasePage{
	
	public By featuredEventPages = By.cssSelector(".b-event__footer-title");
	public WebDriver driver;
	WebDriverWait wait;
	public Properties prop;
	String pageTitle, currentUrl;
	FeaturedEventPage featured;
	

	public NewTest(WebDriver driver) {
		super(driver);
		this.driver=driver;
		wait = new WebDriverWait(driver, 20);
	}

	public NewTest() {
		super();
		
	}

	BasePage bp = new BasePage(driver);

	@BeforeMethod
	public void initialize() throws IOException {

		driver = bp.initializeDriver();
//	logs.info("Driver is initialized");
		driver.get(BasePageConstants.GET_URL);
		pageTitle = driver.getTitle();
		System.out.println("The page title is :" + pageTitle);
		currentUrl = driver.getCurrentUrl();
		System.out.println("The current Url page is:  " + currentUrl);

	}

	
	
//	@Test
//	public void retrieveFeaturedWatchList() {
//		try {
//			HomePage checkLogo = new HomePage(driver);
//			checkLogo.checkLogoIsDisplayed();
//			if (checkLogo.checkLogoIsDisplayed()) {
//				checkLogo.getLogoText();
//			} else if (!checkLogo.checkLogoIsDisplayed()) {
//				System.out.println(" Logo is not present");
//			}
//
//		RolexWatchesPage rolexPage = new RolexWatchesPage();
//		
//		rolexPage.goToFeaturedEvent();
//		featured = new FeaturedEventPage();
//		featured.getAllFeaturedWatchesList();
//		
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
//	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	

}

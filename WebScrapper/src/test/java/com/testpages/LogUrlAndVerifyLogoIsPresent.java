package com.testpages;

import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageobjects.FeaturedEventPage;
import com.pageobjects.HomePage;
import com.pageobjects.ItemPage;
import com.pageobjects.RolexPage;
import com.pageobjects.RolexWatchesPage;
import com.pageobjects.ShopByAuthenticityPage;
import com.pageobjects.ShopByLimitedTimeDeals;
import com.resources.BasePage;
import com.utils.BasePageConstants;
import com.resources.*;

public class LogUrlAndVerifyLogoIsPresent extends BasePage {
	public By featuredEventPages = By.cssSelector(".b-event__footer-title");
	public WebDriver driver;
	public Properties prop;
	String pageTitle, currentUrl;
	FeaturedEventPage featured;
	public List<WebElement> anchorTag;
	public String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);;
	public WebDriverWait waitForUrlToLoad;
	
	List<WebElement> tagInWatches;
	By featuredWatchList = By.xpath("//*[@id='s0-25-9-0-1[0]-0-1']/ul/li/div/div/div");
	By listItem = By.tagName("a");
	By featuredEventImage = By.cssSelector(".b-img[role=presentation");
	 By ebayLogo = By.id("gh-logo");
	 String getLogo; //*[@id="s0-25-9-0-1[0]-0-1"]/ul/li[1]/div
	 
	public LogUrlAndVerifyLogoIsPresent() {
		super();
		this.driver = driver;
	}

	BasePage bp = new BasePage(driver);
	RolexPage rolexPage,rolexPageTest;
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

	//@Test
	public void goToAuthenticityPage() {

		// On landing on the home page, the presence of the logo is verified as
		// displayed
		try {
		
		ShopByAuthenticityPage authenticityVerifiedWatches = new ShopByAuthenticityPage(driver);
		authenticityVerifiedWatches.getAllShopByAuthenticityList();
		}catch(Exception e) {
			e.printStackTrace();
		}
//		ShopByLimitedTimeDeals limitedTimeDealsList = new ShopByLimitedTimeDeals(driver);
//		limitedTimeDealsList.getWatchesOnTheLimitedTimeDeal();

	}

//	@Test
//	public void goToShopByModelPage()  {
//		try {
//		HomePage checkLogo = new HomePage(driver);
//		checkLogo.checkLogoIsDisplayed();
//		if (checkLogo.checkLogoIsDisplayed()) {
//			checkLogo.getLogoText();
//		} else if (!checkLogo.checkLogoIsDisplayed()) {
//			System.out.println(" Logo is not present");
//		}
//
//		ShopByLimitedTimeDeals limitedTimeDealsList = new ShopByLimitedTimeDeals(driver);
//		limitedTimeDealsList.getWatchesOnTheLimitedTimeDeal();
//
//	}catch(Exception e) {
//		e.printStackTrace();
//	}
//				
//	}
	
	
	@Test
	public void retrieveFeaturedWatchList() {
		try {
			//HomePage checkLogo = new HomePage(driver);

		rolexPage = new RolexPage(driver);
		rolexPage.getEbayLogo();
		rolexPage.getFeaturedEventImage();
		//**inserting new lines of code
		rolexPageTest = new RolexPage(driver, ebayLogo, ebayLogo, clickonlinkTab);
		rolexPageTest.getLogoText();
		//code below worked till above was added
		rolexPage.clickFeaturedEventImg();
		featured = new FeaturedEventPage(driver);
//		int numWatches = driver.findElements(featuredWatchList).size();
//		int columnDriver = numWatches;
//		System.out.println(columnDriver);
///		System.out.println("The number of watches in the Featured list is " + numWatches );
		featured.getAllFeaturedWatchesList();
		driver.findElement(By.xpath("//*[@id='s0-25-9-0-1[0]-0-1']/ul/li/div/div/div/a")).click();
		Thread.sleep(3000L);
//		ItemPage iPage = new ItemPage();
//		iPage.getNumberOfTimesViewedPerHour();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}

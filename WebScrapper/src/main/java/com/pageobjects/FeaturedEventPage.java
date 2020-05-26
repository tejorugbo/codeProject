package com.pageobjects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.resources.BasePage;
import com.utils.BasePageConstants;

public class FeaturedEventPage extends BasePage implements BasePageConstants{
	public WebElement anchorTag;
	public String clickonlinkTab;
	public WebDriverWait waitForUrlToLoad;

	WebDriver driver;
	WebDriverWait wait;
	By getLogoText = By.xpath("//a[@href='https://www.ebay.com/']");
	By featuredEvent = By.xpath("//*[@id='s0-25-9-0-1[1]-0-0-bModCarousel']/div[1]/div/h2");
	By featuredEventFooter = By.xpath("//*[@class='b-event__footer-title']");
	By featuredWatchList = By.xpath("//*[@id='s0-25-9-0-1[0]-0-1']/ul/li/div/div/div");
	By listItem = By.tagName("a");  //By.xpath("//*[@id='s0-25-9-0-1[0]-0-1']/ul/li[1]");
	String numberOfViewsPerHour;
	List<WebElement> tagInWatches;
	By ebayLogo = By.id("gh-logo");

	public FeaturedEventPage(WebDriver driver) {
		super(driver);

	}//*[@id="s0-25-9-0-1[0]-0-1"]/ul/li[1]/div

	

	public FeaturedEventPage(WebDriver driver, List<WebElement> anchorTag, String clickonlinkTab, By featuredWatchList, By listItem) {
		super(driver);
		this.anchorTag = (WebElement) anchorTag;
		this.clickonlinkTab = clickonlinkTab;
		this.featuredWatchList = featuredWatchList;
		this.listItem = listItem;
		getAllFeaturedWatchesList();
	}



	public List<WebElement> getAllFeaturedWatchesList() {
		try {
			WebElement coloumndriver = driver.findElement(featuredWatchList);
			//tagInWatches = coloumndriver.findElements(listItem);
			System.out.println("The number of watches in the Featured list is " + tagInWatches.size());
			// for (int i = 0; i <tagInWatches.size(); i++) {
			for (int i = 0; i <= 4; i++) {
				clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
				WebElement currentWatch = tagInWatches.get(i);
				anchorTag = currentWatch.findElement(By.tagName("a"));
				anchorTag.click();
//			HomePage hP = new HomePage(driver);
//			hP.waitForElementToBePresent(ebayLogo);
				wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(ebayLogo));
//			logs.info("clicked the url to item " + currentWatch.getText() );
//			logs.debug(numberOfViewsPerHour);

			}
			Set<String> urlLinksToShopByFeaturedWatches = driver.getWindowHandles();// 4
			Iterator<String> browserWindow = urlLinksToShopByFeaturedWatches.iterator();

			while (browserWindow.hasNext()) {

				driver.switchTo().window(browserWindow.next());
				waitForUrlToLoad = new WebDriverWait(driver, 5);
				// waitForUrlToLoad.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("img
				// img500 vi-img-gallery-vertical-align ")));
				// Thread.sleep(2000L);
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				// numberOfViewsPerHour = driver.findElement(viewsPerHour).toString();
				// System.out.println(numberOfViewsPerHour);
				// logs.info("Number of views per hour is " + numberOfViewsPerHour);
				System.out.println(driver.getCurrentUrl());
				this.driver.close();
			}

		} catch (Exception e) {
			System.out.println("An error occured while logging the pages");
		}
		return tagInWatches;
	}

}

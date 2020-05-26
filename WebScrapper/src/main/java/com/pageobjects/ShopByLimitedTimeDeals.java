package com.pageobjects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopByLimitedTimeDeals {
	public WebDriver driver;
	public WebElement anchorTag;
	public String clickonlinkTab;
	//String numberOfViewsPerHour;
	public WebDriverWait waitForUrlToLoad;
	//By viewsPerHour = By.partialLinkText("viewed per hour");
	
	By limitedTimeDeals = By.xpath("//*[@id=\"s0-25_2-9-0-1[1]-0-0-xCarousel-x-carousel-items\"]/ul");
	
	By listItem = By.tagName("li");

	public ShopByLimitedTimeDeals(WebDriver driver) {
		// Specify which driver. Before adding this constructor with this.driver=driver,
		// I was getting a null pointer exception
		this.driver = driver;
	}

	public List<WebElement> getWatchesOnTheLimitedTimeDeal() throws InterruptedException {
        
		WebElement coloumndriver = driver.findElement(limitedTimeDeals);
		List<WebElement> tagInWatches = coloumndriver.findElements(listItem);
		System.out.println("The number of watches in the limited Time Deals list is " + tagInWatches.size());
		//for (int i = 0; i < tagInWatches.size(); i++) {
			for (int i = 0; i <=4; i++) {
			clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			WebElement currentWatch = tagInWatches.get(i);
			anchorTag = currentWatch.findElement(By.tagName("a"));
			anchorTag.sendKeys(clickonlinkTab);
			
			
		}
		Set<String> urlLinksToShopByLimitedTimeDealsWatches = driver.getWindowHandles();// 4
		Iterator<String> browserWindow = urlLinksToShopByLimitedTimeDealsWatches.iterator();

		while (browserWindow.hasNext()) {

			driver.switchTo().window(browserWindow.next());
			waitForUrlToLoad = new WebDriverWait(driver, 5);
			// waitForUrlToLoad.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("img
			// img500 vi-img-gallery-vertical-align ")));
			//Thread.sleep(2000L);
	//		numberOfViewsPerHour = driver.findElement(viewsPerHour).toString();
	//		System.out.println(numberOfViewsPerHour);
			
			System.out.println(driver.getCurrentUrl());
			driver.close();
		}
		return tagInWatches;

	}


}

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

public class ShopByAuthenticityPage {
	//public static Logger logs = LogManager.getLogger(ShopByAuthenticityPage.class.getName());
			public WebDriver driver;
			public WebElement anchorTag;
			public String clickonlinkTab;
			String numberOfViewsPerHour;
			public WebDriverWait wait;
			public WebDriverWait waitForUrlToLoad;
			List<WebElement> tagInWatches;
			By ebayLogo = By.id("gh-logo");//
		//	By viewsPerHour = By.id("vi_notification_new"); //document.getElementById("vi_notification_new").textContent
		    
			public String getViewsPerHour;
			public ShopByAuthenticityPage() {
				super();
				// TODO Auto-generated constructor stub
			}

			// By shopByModel =
			// By.xpath("//*[@id=\"s0-25-9-0-1[0]-0-0-xCarousel-x-carousel-items\"]/ul");
			By authenticityVerified = By.xpath("//*[@id='s0-25_1-9-0-1[0]-0-0-xCarousel-x-carousel-items']/ul");
			By listItem = By.tagName("li");  //*[@id="s0-25_2-9-0-1[0]-0-0-xCarousel-x-carousel-items"]/ul

			public ShopByAuthenticityPage(WebDriver driver) {
				// Specify which driver. Before adding this constructor with this.driver=driver,
				// I was getting a null pointer exception
				this.driver = driver;
				//this.wait = new WebDriverWait(this.driver, 15);
			}
//			public String getViewsPerHour () throws InterruptedException {
//				Thread.sleep(3000L);
//				getViewsPerHour = driver.findElement(By.id("vi_notification_new")).getText();
//				return getViewsPerHour;
//				
//			}

			public List<WebElement> getAllShopByAuthenticityList()  {
		        try {
				WebElement coloumndriver = driver.findElement(authenticityVerified);
				tagInWatches = coloumndriver.findElements(listItem);
				System.out.println("The number of watches in the Authenticity verified list is " + tagInWatches.size());
				//for (int i = 0; i <tagInWatches.size(); i++) {
				for (int i = 0; i <=4; i++) {
					clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
					WebElement currentWatch = tagInWatches.get(i);
					anchorTag = currentWatch.findElement(By.tagName("a"));
					anchorTag.sendKeys(clickonlinkTab);
					HomePage hP = new HomePage(driver);
					hP.waitForElementToBePresent(ebayLogo);
					wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(ebayLogo));
//					logs.info("clicked the url to item " + currentWatch.getText() );
//					logs.debug(numberOfViewsPerHour);
					
				}
				Set<String> urlLinksToShopByAuthenticityWatches = driver.getWindowHandles();// 4
				Iterator<String> browserWindow = urlLinksToShopByAuthenticityWatches.iterator();

				while (browserWindow.hasNext()) {

					driver.switchTo().window(browserWindow.next());
					waitForUrlToLoad = new WebDriverWait(driver, 5);
					// waitForUrlToLoad.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("img
					// img500 vi-img-gallery-vertical-align ")));
					//Thread.sleep(2000L);
					driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				//	numberOfViewsPerHour = driver.findElement(viewsPerHour).toString();
					//System.out.println(numberOfViewsPerHour);
					//logs.info("Number of views per hour is " + numberOfViewsPerHour);
					System.out.println(driver.getCurrentUrl());
					this.driver.close();
				}
				

			}catch(Exception e) {
				System.out.println("An error occured while logging the pages");
			}
		        return tagInWatches;
	}

}

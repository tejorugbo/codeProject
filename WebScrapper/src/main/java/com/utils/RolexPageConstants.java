package com.utils;

import org.openqa.selenium.By;

public interface RolexPageConstants {

	
	
	/**
	 *@ FILE_INPUT_STREAM_PATH - specifies path to file input
	 */
final String Rolex_Page_Title = "D:\\eBay Project\\EbayCodeChallenge-master\\WebScrapper\\src\\main\\java\\com\\resources\\data.properties";
/**
 * @CHROME browser name
 */
final String CHROME = "webdriver.chrome.driver";
/**
 * @CHROME_DRIVER_EXE path
 */
final String CHROME_DRIVER_EXE = "D:\\eBay Project\\EbayCodeChallenge-master\\WebScrapper\\chromedriver.exe";
/**
 *@F_F fire fox browser 
 */
final String F_F = "webdriver.gecko.drive";
/**
 * @GECKO_DRIVER_EXE path
 */
final String GECKO_DRIVER_EXE = "D:\\eBay Project\\EbayCodeChallenge-master\\WebScrapper\\geckodriver.exe";
/**
 * @InternetExplorer browser name
 */
final String InternetExplorer = "webdriver.ie.driver";
/**
 * @IE_SERVER_EXE  path
 */
final String IE_SERVER_EXE = "D:\\eBay Project\\EbayCodeChallenge-master\\WebScrapper\\IEDriverServer.exe";
/**
 * @get_Url This gets the link from the properties file
 */
final String GET_URL = "https://www.ebay.com/b/Rolex-Wristwatches/31387/bn_2989578";
/**
 * @gOTo_PAGE
 */
//public String launchBrowser();
/**
 * @
 */
public abstract void getTitle();
/**
 * @Abstract method to wait for specified element at runtime
 */
public abstract void waitForElementToBePresent(By locator);
/**
 * @Abstract waitForPageTitleToBePresent method to wait for specified element at runtime
 */
public abstract void waitForPageTitleToBePresent(By locator);
/**
 * @shopByModel fetches all the listed items in the shop by model category
 */
public abstract void shopByModel();
/**
 * @goToSubmarinerModel returns the Rolex Submariner Watches page
 */
public abstract void goToSubmarinerModel();
/**
 * @goToCosmographDaytonaModel returns the Rolex Cosmograph Daytona Wristwatches page
 */
public abstract void goToCosmographDaytonaModel();
/**
 * @goToDateJustModel returns the Rolex Date Just Wristwatches page
 */
public abstract void goToDateJustModel();
/**
 * @goToGmtMasterModel returns the Rolex GMT-MASTER Wristwatches page
 */
public abstract void goToGmtMasterModel();
/**
 *@goToExplorerModel returns the Rolex Explorer Wristwatches page
 */
public abstract void goToExplorerModel();
/**
 *@goToDayDateModel returns the Rolex Day-Date Wristwatches page
 */
public abstract void goToDayDateModel();
/**
 * goToYatchMasterModel returns the Rolex Yatch Master Wristwatches page
 */
public abstract void goToYatchMasterModel();
/**
 *@goToAirKingModel returns the Rolex Air King Wristwatches page
 */
public abstract void goToAirKingModel();
/**
 * @goToFeaturedEvent  returns the Rolex Sea Dweller Wristwatches page
 */ 
public abstract void goToFeaturedEvent();
/**
 * @shopByAuthenticityVerified returns Authenticity Verified watches page
 */ 
public abstract void shopByAuthenticityVerified();
/**
 * @
 */

}

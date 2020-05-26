/**
	 * @author tej.orugbo
	 */

package com.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface BasePageConstants {
	
	
	/**
	 *@ FILE_INPUT_STREAM_PATH - specifies path to file input
	 */
final String FILE_INPUT_STREAM_PATH = "D:\\eBay Project\\EbayCodeChallenge-master\\WebScrapper\\src\\main\\java\\com\\resources\\data.properties";
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
public void getTitle();
/**
 * @Abstract method to wait for specified element at runtime
 */
public abstract void waitForElementToBePresent(By locator);
/**
 * @Abstract waitForPageTitleToBePresent method to wait for specified element at runtime
 */
public abstract void waitForPageTitleToBePresent(By locator);
/**
 * @
 */
WebElement getElement(By locator);
}

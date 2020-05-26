package com.testresources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.resources.BasePage;
import com.utils.BasePageConstants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest extends BasePage {
	// Create a properties file for selecting browser. Here we initialize the driver
		public WebDriver driver;
		public Properties prop;

		public BaseTest(WebDriver driver) {
			super();
			this.driver = driver;
		}

//		public BaseTest() {
//			// TODO Auto-generated constructor stub
//		}

		public WebDriver initializeDriver() throws IOException {

			prop = new Properties();
			try {
				FileInputStream fis = new FileInputStream(BasePageConstants.FILE_INPUT_STREAM_PATH);
				prop.load(fis);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			String browserName = prop.getProperty("browser");

			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty(BasePageConstants.CHROME, BasePageConstants.CHROME_DRIVER_EXE);
				driver = new ChromeDriver();
				// execute in chrome Driver
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty(BasePageConstants.F_F, BasePageConstants.GECKO_DRIVER_EXE);
				driver = new FirefoxDriver();
				driver.getCurrentUrl();// ***
				// execute in firefox Driver.
			} else if (browserName.equalsIgnoreCase("IE")) {
				System.setProperty(BasePageConstants.InternetExplorer, BasePageConstants.IE_SERVER_EXE);
				driver = new InternetExplorerDriver();

				// execute in Internet Explorer Driver
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			return driver;
		}

}

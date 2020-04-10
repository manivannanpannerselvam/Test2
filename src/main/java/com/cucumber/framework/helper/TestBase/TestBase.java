package com.cucumber.framework.helper.TestBase;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.cucumber.framework.configreader.ObjectRepo;
import com.cucumber.framework.configreader.PropertyFileReader;
import com.cucumber.framework.configuration.browser.BrowserType;
import com.cucumber.framework.configuration.browser.ChromeBrowser;

import com.cucumber.framework.utility.DateTimeHelper;
import com.cucumber.framework.utility.ResourceHelper;

import com.google.common.base.Function;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;




/**
 * 
 * @author bsingh5
 *
 */
public class TestBase {

	//private final Logger log = LoggerHelper.getLogger(TestBase.class);
	
	public static WebDriver driver;

	public void waitForElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 9000000);
		wait.ignoring(NoSuchElementException.class);
		wait.ignoring(ElementNotVisibleException.class);
		wait.ignoring(StaleElementReferenceException.class);
		wait.ignoring(ElementNotVisibleException.class);
		wait.pollingEvery(300, TimeUnit.SECONDS);
		wait.until(elementLocated(element));
	}

	private Function<WebDriver, Boolean> elementLocated(final WebElement element) {
		return new Function<WebDriver, Boolean>() {

			public Boolean apply(WebDriver driver) {
				//log.debug("Waiting for Element : " + element);
				return element.isDisplayed();
			}
		};
	
	}
	public WebDriver getBrowserObject(BrowserType bType) throws Exception {
		try {
		//	log.info(bType);

			switch (bType) {

			case Chrome:
				
				ChromeBrowser chrome = ChromeBrowser.class.newInstance();
				return chrome.getChromeDriver(chrome.getChromeCapabilities());

			}
		} catch (Exception e) {
		//	log.equals(e);
			throw e;
		}
		return null;
	}
	
	public void setUpDriver(BrowserType bType) throws Exception 
	{
		
		driver = getBrowserObject(bType);
	//	log.debug("InitializeWebDrive : " + driver.hashCode());
		driver.manage().timeouts().pageLoadTimeout(ObjectRepo.reader.getPageLoadTimeOut(), TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(ObjectRepo.reader.getImplicitWait(), TimeUnit.SECONDS);
	//	driver.manage().window().maximize();
		
	}
	
	@Before
	public void before() throws Exception 
	{
	
		ObjectRepo.reader = new PropertyFileReader();
		setUpDriver(ObjectRepo.reader.getBrowser());
	//	log.info(ObjectRepo.reader.getBrowser());
	}  

	@After
	public void after(Scenario scenario) throws Exception 
	{
	
		Thread.sleep(1000);
		
		 if (scenario.isFailed()) {
		      // Take a screenshot...
		      final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		      scenario.embed(screenshot, "image/png"); // ... and embed it in the report.
		    }

		 driver.quit();
		Thread.sleep(2000);
		//log.info("Browser is closed");
	}
	
	
}

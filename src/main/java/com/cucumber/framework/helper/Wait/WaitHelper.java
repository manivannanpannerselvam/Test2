package com.cucumber.framework.helper.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;





public class WaitHelper {
	
	private WebDriver driver;
	
	public WaitHelper(WebDriver driver) 
	{
		this.driver = driver;
	
	}
	
	

	public void setImplicitWait(long timeout, TimeUnit unit) {
	
		driver.manage().timeouts().implicitlyWait(timeout, unit == null ? TimeUnit.SECONDS : unit);
	}
	
	
	public void waitForElement(WebDriver driver, WebElement elements, long timeout) {
		
		System.out.println("Waht is the Timeout   "+timeout);
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		
		wait.pollingEvery(10, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOf(elements));
		wait.ignoring(WebDriverException .class);
		wait.ignoring(NoSuchElementException.class);
		wait.ignoring(ElementNotVisibleException.class);
		wait.ignoring(StaleElementReferenceException.class);
		wait.ignoring(NoSuchFrameException.class);
		
	
	}
	
	public WebElement waitForElement(WebDriver driver,long time,WebElement element){
		WebDriverWait wait = new WebDriverWait(driver, time);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	
	

}

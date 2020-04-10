package com.cucumber.framework.IMDb_page;

import java.util.Iterator;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.configreader.ObjectRepo;
import com.cucumber.framework.helper.Wait.WaitHelper;
import com.cucumber.framework.helper.genericHelper.GenericHelper;

public class Search_test_page {
	
	
	WebDriver driver;
	
	WaitHelper waitHelper;
	Actions actions;
	
	
	@FindBy(xpath=".//input[@id='suggestion-search' or @name='q']")
	WebElement search_field;
	
	
	@FindBy(xpath=".//button[@id='suggestion-search-button'  or @type='submit']")
	WebElement search_button;
	
	@FindBy(xpath=".//div[@class='article']")
	WebElement Empty_search_data;
	
	@FindBy(xpath=".//h1[@class='findHeader']")
	WebElement No_Result_found;

	
	public Search_test_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		//
	}
	
	public void search_field_Edit() throws InterruptedException
	{
		waitHelper.waitForElement(driver, search_field,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, search_field,ObjectRepo.reader.getExplicitWait());
		
		search_field.clear();
	}
	
	public void search_field(String search_field) throws InterruptedException
	{
		
		this.search_field.sendKeys(search_field);
	}
	
	public void search_button() throws InterruptedException
	{
		waitHelper.waitForElement(driver, search_button,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, search_button,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(search_button);
		
		actions.click().build().perform();
	}
	public String verify_Empty_search()
	{
		//return new GenericHelper().isDisplayed(successMsgObject);
		
		return new GenericHelper().getElementText(Empty_search_data);
	}
	public String verify_search_getvalues()
	{
		return new GenericHelper().getElementTexts(search_field);
	}
	public String Verify_no_found_record()
	{
		
		
		return new GenericHelper().getElementText(No_Result_found);
	}
	
	
	

}

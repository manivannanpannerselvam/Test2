package com.cucumber.framework.Mapsyn_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.configreader.ObjectRepo;
import com.cucumber.framework.helper.Wait.WaitHelper;
import com.cucumber.framework.helper.genericHelper.GenericHelper;

public class Search_test_pages {
	
    WebDriver driver;
	
	WaitHelper waitHelper;
	Actions actions;
	
	
	@FindBy(xpath=".//input[@id='txtSearchIncidentsingapore']")
	WebElement search_field;
	
	@FindBy(xpath=".//div[@class='item_content']/div//preceding::div[@class='item_icon sprite road_jam_nopin']")
	WebElement Search_list;
	
	@FindBy(xpath=".//input[@id='txtSearchIncidentsingapore']")
	WebElement Edit_search_Data;
	
	@FindBy(xpath=".//div[@class='no_result_txtSearchIncidentsingapore']")
	WebElement Verify_No_Result_found;
	
	
	public Search_test_pages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		//
	}
	
	public String verify_search_getvalu()
	{
		return new GenericHelper().getElementTexts(search_field);
	}
	
	public void search_field(String search_field) throws InterruptedException
	{
		this.search_field.sendKeys(search_field);
	}
	public boolean Search_list()
	{
		return new GenericHelper().isDisplayed(Search_list);
	}

	public void search_fields_Edit() throws InterruptedException
	{
		waitHelper.waitForElement(driver, search_field,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, search_field,ObjectRepo.reader.getExplicitWait());
		
		search_field.clear();
	}
	public String Edit_search_Data()
	{
		return new GenericHelper().getElementTexts(Edit_search_Data);
	}
	public boolean Verify_No_Result_found()
	{
		return new GenericHelper().isDisplayed(Verify_No_Result_found);
	}
}

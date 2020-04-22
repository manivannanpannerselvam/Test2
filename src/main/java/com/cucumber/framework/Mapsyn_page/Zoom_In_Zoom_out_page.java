package com.cucumber.framework.Mapsyn_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.configreader.ObjectRepo;
import com.cucumber.framework.helper.Wait.WaitHelper;
import com.cucumber.framework.helper.genericHelper.GenericHelper;

public class Zoom_In_Zoom_out_page {
	
WebDriver driver;
	
	WaitHelper waitHelper;
	Actions actions;
	
	
	@FindBy(xpath=".//div[@id='QiPanZoomBar_2_zoomin']")
	WebElement Zoom_In_zoom_out;
	
	@FindBy(xpath=".//div[@id='ad_toggle']")
	WebElement Zoom_Menu;
	
	@FindBy(xpath=".//div[@id='QiPanZoomBar_2_zoomout']")
	WebElement Zoom_out;
	
	@FindBy(xpath=".//a[@id='galactioLink']")
	WebElement Map_Image_click;
	
	@FindBy(xpath=".//h1[text()='Not Found']")
	WebElement Error_page_screen;
	
	@FindBy(xpath=".//h2[text()='Tolls']")
	WebElement Tolls;
	
	@FindBy(xpath=".//input[@id='txtSearchERPsingapore']")
	WebElement Tolls_search;
	
	@FindBy(xpath=".//a[text()='Anson Road']")
	WebElement Anson_road_link;
	
	@FindBy(xpath=".//b[text()='Anson Road']")
	WebElement verify_Anson_road_link;
	
	
	public Zoom_In_Zoom_out_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		//
	}
	
	public boolean verify_Anson_road_link() throws InterruptedException
	{
		Thread.sleep(7000);
		return new GenericHelper().isDisplayed(verify_Anson_road_link);
	}
	
	public void Anson_road_link() throws InterruptedException
	{
		waitHelper.waitForElement(driver, Anson_road_link,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, Anson_road_link,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(Anson_road_link);
		
		actions.click().build().perform();
		
	}
	
	public void search_field(String Tolls_search) throws InterruptedException
	{
		this.Tolls_search.sendKeys(Tolls_search);
	}
	
	public void Tolls() throws InterruptedException
	{
		waitHelper.waitForElement(driver, Tolls,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, Tolls,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(Tolls);
		
		actions.click().build().perform();
		
	}
	
	public boolean Error_page_screen()
	{
		return new GenericHelper().isDisplayed(Error_page_screen);
	}
	public void Map_Image_click() throws InterruptedException
	{
		waitHelper.waitForElement(driver, Map_Image_click,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, Map_Image_click,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(Map_Image_click);
		
		actions.click().build().perform();
		
	}
	
	public void Zoom_out() throws InterruptedException
	{
		waitHelper.waitForElement(driver, Zoom_out,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, Zoom_out,ObjectRepo.reader.getExplicitWait());
		for(int i=0;i<=5;i++)
		{
		actions = new Actions(driver);
		actions.moveToElement(Zoom_out);
		
		actions.click().build().perform();
		}
	}
	
	public void Zoom_In_zoom_out() throws InterruptedException
	{
		waitHelper.waitForElement(driver, Zoom_In_zoom_out,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, Zoom_In_zoom_out,ObjectRepo.reader.getExplicitWait());
		for(int i=0;i<=5;i++)
		{
		actions = new Actions(driver);
		actions.moveToElement(Zoom_In_zoom_out);
		
		actions.click().build().perform();
		}
	}
	public void Zoom_Menu() throws InterruptedException
	{
		waitHelper.waitForElement(driver, Zoom_Menu,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, Zoom_Menu,ObjectRepo.reader.getExplicitWait());
		
		Thread.sleep(5000);
		actions = new Actions(driver);
		actions.moveToElement(Zoom_Menu);
		
		actions.click().build().perform();
		
	}
	

}

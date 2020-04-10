package com.cucumber.framework.IMDb_page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.configreader.ObjectRepo;

import com.cucumber.framework.helper.Wait.WaitHelper;
import com.cucumber.framework.helper.genericHelper.GenericHelper;

public class Top_Rated_show_page {

	
	WebDriver driver;
	//private final Logger log = LoggerHelper.getLogger(Top_Rated_show_page.class);
	WaitHelper waitHelper;
	Actions actions;
	
	
	@FindBy(xpath=".//label[@id='imdbHeader-navDrawerOpen--desktop']")
	WebElement menu_icon;
	
	@FindBy(xpath=".//span[text()='Top Rated Shows']")
	WebElement Top_Rated_Shows;
	
	@FindBy(xpath=".//h1[text()='Top Rated TV Shows']")
	WebElement verify_Top_rated_show_screen;
	
	@FindBy(xpath=".//div[text()='Game of Thrones: The Last Watch']")
	WebElement Game_of_thrones_link;
	
	@FindBy(xpath=".//div[@class='title_wrapper']/h1")
	WebElement Verify_Game_of_thrones_title;
	

	@FindBy(xpath=".//span[@itemprop='ratingValue']")
	WebElement verify_rating_value;
	
	@FindBy(xpath=".//span[@itemprop='ratingCount']")
	WebElement verify_rating_count;
	
	public Top_Rated_show_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		//
	}
	public void Game_of_thrones_link() throws InterruptedException
	{
		waitHelper.waitForElement(driver, Game_of_thrones_link,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, Game_of_thrones_link,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(Game_of_thrones_link);
		
		actions.click().build().perform();
	}
	
	public void menu_icon() throws InterruptedException
	{
		waitHelper.waitForElement(driver, menu_icon,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, menu_icon,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(menu_icon);
		
		actions.click().build().perform();
	}
	public void Top_Rated_Shows() throws InterruptedException
	{
		waitHelper.waitForElement(driver, Top_Rated_Shows,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, Top_Rated_Shows,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(Top_Rated_Shows);
		
		actions.click().build().perform();
	}
	
	public String verify_Top_rated_show_screen()
	{
		//return new GenericHelper().isDisplayed(successMsgObject);
		
		return new GenericHelper().getElementText(verify_Top_rated_show_screen);
	}
	
	public String Verify_Game_of_thrones_title()
	{
		//return new GenericHelper().isDisplayed(successMsgObject);
		
		return new GenericHelper().getElementText(Verify_Game_of_thrones_title);
	}
	public boolean verify_rating_value()
	{
		return new GenericHelper().isDisplayed(verify_rating_value);
	}
	
	public boolean verify_rating_count()
	{
		return new GenericHelper().isDisplayed(verify_rating_count);
	}
}

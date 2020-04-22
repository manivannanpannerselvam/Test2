package com.cucumber.framework.Mapsyn_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.framework.configreader.ObjectRepo;
import com.cucumber.framework.helper.Wait.WaitHelper;
import com.cucumber.framework.helper.genericHelper.GenericHelper;

public class Register_Page {
	
	WebDriver driver;
	//private final Logger log = LoggerHelper.getLogger(Create_new_account_page.class);
	WaitHelper waitHelper;
	Actions actions;
	
	
	@FindBy(xpath=".//a[text()='Register ']")
	WebElement Register_icon;
	
	@FindBy(xpath=".//input[@id='profile_first_name']")
	WebElement FirstName;
	
	@FindBy(xpath=".//input[@id='profile_last_name']")
	WebElement LastName;
	
	@FindBy(xpath=".//input[@id='profile_dob']")
	WebElement DateofBirth;
	
	@FindBy(xpath=".//input[@id='profile_email']")
	WebElement Email_Id;
	
	@FindBy(xpath=".//input[@id='password']")
	WebElement Password;
	
	@FindBy(xpath=".//input[@id='identity[password_confirmation]']")
	WebElement Confirm_password;
	
	@FindBy(xpath=".//input[@id='chk_agree']")
	WebElement click_Agree;
	
	@FindBy(xpath=".//input[@name='commit']")
	WebElement click_Submit;
	
	@FindBy(xpath=".//input[@id='profile_gender_M']")
	WebElement Gender;
	
	@FindBy(xpath=".//div[@class='error_signup']")
	WebElement Error_Signup;
	
	
	
	public Register_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		//
	}
	
	public boolean Error_Signup()
	{
		return new GenericHelper().isDisplayed(Error_Signup);
	}
	
	public void Gender() throws InterruptedException
	{
		waitHelper.waitForElement(driver, Gender,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, Gender,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(Gender);
		
		actions.click().build().perform();
	}
	
	
	public void Register_icon() throws InterruptedException
	{
		waitHelper.waitForElement(driver, Register_icon,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, Register_icon,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(Register_icon);
		
		actions.click().build().perform();
	}
	public void FirstName(String FirstName) throws InterruptedException
	{
		//log.info("entering sigin_password." + sigin_password);
		this.FirstName.sendKeys(FirstName);
	}
	
	public void LastName(String LastName) throws InterruptedException
	{
		//log.info("entering sigin_password." + sigin_password);
		this.LastName.sendKeys(LastName);
	}
	
	public void DateofBirth(String DateofBirth) throws InterruptedException
	{
		//log.info("entering sigin_password." + sigin_password);
		this.DateofBirth.sendKeys(DateofBirth);
	}
	public void Email_Id(String Email_Id) throws InterruptedException
	{
		//log.info("entering sigin_password." + sigin_password);
		this.Email_Id.sendKeys(Email_Id);
	}
	
	public void Password(String Password) throws InterruptedException
	{
		//log.info("entering sigin_password." + sigin_password);
		this.Password.sendKeys(Password);
	}
	
	public void Confirm_password(String Confirm_password) throws InterruptedException
	{
		//log.info("entering sigin_password." + sigin_password);
		this.Confirm_password.sendKeys(Confirm_password);
	}
	
	public void click_Agree() throws InterruptedException
	{
		waitHelper.waitForElement(driver, click_Agree,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, click_Agree,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(click_Agree);
		
		actions.click().build().perform();
	}
	
	public void click_Submit() throws InterruptedException
	{
		waitHelper.waitForElement(driver, click_Submit,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, click_Submit,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(click_Submit);
		
		actions.click().build().perform();
	}
	
	
	
}

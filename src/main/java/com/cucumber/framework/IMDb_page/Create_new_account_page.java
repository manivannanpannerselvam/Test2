package com.cucumber.framework.IMDb_page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.cucumber.framework.configreader.ObjectRepo;

import com.cucumber.framework.helper.Wait.WaitHelper;

public class Create_new_account_page {

	WebDriver driver;
	//private final Logger log = LoggerHelper.getLogger(Create_new_account_page.class);
	WaitHelper waitHelper;
	Actions actions;
	
	
	@FindBy(xpath=".//div[text()='Sign In']")
	WebElement sigin_in;
	
	@FindBy(xpath=".//a[text()='Create a New Account']")
	WebElement create_account;
	
	@FindBy(xpath=".//input[@id='ap_customer_name' or @name='customerName']")
	WebElement Username;
	
	@FindBy(xpath=".//input[@id='ap_email' or @name='email']")
	WebElement Email_id;
	
	@FindBy(xpath=".//input[@id='ap_password' or @name='password']")
	WebElement Password;
	
	@FindBy(xpath=".//input[@id='ap_password_check' or @name='passwordCheck']")
	WebElement rePassword;
	
	@FindBy(xpath=".//input[@id='continue' or @type='submit']")
	WebElement Imdb_Button;
	
	@FindBy(xpath=".//label[@for='navUserMenu'][2]")
	WebElement Menu_button;
	
	@FindBy(xpath=".//span[text()='Sign out']")
	WebElement sigin_out;
	
	@FindBy(xpath=".//span[text()='Sign in with IMDb']")
	WebElement Sigin_Imdb;
	
	@FindBy(xpath=".//input[@id='ap_email' or name='email']")
	WebElement sigin_Email_id;
	
	@FindBy(xpath=".//input[@id='ap_password'  or @name='password']")
	WebElement sigin_password;
	
	@FindBy(xpath=".//input[@id='signInSubmit']")
	WebElement sign_in_button;
	
	public Create_new_account_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		//
	}
	public void sign_in_button() throws InterruptedException
	{
		waitHelper.waitForElement(driver, sign_in_button,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, sign_in_button,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(sign_in_button);
		
		actions.click().build().perform();
	}
	
	public void sigin_password(String sigin_password) throws InterruptedException
	{
		//log.info("entering sigin_password." + sigin_password);
		this.sigin_password.sendKeys(sigin_password);
	}
	
	public void sigin_Email_id(String sigin_Email_id) throws InterruptedException
	{
		//log.info("entering sigin_Email_id." + sigin_Email_id);
		this.sigin_Email_id.sendKeys(sigin_Email_id);
	}
	
	public void Sigin_Imdb() throws InterruptedException
	{
		waitHelper.waitForElement(driver, Sigin_Imdb,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, Sigin_Imdb,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(Sigin_Imdb);
		
		actions.click().build().perform();
	}
	
	public void sigin_out() throws InterruptedException
	{
		waitHelper.waitForElement(driver, sigin_out,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, sigin_out,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(sigin_out);
		
		actions.click().build().perform();
	}
	
	public void Menu_button() throws InterruptedException
	{
		waitHelper.waitForElement(driver, Menu_button,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, Menu_button,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(Menu_button);
		
		actions.click().build().perform();
	}
	
	public void Imdb_Button() throws InterruptedException
	{
		waitHelper.waitForElement(driver, Imdb_Button,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, Imdb_Button,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(Imdb_Button);
		
		actions.click().build().perform();
	}
	
	
	public void rePassword(String rePassword) throws InterruptedException
	{
		
		//log.info("entering rePassword." + rePassword);
		this.rePassword.sendKeys(rePassword);
	}
	
	public void Password(String Password) throws InterruptedException
	{
		//log.info("entering Password." + Password);
		this.Password.sendKeys(Password);
	}
	
	public void Email_id(String Email_id) throws InterruptedException
	{
		//log.info("entering Email_id." + Email_id);
		this.Email_id.sendKeys(Email_id);
	}
	
	
	public void Username(String Username) throws InterruptedException
	{
		//log.info("entering Username." + Username);
		this.Username.sendKeys(Username);
	}
	
	
	public void sigin_in() throws InterruptedException
	{
		waitHelper.waitForElement(driver, sigin_in,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, sigin_in,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(sigin_in);
		
		actions.click().build().perform();
	}
	public void create_account() throws InterruptedException
	{
		waitHelper.waitForElement(driver, create_account,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, create_account,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(create_account);
		
		actions.click().build().perform();
	}
	
	
	
}

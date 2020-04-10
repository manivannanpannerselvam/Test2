package com.cucumber.framework.stepdefinition.IMDb_step;

import java.nio.charset.Charset;
import java.util.Random;

//import org.apache.log4j.Logger;

import com.cucumber.framework.IMDb_page.Create_new_account_page;
import com.cucumber.framework.IMDb_page.Search_test_page;
import com.cucumber.framework.helper.TestBase.TestBase;

import cucumber.api.java.en.Then;

public class Create_new_account_step {
	
	//private final Logger log = LoggerHelper.getLogger(Create_new_account_step.class);

	Create_new_account_page create_account;
	
	String Emailid;
	
	String password;
	
	@Then("^click the sigin icon$")
	public void click_the_sigin_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		create_account= new Create_new_account_page(TestBase.driver);
		
		create_account.sigin_in();
	}

	@Then("^click the create new button$")
	public void click_the_create_new_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		create_account= new Create_new_account_page(TestBase.driver);
		
		create_account.create_account();
	}
	@Then("^Enter the UserName in username field \"([^\"]*)\"$")
	public void enter_the_UserName_in_username_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String userName = ""+(int)(Math.random()*Integer.MAX_VALUE);
		
		create_account= new Create_new_account_page(TestBase.driver);
		
		String alphabet= "abcdefghijklmnopqrstuvwxyz";
        String s = "";
        Random random = new Random();
        int randomLen = 1+random.nextInt(9);
        for (int i = 0; i < randomLen; i++) {
            char c = alphabet.charAt(random.nextInt(26));
            s+=c;
        }
         
        System.out.println(s);
		
		create_account.Username("jdtughhhsaats"+s+arg1);
	}
	@Then("^Enter the Email id in Eamil field \"([^\"]*)\"$")
	public void enter_the_Email_id_in_Eamil_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 Emailid = ""+(int)(Math.random()*Integer.MAX_VALUE);
		create_account= new Create_new_account_page(TestBase.driver);
		
		create_account.Email_id("email"+Emailid+arg1);
	}
	@Then("^Enter the password in password field \"([^\"]*)\"$")
	public void enter_the_password_in_password_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 password = ""+(int)(Math.random()*Integer.MAX_VALUE);
		create_account= new Create_new_account_page(TestBase.driver);
		
		create_account.Password("pass"+password+arg1);
	}
	@Then("^Enter the reenter password \"([^\"]*)\"$")
	public void enter_the_reenter_password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		create_account= new Create_new_account_page(TestBase.driver);
		
	
		create_account.rePassword("pass"+password+arg1);
	}
	@Then("^click the Create your ImDb account$")
	public void click_the_Create_your_ImDb_account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		create_account= new Create_new_account_page(TestBase.driver);
		
		create_account.Imdb_Button();
	}
	@Then("^click the Sign out button$")
	public void click_the_Sign_out_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		create_account= new Create_new_account_page(TestBase.driver);
		
		create_account.Menu_button();
		
		create_account.sigin_out();
	}
	

	@Then("^click the sigin with IMbd button$")
	public void click_the_sigin_with_IMbd_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
		create_account= new Create_new_account_page(TestBase.driver);
		
		create_account.Sigin_Imdb();
		
	}
	@Then("^Enter the valid Email id in email field \"([^\"]*)\"$")
	public void enter_the_valid_Email_id_in_email_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		create_account= new Create_new_account_page(TestBase.driver);
		
		create_account.sigin_Email_id("email"+Emailid+arg1);
	}
	
	@Then("^Enter the valid Password id in password field \"([^\"]*)\"$")
	public void enter_the_valid_Password_id_in_password_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		create_account= new Create_new_account_page(TestBase.driver);
		
		create_account.Password("pass"+password+arg1);
	}
	@Then("^click the sign in button$")
	public void click_the_sign_in_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		create_account= new Create_new_account_page(TestBase.driver);
		create_account.sign_in_button();
	}

}

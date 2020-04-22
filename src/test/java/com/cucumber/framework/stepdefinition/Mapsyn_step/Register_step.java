package com.cucumber.framework.stepdefinition.Mapsyn_step;



import java.util.Random;

import org.testng.Assert;

import com.cucumber.framework.Mapsyn_page.Register_Page;
import com.cucumber.framework.configreader.ObjectRepo;
import com.cucumber.framework.helper.TestBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Register_step {
	
	Register_Page Register;
	
	Register_Page Register1;
	
	String Emailid;
	
	String password;
	
	
	@Given("^open the valid url in Mapsynq APP$")
	public void open_the_valid_url_in_Mapsynq_APP() throws Throwable {
	   // Write code here that turns the phrase above into concrete actions
		

		TestBase.driver.get(ObjectRepo.reader.getWebsite());
		
		TestBase.driver1.get(ObjectRepo.reader.getWebsite());
		
	}

	@Then("^click the click the Register icon in Top of the screen$")
	public void click_the_click_the_Register_icon_in_Top_of_the_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Register= new Register_Page(TestBase.driver);
		
		Register1= new Register_Page(TestBase.driver1);
		
		Register.Register_icon();
		
		Register1.Register_icon();
		
	}

@Then("^Enter the Firstname in firstname field \"([^\"]*)\"$")
public void enter_the_Firstname_in_firstname_field(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	String userName = ""+(int)(Math.random()*Integer.MAX_VALUE);
	
	Register= new Register_Page(TestBase.driver);
	
	
	String alphabet= "abcdefghijklmnopqrstuvwxyz";
    String s = "";
    Random random = new Random();
    int randomLen = 1+random.nextInt(9);
    for (int i = 0; i < randomLen; i++) {
        char c = alphabet.charAt(random.nextInt(26));
        s+=c;
    }
     
    System.out.println(s);
	
    Register.FirstName("Test"+s+arg1);
    
    Register1.FirstName("Test"+s+arg1);
	
	
}

@Then("^Enter the lastName in LastName field \"([^\"]*)\"$")
public void enter_the_lastName_in_LastName_field(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Register.LastName(arg1);
	Register1.LastName(arg1);
	
   }

@Then("^Enter the Date of Birth  \"([^\"]*)\"$")
public void enter_the_Date_of_Birth(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Register.DateofBirth(arg1);
	
	Register1.DateofBirth(arg1);
}

@Then("^Choose the Gender$")
public void choose_the_Gender() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Register.Gender();
	
	Register1.Gender();
	
}

@Then("^Enter the Email id \"([^\"]*)\"$")
public void enter_the_Email_id(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	
	 Emailid = ""+(int)(Math.random()*Integer.MAX_VALUE);
		
	 Register.Email_Id("email"+Emailid+arg1);
	 Register1.Email_Id("email"+Emailid+arg1);
		
}

@Then("^Enter the Password in password field \"([^\"]*)\"$")
public void enter_the_Password_in_password_field(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Register.Password(arg1);
	Register1.Password(arg1);
}

@Then("^Enter the confirm password \"([^\"]*)\"$")
public void enter_the_confirm_password(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Register.Confirm_password(arg1);
	Register1.Confirm_password(arg1);
}

@Then("^click the Agree button icon$")
public void click_the_Agree_button_icon() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Register.click_Agree();
	Register1.click_Agree();
}

@Then("^click the submit button$")
public void click_the_submit_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Register.click_Submit();
	Register1.click_Submit();
}

@Then("^Verify the Account should be created$")
public void verify_the_Account_should_be_created() throws Throwable {
    // Write code here that turns the phrase above into concrete act
	
	Register= new Register_Page(TestBase.driver);
	if(Register.Error_Signup())
	{
		
		 Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
	}
	else
	{
		
		 
	}
}



}

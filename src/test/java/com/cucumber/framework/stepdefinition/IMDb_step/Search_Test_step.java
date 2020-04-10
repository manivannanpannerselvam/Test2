package com.cucumber.framework.stepdefinition.IMDb_step;

import java.util.List;


//import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.cucumber.framework.IMDb_page.Search_test_page;
import com.cucumber.framework.configreader.ObjectRepo;
import com.cucumber.framework.helper.TestBase.TestBase;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



public class Search_Test_step {
	
	//private final Logger log = LoggerHelper.getLogger(Search_Test_step.class);

	Search_test_page search;
	
	

@Given("^open the valid url in IMDb application$")
public void open_the_valid_url_in_IMDb_application() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	TestBase.driver.get(ObjectRepo.reader.getWebsite());
}

@Then("^Enter the valid search name in search field \"([^\"]*)\"$")
public void enter_the_valid_search_name_in_search_field(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	search= new Search_test_page(TestBase.driver);
	search.search_field(arg1);
}

@Then("^Verify the All prime name flim list in drop down list \"([^\"]*)\"$")
public void verify_the_All_prime_name_flim_list_in_drop_down_list(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
List<WebElement> search_dropdown = TestBase.driver.findElements(By.xpath(".//div[@class='_2NPnhnjxKTlB8HDsb7RtwX sc-EHOje bFZBPn']"));
	
	System.out.println("How many Prime count is displayed in drop down list"+ search_dropdown.size());
	
	for(int i=0;i<search_dropdown.size();i++)
	{
		System.out.println(search_dropdown.get(i).getText());
		
		if(search_dropdown.get(i).getText().contains(arg1))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
		}
	}
}

@Then("^click the search icon in search field$")
public void click_the_search_icon_in_search_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	search= new Search_test_page(TestBase.driver);
	search.search_button();
}

@Then("^Verify proper message should be displayed$")
public void verify_proper_message_should_be_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	search= new Search_test_page(TestBase.driver);
	if(search.verify_Empty_search().contains("Enter a word or phrase to search on in the form at the top of the page."))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println(" fail ");
		Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");	 
		 
	}
}
@Then("^Enter the Data in search text field \"([^\"]*)\"$")
public void enter_the_Data_in_search_text_field(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	search= new Search_test_page(TestBase.driver);
	search.search_field(arg1);
}

@Then("^Verify the text and number should be displayed in search textbox\"([^\"]*)\"$")
public void verify_the_text_and_number_should_be_displayed_in_search_textbox(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 if(search.verify_search_getvalues().contains(arg1))
	    {
	    	System.out.println("Passs");
	    }
	    else
	    {
	    	System.out.println("Fail");
	    
	    	  Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
	    	
	    }
}

@Then("^Enter the Html query in search field \"([^\"]*)\"$")
public void enter_the_Html_query_in_search_field(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	search= new Search_test_page(TestBase.driver);
	search.search_field(arg1);
}



@Then("^Verify no result found alert message should be display \"([^\"]*)\"$")
public void verify_no_result_found_alert_message_should_be_display(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    if(search.Verify_no_found_record().contains(arg1))
    {
    	System.out.println("Pass");
    }
    else
    {
    	System.out.println("Fail");
    	
    	  Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
    }
}
@Then("^user should be edit the search field$")
public void user_should_be_edit_the_search_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	search= new Search_test_page(TestBase.driver);
	search.search_field_Edit();
}


@Then("^Verify New search data should be displayed in search field  \"([^\"]*)\"$")
public void verify_New_search_data_should_be_displayed_in_search_field(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	if(search.verify_search_getvalues().contains(arg1))
    {
    	System.out.println("Passs");
    }
    else
    {
    	System.out.println("Fail");
    	
    	  Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
    	
    }
}


}

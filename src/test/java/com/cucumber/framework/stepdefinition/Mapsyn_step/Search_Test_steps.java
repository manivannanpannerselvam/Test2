package com.cucumber.framework.stepdefinition.Mapsyn_step;

import org.testng.Assert;

import com.cucumber.framework.Mapsyn_page.Search_test_pages;
import com.cucumber.framework.helper.TestBase.TestBase;

import cucumber.api.java.en.Then;

public class Search_Test_steps {
	
	
	Search_test_pages search;
	
	@Then("^Enter the valid Incidents search name in search field \"([^\"]*)\"$")
	public void enter_the_valid_Incidents_search_name_in_search_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		search= new Search_test_pages(TestBase.driver);
		search.search_field(arg1);
	}

	@Then("^Verify the Search field should be working$")
	public void verify_the_Search_field_should_be_working() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		search= new Search_test_pages(TestBase.driver);
		if(search.Search_list())
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
			Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
		}
	}
	
	@Then("^user should be edit the Incidents search field$")
	public void user_should_be_edit_the_Incidents_search_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		search= new Search_test_pages(TestBase.driver);
		
		search.search_fields_Edit();
	}
	@Then("^Verify the New search data should be displayed \"([^\"]*)\"$")
	public void verify_the_New_search_data_should_be_displayed(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(search.Edit_search_Data().contains(arg1))
	    {
	    	System.out.println("Passs");
	    }
	    else
	    {
	    	System.out.println("Fail");
	    	Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
	    	
	    }
	}
	@Then("^Enter the Htmls query in search field \"([^\"]*)\"$")
	public void enter_the_Htmls_query_in_search_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		search= new Search_test_pages(TestBase.driver);
		
		search.search_field(arg1);
	}
	@Then("^Verify no results found alert message should be display$")
	public void verify_no_results_found_alert_message_should_be_display() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		search= new Search_test_pages(TestBase.driver);
		
		if(search.Verify_No_Result_found())
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
	    	Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
	    	
		}
	}
	@Then("^Enter the Incidents search text field \"([^\"]*)\"$")
	public void enter_the_Incidents_search_text_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		search= new Search_test_pages(TestBase.driver);
		search.search_field(arg1);
	}

	@Then("^Verify the text and number should be displayed in Incidents search textbox\"([^\"]*)\"$")
	public void verify_the_text_and_number_should_be_displayed_in_Incidents_search_textbox(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		search= new Search_test_pages(TestBase.driver);
		if(search.verify_search_getvalu().contains(arg1))
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

package com.cucumber.framework.stepdefinition.IMDb_step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.cucumber.framework.IMDb_page.Search_test_page;
import com.cucumber.framework.IMDb_page.Top_Rated_show_page;
import com.cucumber.framework.helper.TestBase.TestBase;

import cucumber.api.java.en.Then;

public class Top_Rated_movie_step {

	//private final Logger log = LoggerHelper.getLogger(Search_Test_step.class);

	Top_Rated_show_page Movie_page;
	

@Then("^click the Menu icon in IMDb screen$")
public void click_the_Menu_icon_in_IMDb_screen() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Movie_page= new Top_Rated_show_page(TestBase.driver);
	Movie_page.menu_icon();
}

@Then("^click the Top Rated Shows icon$")
public void click_the_Top_Rated_Shows_icon() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Movie_page= new Top_Rated_show_page(TestBase.driver);
	Movie_page.Top_Rated_Shows();
}

@Then("^Verify Top Rated shows screen is displayed \"([^\"]*)\"$")
public void verify_Top_Rated_shows_screen_is_displayed(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Movie_page= new Top_Rated_show_page(TestBase.driver);
	if(Movie_page.verify_Top_rated_show_screen().contains(arg1))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println(" ----> fail ");
		  Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
	}
}
@Then("^click the Game of Thrones The Last Watch link$")
public void click_the_Game_of_Thrones_The_Last_Watch_link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Movie_page= new Top_Rated_show_page(TestBase.driver);
	
	Movie_page.Game_of_thrones_link();
}
@Then("^Verify the Title of the selected episode \"([^\"]*)\"$")
public void verify_the_Title_of_the_selected_episode(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Movie_page= new Top_Rated_show_page(TestBase.driver);
	
	if(Movie_page.Verify_Game_of_thrones_title().equals(arg1))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
		
		  Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
	}
	
}
@Then("^Verify the Rating of the Game of Thrones$")
public void verify_the_Rating_of_the_Game_of_Thrones() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Movie_page= new Top_Rated_show_page(TestBase.driver);
	
	if(Movie_page.verify_rating_value())
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
		
		
		  Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
	}
}

@Then("^Verify the number of review in Game of Thrones$")
public void verify_the_number_of_review_in_Game_of_Thrones() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Movie_page= new Top_Rated_show_page(TestBase.driver);
	
	if(Movie_page.verify_rating_value())
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

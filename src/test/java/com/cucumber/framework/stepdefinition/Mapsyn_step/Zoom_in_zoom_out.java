package com.cucumber.framework.stepdefinition.Mapsyn_step;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import com.cucumber.framework.Mapsyn_page.Zoom_In_Zoom_out_page;
import com.cucumber.framework.helper.TestBase.TestBase;

import cucumber.api.java.en.Then;

public class Zoom_in_zoom_out {
	
	
	Zoom_In_Zoom_out_page Zoom_in_zoom_out;

@Then("^click the Zoom in in Map field$")
public void click_the_Zoom_in_in_Map_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Zoom_in_zoom_out= new Zoom_In_Zoom_out_page(TestBase.driver);
	Zoom_in_zoom_out.Zoom_In_zoom_out();
}

@Then("^click the Zoom out in Map field$")
public void click_the_Zoom_out_in_Map_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Zoom_in_zoom_out= new Zoom_In_Zoom_out_page(TestBase.driver);
	Zoom_in_zoom_out.Zoom_out();
}

@Then("^click the map menu icon$")
public void click_the_map_menu_icon() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Zoom_in_zoom_out= new Zoom_In_Zoom_out_page(TestBase.driver);
	Zoom_in_zoom_out.Zoom_Menu();
}

@Then("^click the Image in Google Map$")
public void click_the_Image_in_Google_Map() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	Zoom_in_zoom_out= new Zoom_In_Zoom_out_page(TestBase.driver);
	
	Zoom_in_zoom_out.Map_Image_click();
	
}

@Then("^Verify the Map link$")
public void verify_the_Map_link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
	Zoom_in_zoom_out= new Zoom_In_Zoom_out_page(TestBase.driver);
	ArrayList<String> tabs2 = new ArrayList<String> (TestBase.driver.getWindowHandles());
	System.out.println("What is Tab size "+tabs2.size());
    TestBase.driver.switchTo().window(tabs2.get(1));
    
	
	if(Zoom_in_zoom_out.Error_page_screen())
	{
		System.out.println("Pass");
		Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
	}
	else
	{
		
		System.out.println("fail");
	}
}
@Then("^click the Tolls icon$")
public void click_the_Tolls_icon() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Zoom_in_zoom_out= new Zoom_In_Zoom_out_page(TestBase.driver);
	
	Zoom_in_zoom_out.Tolls();
	
}

@Then("^Enter the valid Tolls name \"([^\"]*)\"$")
public void enter_the_valid_Tolls_name(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Zoom_in_zoom_out.search_field(arg1);
}

@Then("^click the Anson Road link$")
public void click_the_Anson_Road_link() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Zoom_in_zoom_out= new Zoom_In_Zoom_out_page(TestBase.driver);

	Zoom_in_zoom_out.Anson_road_link();
	
}
@Then("^verify the Anson road pop up screen$")
public void verify_the_Anson_road_pop_up_screen() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Zoom_in_zoom_out= new Zoom_In_Zoom_out_page(TestBase.driver);
	
	if(Zoom_in_zoom_out.verify_Anson_road_link())
	{
		System.out.println("Pass");
	}
	else
	{
		Assert.assertTrue(false, this.getClass().getSimpleName()+" is fail");
	}
	
}


}

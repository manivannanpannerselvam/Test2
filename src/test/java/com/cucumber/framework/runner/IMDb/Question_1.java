package com.cucumber.framework.runner.IMDb;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:featurefile/IMDB/Top_Rated_shows.feature","classpath:featurefile/IMDB/Search_functionality.feature"}, glue = {
		"classpath:com.cucumber.framework.stepdefinition",
"classpath:com.cucumber.framework.helper" }, plugin = {"pretty:STDOUT","html:C:\\cucumber-pretty",
	    "rerun:target/rerun1.txt"}

)

public class Question_1 extends AbstractTestNGCucumberTests {
	

}

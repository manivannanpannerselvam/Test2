package com.cucumber.framework.runner.MaySyn;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:featurefile/Mapsynq/Searchs_functionality.feature","classpath:featurefile/Mapsynq/Maps.feature"}, glue = {
		"classpath:com.cucumber.framework.stepdefinition",
"classpath:com.cucumber.framework.helper" }, plugin = {"pretty:STDOUT","html:C:\\cucumber-pretty",
	    "rerun:target/rerun1.txt"}

)


public class Search_map_functionality extends AbstractTestNGCucumberTests {

}

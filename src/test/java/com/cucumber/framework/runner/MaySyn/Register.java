package com.cucumber.framework.runner.MaySyn;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:featurefile/Mapsynq/Registers.feature"}, glue = {
		"classpath:com.cucumber.framework.stepdefinition",
"classpath:com.cucumber.framework.helper" }, plugin = {"pretty:STDOUT","html:C:\\cucumber-pretty",
	    "rerun:target/rerun1.txt"}

)

public class Register extends AbstractTestNGCucumberTests {

}

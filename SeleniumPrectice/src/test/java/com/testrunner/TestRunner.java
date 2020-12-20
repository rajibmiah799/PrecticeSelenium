package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features= "LoginFeatures",
		glue ="com.stepdef"
		//tags ="@login",
		//plugin = "pretty",
		//monochrome = true
		
		
		
		)


public class TestRunner extends AbstractTestNGCucumberTests{

}

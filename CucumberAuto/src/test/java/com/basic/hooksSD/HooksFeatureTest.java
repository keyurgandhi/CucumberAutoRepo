package com.basic.hooksSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true, // This make log more readable by removing junk charachters
		//dryRun = true,// This will dry run the code, without doint any functional operation, check syntax and match feature file and Junit code existance.
		features = {"src/test/resource/com/basic/hooksFF/"},
		glue = {"com/basic/hooksSD/"},   // path/package for step definition file
		plugin= {"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report5.json",
				"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport5.html"}
		)
public class HooksFeatureTest {

}

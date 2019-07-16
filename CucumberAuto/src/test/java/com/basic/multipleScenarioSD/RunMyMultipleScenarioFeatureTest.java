package com.basic.multipleScenarioSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true, // This make log more readable by removing junk charachters
		//dryRun = true,// This will dry run the code, without doint any functional operation, check syntax and match feature file and Junit code existance.
		features = {"src/test/resource/com/basic/multipleScenarioFF/"},
		glue = {"com/basic/multipleScenarioSD/"},   // path/package for step definition file
		plugin= {"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report6.json",
				"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport6.html"}
		)
public class RunMyMultipleScenarioFeatureTest {

}

package com.basic.FirstFeatureFile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true, // This make log more readable by removing junk charachters
//		dryRun = true,// This will dry run the code, without doint any functional operation, check syntax and match feature file and Junit code existance.
		features = {"src/test/resource/com/basic/FirstFeatureFileff/"},
		glue = {"com/basic/FirstFeatureFile/"},
		plugin= {"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report4.json",
				"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport4.html"}
		)
public class RunMyFirstFeatureTest {

}

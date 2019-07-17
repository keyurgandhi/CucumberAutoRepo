package com.techjava.springbootcucumberdemo.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", 
plugin = {"pretty", 
		"html:target/cucumber-htmlreport",
		"json:target/cucumber-report1.json",
		"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"}, 
glue = {"com.techjava.springbootcucumberdemo.cucumber.stepdefs"})
public class CalculationIntegrationTest {
}

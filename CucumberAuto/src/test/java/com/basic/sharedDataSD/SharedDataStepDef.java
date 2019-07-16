package com.basic.sharedDataSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SharedDataStepDef {
	
	WebDriver webdriver;
	
	String usernameToEnter = "David";
	
	public SharedDataStepDef(SharedClass sharedclass) {
		webdriver = sharedclass.webDriverSetup();
	}
	
	
	@Given("^User need to be on facebook page$")
	public void user_need_to_be_on_facebook_page() {		
		webdriver.get("https://www.facebook.com/");
	}
	
	@When("^User enters user \"([^\"]*)\" first name$")
	public void user_enters_user_first_name(String username) throws InterruptedException {
		webdriver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys(username);
		Thread.sleep(1000);
	}
	
	
	
	

}

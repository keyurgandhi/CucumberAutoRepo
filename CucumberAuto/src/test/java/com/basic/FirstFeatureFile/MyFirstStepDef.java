package com.basic.FirstFeatureFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class MyFirstStepDef {
	
	WebDriver webdriver;
	
	String usernameToEnter = "David";
	
	@Given("^User need to be on facebook page$")
	public void user_need_to_be_on_facebook_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\HARMAN_WORK_DRIVE\\Work\\R&D_work\\Cucumber-BDD\\selenium_webdriver\\chromedriver.exe");
		webdriver = new ChromeDriver();
		webdriver.get("https://www.facebook.com/");
	}
	
	@When("^User enters user first name$")
	public void user_enters_user_first_name() {
		webdriver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys("David");
	}
	
	@Then("^User checks user first name is present$")
	public void User_checks_user_first_name_is_present() {
		String username = webdriver.findElement(By.xpath("//input[@id='u_0_l']")).getAttribute("value");
		Assert.assertEquals(usernameToEnter, username);
	}

}

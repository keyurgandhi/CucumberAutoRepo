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

public class SharedDataStepDef1 {
	
	WebDriver webdriver;
	
	String usernameToEnter = "David";
	
	public SharedDataStepDef1(SharedClass sharedclass) {
		webdriver = sharedclass.webDriverSetup();
	}
	
	@Then("^User checks user \"([^\"]*)\" first name is present$")
	public void User_checks_user_first_name_is_present(String usernameexpected) throws InterruptedException {
		String username = webdriver.findElement(By.xpath("//input[@id='u_0_l']")).getAttribute("value");
		Assert.assertEquals(usernameexpected, username);
		Thread.sleep(1000);
	}
	
	@And("^user enters \"([^\"]*)\" surname$")
	public void user_enters_surname(String surname) throws InterruptedException {
		webdriver.findElement(By.xpath("//input[@id='u_0_n']")).sendKeys(surname);
		Thread.sleep(1000);
	}
	
	@But("^user mobile field should be blank$")
	public void user_mobile_field_should_be_blank() {
		String moble = webdriver.findElement(By.xpath("//input[@id='u_0_q']")).getAttribute("value");
		Assert.assertEquals("", moble);
	}
}

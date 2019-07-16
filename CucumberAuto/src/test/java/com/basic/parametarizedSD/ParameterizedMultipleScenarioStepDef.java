package com.basic.parametarizedSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ParameterizedMultipleScenarioStepDef {
	
	WebDriver webdriver;
	
	String usernameToEnter = "David";
	
	@Given("^User need to be on facebook page$")
	public void user_need_to_be_on_facebook_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\HARMAN_WORK_DRIVE\\Work\\R&D_work\\Cucumber-BDD\\selenium_webdriver\\chromedriver.exe");
		webdriver = new ChromeDriver();
		webdriver.get("https://www.facebook.com/");
	}
	
	@When("^User enters user \"([^\"]*)\" first name$")
	public void user_enters_user_first_name(String username) throws InterruptedException {
		webdriver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys(username);
		Thread.sleep(1000);
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
	
	@Then("^close browser$")
	public void close_the_browser() {
		webdriver.quit();
		webdriver = null;
	}

}

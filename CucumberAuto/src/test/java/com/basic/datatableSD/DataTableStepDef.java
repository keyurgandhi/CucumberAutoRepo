package com.basic.datatableSD;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DataTableStepDef {
	
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
	
	@When("^Enter followng data$")
	public void enter_followng_data(DataTable dataTable) {
		List<List<String>> data = dataTable.raw();
		
		String value1 = data.get(0).get(0);
		String value2 = data.get(0).get(1);
		String value3 = data.get(0).get(2);
		
		String value4 = data.get(1).get(0);
		String value5 = data.get(1).get(1);
		String value6 = data.get(1).get(2);
		
		webdriver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys(value4);
		webdriver.findElement(By.xpath("//input[@id='u_0_n']")).sendKeys(value5);
		webdriver.findElement(By.xpath("//input[@id='u_0_q']")).sendKeys(value6);
	}

}

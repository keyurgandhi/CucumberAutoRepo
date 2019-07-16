package com.basic.multiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class GoogleStepDef {
	
	WebDriver webdriver;
	
	@Given("^User need to be on google page$")
	public void user_need_to_be_on_google_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\HARMAN_WORK_DRIVE\\Work\\R&D_work\\Cucumber-BDD\\selenium_webdriver\\chromedriver.exe");
		webdriver = new ChromeDriver();
		webdriver.get("https://www.google.co.in");
	}
	
	@When("^User enters search string$")
	public void User_enters_search_string() throws InterruptedException {
		webdriver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("selenium");
		Thread.sleep(1000);
	}

}

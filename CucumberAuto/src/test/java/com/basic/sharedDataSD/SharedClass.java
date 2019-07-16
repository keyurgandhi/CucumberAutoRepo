package com.basic.sharedDataSD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SharedClass {
	
	
	WebDriver webdriver;
	
	
	@Before
	public WebDriver webDriverSetup() {
		if(webdriver == null) {
			System.setProperty("webdriver.chrome.driver", "C:\\HARMAN_WORK_DRIVE\\Work\\R&D_work\\Cucumber-BDD\\selenium_webdriver\\chromedriver.exe");
			webdriver = new ChromeDriver();
		}

		return webdriver;
		
	}
	
	@After
	public void tearDown() {
		webdriver.quit();
		webdriver = null;
		
	}

}

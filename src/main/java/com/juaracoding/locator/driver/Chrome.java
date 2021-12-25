package com.juaracoding.locator.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Chrome implements DriverStrategy{
	
	public WebDriver setStrategy() {
		System.setProperty("webdriver.chrome.driver", "D:/Bootcamp/Selenium/chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.setExperimentalOption("use AutomationExtension", false);
//		options.addArguments("----no-sandbox");
//		
//		return new ChromeDriver(options);
		WebDriver driver = new ChromeDriver();
		return driver;
		
	}

}

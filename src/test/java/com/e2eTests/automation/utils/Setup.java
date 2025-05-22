package com.e2eTests.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Before;


public class Setup {
	private static WebDriver driver;

	@Before
	public void setWebDriver() {
		String browser = System.getProperty("browser");
		if (browser == null) {
			browser = "chrome";
		}
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.http.factory", "jdk-http-client"); 

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "firefox":
			System.setProperty("webdriver.http.factory", "jdk-http-client"); 
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		case "edge":
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			
			driver = new EdgeDriver();
			break;
		default:
			throw new IllegalArgumentException("Browser \"" + browser + "\"is not supported");

		}
	}

	/* Getter */
	public static WebDriver getDriver() {
		return driver;
	}
}
 
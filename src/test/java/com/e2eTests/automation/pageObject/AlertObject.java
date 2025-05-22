package com.e2eTests.automation.pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.Setup;

public class AlertObject {
	public ConfigFileReader configFileReader ;
	@FindBy(how = How.ID, using = "alertButton")
	public static WebElement btnboutton;

	public AlertObject() {
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();
	}
	public void login() {
		Setup.getDriver().get(configFileReader.getProperties("urlAlerte"));
	}
	public void click() {
		((JavascriptExecutor) Setup.getDriver()).executeScript("window.scrollBy(0, 500)", "");
		btnboutton.click();
	}
	public void CliqueLalerte() {
		Setup.getDriver().switchTo().alert().accept();	
	}
}

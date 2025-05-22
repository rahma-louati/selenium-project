package com.e2eTests.automation.pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.Setup;

public class FrameObject {
	public ConfigFileReader configFileReader ;
	@FindBy(how = How.ID, using = "a077aa5e")
	public static WebElement fram;
	@FindBy(how = How.XPATH, using = "//img[@src='Jmeter720.png']")
	public static WebElement BtnImageF;
	@FindBy(how = How.ID, using = "philadelphia-field-email")
	public static WebElement Btnemail;
	
	public FrameObject() {
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();
	}
	public void login() {
		Setup.getDriver().get(configFileReader.getProperties("urlFrame"));
	}
	public void cliqueframe() {
		Setup.getDriver().switchTo().frame(fram);
		BtnImageF.click();
	}
	public void revienspageinitiale() {
		Setup.getDriver().switchTo().parentFrame();
	}
	
	public void ecrireEmail(String email) {
		
	((JavascriptExecutor) Setup.getDriver()).executeScript("arguments[0].scrollIntoView(true)", Btnemail);
		Btnemail.sendKeys(email);
	}

	public String getEmailValue() {
		return Btnemail.getAttribute("value");
	}
	
}

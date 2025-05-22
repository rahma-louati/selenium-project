package com.e2eTests.automation.pageObject;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2eTests.automation.utils.ConfigFileReader;

import com.e2eTests.automation.utils.Setup;

public class LoginObjectOrange {
	public ConfigFileReader configFileReader;
	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	public static WebElement username;
	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	public static WebElement password;
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	public static WebElement btlogin;
	@FindBy(how = How.CSS, using = ".oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module")
	public static WebElement msg;

	public LoginObjectOrange() {
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();
	}

	public void login() {
		Setup.getDriver().get(configFileReader.getProperties("urlORM"));
	}

	public void SaisirUsername() {
		WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(username)).sendKeys(configFileReader.getProperties("usernameORM"));
	}

	public void SaisirPassword() {
		password.sendKeys(configFileReader.getProperties("passwordORM"));
	}

	public void clickBtn() { 
		WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(btlogin)).click();
	}
	public String getLoginButtonColorHex() {
		String color = btlogin.getCssValue("background-color");
		Color c = Color.fromString(color);
		return c.asHex(); 
	}
	public void pagevisible() {
	WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(20));
	 wait.until(ExpectedConditions.visibilityOf(LoginObjectOrange.msg));
}
}

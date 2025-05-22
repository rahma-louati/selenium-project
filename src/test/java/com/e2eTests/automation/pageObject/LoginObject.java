package com.e2eTests.automation.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.Setup;

public class LoginObject {
	public ConfigFileReader configFileReader;
	@FindBy(how = How.ID, using = "user-name")
	public static WebElement username;

	@FindBy(how = How.ID, using = "password")
	public static WebElement password;

	@FindBy(how = How.ID, using = "login-button")
	public static WebElement btnLogin;

	@FindBy(how = How.XPATH, using = "//span[@class='title']")
	public static WebElement title;

	@FindBy(how = How.CSS, using = ".error-message-container.error")
	public static WebElement msg;

	public LoginObject() {
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();
	}

	public void login() {
		Setup.getDriver().get("https://www.saucedemo.com/");
	}

	public void saisirUsername(String usr) {
		username.sendKeys(usr);
	}

	public void saisirPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void clickBtn() {
		btnLogin.click();
	}

	public void connexion() {
		Setup.getDriver().get(configFileReader.getProperties("url"));
		username.sendKeys(configFileReader.getProperties("username"));
		password.sendKeys(configFileReader.getProperties("password"));
		btnLogin.click();
	}

}

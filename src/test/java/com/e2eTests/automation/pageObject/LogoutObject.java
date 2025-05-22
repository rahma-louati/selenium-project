package com.e2eTests.automation.pageObject;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2eTests.automation.utils.Setup;

public class LogoutObject {


	@FindBy(how = How.ID, using = "react-burger-menu-btn")
	public static WebElement btnmenu;

	@FindBy(how = How.ID, using = "logout_sidebar_link")
	public static WebElement btnlogout;

	@FindBy(how = How.XPATH, using = "//div[@class='login_password']/h4")
	public static WebElement passwordeconne; 

	public LogoutObject() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	public void clickBtnmenu() {
		WebDriverWait  wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(2000));
	
		
	}

	public void clickBtnlogout() {
		WebDriverWait  wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(1000));
		wait.until(ExpectedConditions.visibilityOf(btnlogout)).click();
		
	}
}

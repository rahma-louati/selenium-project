package com.e2eTests.automation.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.Setup;

public class MouseHoverObject {
	public ConfigFileReader configFileReader;
	@FindBy(how = How.XPATH, using = "//button[contains(text (),'Hover me')]")
	public static WebElement btnmenu;
	@FindBy(how = How.XPATH, using = "//li[text()='Option 1']")
	public static WebElement opt1;
	@FindBy(how = How.XPATH, using = "//li[text()='Option 2']")
	public static WebElement opt2;
	@FindBy(how = How.XPATH, using = "//li[text()='Option 3']")
	public static WebElement opt3;

	public MouseHoverObject() {
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();
	}

	public void login() {
		Setup.getDriver().get(configFileReader.getProperties("urlMouseHover"));
	}

	public void mousehover() {
		Actions action = new Actions(Setup.getDriver());
		action.moveToElement(btnmenu).perform();

	}
}

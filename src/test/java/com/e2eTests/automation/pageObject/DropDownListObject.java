package com.e2eTests.automation.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.Setup;

public class DropDownListObject {

	public ConfigFileReader configFileReader;

	@FindBy(how = How.ID, using = "dropdown-menu")
	public static WebElement menu;
	
	@FindBy(how = How.ID, using = "dropdown-menu-message")
	public static WebElement message;
	
	public DropDownListObject() {
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();
	}

	public void connexion() { // Se connecter au site
		Setup.getDriver().get(configFileReader.getProperties("urlDropDownList"));
	}

	public void selectOptionIndex() {
		// récupération des options du menu
		Select selectList = new Select(menu);
		// Select the option by index (te7ssbou enti à partir men 0)
		selectList.selectByIndex(1);
	}

	public void selectOptionValue() {
		// récupération des options du menu
		Select selectList = new Select(menu);
		// Select the option by value (Talkahom fel inspecter)
		selectList.selectByValue("2");
	}
	
	public void selectOptionVisibleText() {
		// récupération des options du menu
		Select selectList = new Select(menu);
		// Select the option by visible text
		selectList.selectByVisibleText("Option 3");
	}

}

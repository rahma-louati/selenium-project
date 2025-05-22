package com.e2eTests.automation.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.Setup;

public class CopierCollerObject {

	public ConfigFileReader configFileReader;

	// Recherche des webElement
	
	@FindBy(how = How.ID, using = "copy-field")
	public static WebElement copyField;

	@FindBy(how = How.ID, using = "paste-area")
	public static WebElement pasteArea;

	// Constructeur
	public CopierCollerObject() {
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();
	}

	// Methodes
	public void connexion() { // Se connecter au site
	Setup.getDriver().get(configFileReader.getProperties("urlCopierColler"));	
	}
	
	public void saisirTexte() {
		copyField.sendKeys("Bonjour");
	}
	
	public void copierCollerTexte() {
		copyField.sendKeys(Keys.CONTROL,"a"); //selectionner text
		copyField.sendKeys(Keys.CONTROL,"c"); // Copier text
		pasteArea.sendKeys(Keys.CONTROL,"v"); // Coller text
	}
	
	
	

}

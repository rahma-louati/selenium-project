package com.e2eTests.automation.pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.Setup;

public class FrameSwitchObject {
	
	public ConfigFileReader configFileReader;

	// Recherche des webElement
	
	@FindBy(how = How.XPATH, using = "//img[@src='Jmeter720.png']")
	public static WebElement img;
	
	@FindBy(how = How.ID, using = "philadelphia-field-email")
	public static WebElement mail;
	
	
	// Constructeur
		public FrameSwitchObject() {
			PageFactory.initElements(Setup.getDriver(), this);
			configFileReader = new ConfigFileReader();
		}
		
		public void connexion() {
			Setup.getDriver().get(configFileReader.getProperties("urlSwitchFrame"));	
		}
		
		public void iFrameClick() {
			Setup.getDriver().switchTo().frame("a077aa5e");
			img.click();
		}
		
		public void revenirPageinitiale() {
			Setup.getDriver().switchTo().defaultContent(); // Revenir à la page principale
			//Setup.getDriver().switchTo().parentFrame(); // Revenir vers le frame parent
		}
		
		public void saisirMail() {	
			JavascriptExecutor js = (JavascriptExecutor) Setup.getDriver();
			js.executeScript("arguments[0].scrollIntoView(true)", mail);
			mail.sendKeys("Test");
		}
}

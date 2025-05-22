package com.e2eTests.automation.pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.Setup;

public class ClickBtnObject {

	public ConfigFileReader configFileReader;

	@FindBy(how = How.XPATH, using = "//div[@class='category-cards']//h5[text()='Elements']")
	public static WebElement btnElements;

	@FindBy(how = How.XPATH, using = "//span[normalize-space(text())='Buttons']")
	public static WebElement btnButtons;
	
	@FindBy(how = How.ID, using = "doubleClickBtn")
	public static WebElement doubleClickBtn;
	
	@FindBy(how = How.ID, using = "doubleClickMessage")
	public static WebElement doubleClickMessage;
	
	@FindBy(how = How.ID, using = "rightClickBtn")
	public static WebElement rightClickBtn;
	
	@FindBy(how = How.ID, using = "rightClickMessage")
	public static WebElement rightClickMessage;
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space(text())='Click Me']")
	public static WebElement dynamicClickBtn;
	
	@FindBy(how = How.ID, using = "dynamicClickMessage")
	public static WebElement dynamicClickMessage;
	
	
	
	
	// Constructeur
	public ClickBtnObject() {
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();
	}

	// Methodes
	public void connexion() {
		Setup.getDriver().get(configFileReader.getProperties("urlDemoQA"));
	}

	public void cliqueElements() {

		((JavascriptExecutor) Setup.getDriver()).executeScript("window.scrollBy(0, 600)", "");
		// WebDriverWait wait = new WebDriverWait(Setup.getDriver(),Duration.ofSeconds(3000));
		// WebElement btnElements2 =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[text()='Elements']")));
		btnElements.click();
	}

	public void cliqueButtons() {
		((JavascriptExecutor) Setup.getDriver()).executeScript("window.scrollBy(0, 600)", "");

		// Scroller jusqu'à l'élément sans qu'il remonte en haut (ama ma khedmetch)
		// ((JavascriptExecutor)Setup.getDriver()).executeScript("arguments[0].scrollIntoView(false);",btnButtons);
		btnButtons.click();
	}
	
	public void doubleClique() {
		//((JavascriptExecutor) Setup.getDriver()).executeScript("window.scrollBy(0, 600)", "");
		((JavascriptExecutor) Setup.getDriver()).executeScript("arguments[0].scrollIntoView(true);", doubleClickBtn);
		
		Actions action = new Actions(Setup.getDriver());
		action.doubleClick(doubleClickBtn).perform();
	}
	
	public void rightClique() {
		//((JavascriptExecutor) Setup.getDriver()).executeScript("window.scrollBy(0, 600)", "");
		((JavascriptExecutor) Setup.getDriver()).executeScript("arguments[0].scrollIntoView(true);", rightClickBtn);
		
		Actions action = new Actions(Setup.getDriver());
		action.contextClick(rightClickBtn).perform();
	}
	
	public void dynamicClique() {
		//((JavascriptExecutor) Setup.getDriver()).executeScript("window.scrollBy(0, 600)", "");
		((JavascriptExecutor) Setup.getDriver()).executeScript("arguments[0].scrollIntoView(true);", dynamicClickBtn);
		dynamicClickBtn.click();
		
	}

}

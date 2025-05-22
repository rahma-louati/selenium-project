package com.e2eTests.automation.pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.Setup;

public class ButtonObject {
	public ConfigFileReader configFileReader ;
	@FindBy(how = How.ID, using = "doubleClickBtn")
	public static WebElement btnDoubleClilk;
	@FindBy(how = How.ID, using = "doubleClickMessage")
	public static WebElement msg;
	@FindBy(how = How.ID, using = "rightClickBtn")
	public static WebElement btnRightClilk;
	@FindBy(how = How.ID, using = "rightClickMessage")
	public static WebElement msg2;
	@FindBy(how = How.XPATH, using = "//button[normalize-space(text())='Click Me']")
	public static WebElement IdDynamique;
	@FindBy(how = How.ID, using = "dynamicClickMessage")
	public static WebElement msg3;
	
	public  ButtonObject() {
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();
	}
	
	public void login() {
		Setup.getDriver().get(configFileReader.getProperties("urlbtn"));
	}
	

	 public void doubleClick() {
		 ((JavascriptExecutor)Setup.getDriver()).executeScript("window.scrollBy(0, 500)", "");
		 Actions action = new Actions(Setup.getDriver()); 
		 action.doubleClick(btnDoubleClilk).perform(); 
	    }
	 
	 public void RightClick()  {
		 ((JavascriptExecutor)Setup.getDriver()).executeScript("window.scrollBy(0, 500)", "");
		 Actions action = new Actions(Setup.getDriver());
		 action.contextClick(btnRightClilk).perform();
	 }

		public void iddynamique() {
			((JavascriptExecutor) Setup.getDriver()).executeScript("window.scrollBy(0, 500)", "");
			IdDynamique.click();
		}
	 
}

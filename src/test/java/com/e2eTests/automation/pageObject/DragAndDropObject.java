package com.e2eTests.automation.pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.Setup;

public class DragAndDropObject {
	public ConfigFileReader configFileReader;
	@FindBy(how = How.ID, using = "drag-item")
	public static WebElement Drag;
	@FindBy(how = How.ID, using = "drop-zone")
	public static WebElement Drop;
	@FindBy(how = How.ID, using = "success-popup")
	public static WebElement msg;

	public DragAndDropObject() {

		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();

	}

	public void login() {
		Setup.getDriver().get(configFileReader.getProperties("urlDragAndDrop"));
	}

	public void draganddropelemnt() {
		((JavascriptExecutor) Setup.getDriver()).executeScript("window.scrollBy(0, 900)", "");
		Actions action = new Actions(Setup.getDriver());
		action.dragAndDropBy(Drag, 100, 100).perform();
		action.dragAndDrop(Drag, Drop);
	}

}

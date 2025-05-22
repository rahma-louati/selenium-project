package com.e2eTests.automation.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.Setup;

public class ToolTipsObject {
	public ConfigFileReader configFileReader ;
	@FindBy(how = How.XPATH, using = "//div[@class='tooltip-classic']")
	public static WebElement toolTips;
	
	
	public ToolTipsObject() {
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();
	}
	public void login() {
		Setup.getDriver().get(configFileReader.getProperties("urlToopTips"));
	}
	public void SurvoleLeBouton() {
		Actions actions = new Actions(Setup.getDriver());
		actions.moveToElement(toolTips).perform();
	}

	public String affichagemsg() {
		return toolTips.getAttribute("data-tooltip");
	}

}

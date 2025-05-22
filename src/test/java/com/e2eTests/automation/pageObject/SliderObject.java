package com.e2eTests.automation.pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.Setup;

public class SliderObject {
	public ConfigFileReader configFileReader ;
	@FindBy(how = How.ID, using = "slider")
	public static WebElement slider;
	@FindBy(how = How.ID, using = "slider-value")
	public static WebElement title;

	public SliderObject() {
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();
	}

	public void login() {
		Setup.getDriver().get(configFileReader.getProperties("urlSlider"));
	}
	public void deplaceslider() {
		JavascriptExecutor js= (JavascriptExecutor)Setup.getDriver();
		js.executeScript("arguments[0].value=80; arguments[0].dispatchEvent(new Event('input'))", slider);
	}
}

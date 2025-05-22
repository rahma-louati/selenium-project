package com.e2eTests.automation.pageObject;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.Setup;

public class SwitchWindowObjcet {
	public ConfigFileReader configFileReader;
	@FindBy(how = How.ID, using = "open-window-btn")
	public static WebElement btnbouton;

	@FindBy(how = How.XPATH, using = "//input")
	public static WebElement btn;

	public SwitchWindowObjcet() {
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();
	}

	public void login() {
		Setup.getDriver().get(configFileReader.getProperties("urlSwitchWindow"));
	}

	public void cliquebouton() {
		Setup.getDriver().getWindowHandle();
		btnbouton.click();
	}

	public void NouvelleFenêtre() {
		Set<String> handles = Setup.getDriver().getWindowHandles();
		for (String h : handles) {
			System.out.println(h);
			Setup.getDriver().switchTo().window(h);
			}
	}

	public void ÉcrisSurLaFenêtre() {
		btn.sendKeys("bonjour");
	}

}

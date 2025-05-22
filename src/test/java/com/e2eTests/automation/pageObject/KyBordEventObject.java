package com.e2eTests.automation.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.Setup;

public class KyBordEventObject {
	public ConfigFileReader configFileReader ;
	@FindBy(how = How.ID, using = "copy-field")
	public static WebElement texte;
	@FindBy(how = How.ID, using = "paste-area")
	public static WebElement destinat;

	public KyBordEventObject() {
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();
	}

	public void login() {
		Setup.getDriver().get(configFileReader.getProperties("urlKyBoradEvent"));
	}

	public void écristexte() {
		texte.sendKeys("bonjour");
		texte.sendKeys(Keys.CONTROL, "a");
	}

	public void copietexte() {
		texte.sendKeys(Keys.CONTROL, "c");
	}

	public void collertexte() {
		destinat.sendKeys(Keys.CONTROL, "v");
	}
}

package com.e2eTests.automation.pageObject;



import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.Setup;

public class UplodFileObject {
	public ConfigFileReader configFileReader ;
	@FindBy(how = How.ID, using = "uploadfile_0")
	public static WebElement btnLogin;
	@FindBy(how = How.ID, using = "terms")
	public static WebElement btaccept;
	@FindBy(how = How.ID, using = "submitbutton")
	public static WebElement btnSubmit;
	@FindBy(how = How.XPATH, using = "//center[normalize-space()='1 file has been successfully uploaded.']")
	public static WebElement successMessage;

	public UplodFileObject() {
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();
	}

	public void login() {
		Setup.getDriver().get(configFileReader.getProperties("urlUplodFile"));
	}
	public void clickboutton() {
		
	}
public void ChoisisFichier()  {
	
	btnLogin.sendKeys("C:\\Users\\user\\Desktop\\Capture d’écran 202.png");
	}
public void IAcceptTermsOfService() {
	btaccept.click();
	
}
public void BoutonSubmiteFile()  {

	btnSubmit.click();
}
public void  WaitSuccessMessagevisible() {
	WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.visibilityOf(successMessage));
}
}

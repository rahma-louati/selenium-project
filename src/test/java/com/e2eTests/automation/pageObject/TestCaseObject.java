package com.e2eTests.automation.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.Setup;

public class TestCaseObject {
	public ConfigFileReader configFileReader ;
	@FindBy(how = How.XPATH, using = "//a[@href='/products' and contains(text(), ' Products')]")
	public static WebElement title;
	@FindBy(how = How.XPATH, using = "//a[@href='/contact_us' and contains(text(), 'Contact us')]")
	public static WebElement btnContact;
	@FindBy(how = How.XPATH, using = "//h2[@class='title text-center' and text()='Get In Touch']")
	public static WebElement title2;
	@FindBy(how = How.NAME, using = "name")
	public static WebElement username;
	@FindBy(how = How.NAME, using = "email")
	public static WebElement email;
	@FindBy(how = How.NAME, using = "subject")
	public static WebElement Subject;
	@FindBy(how = How.ID, using = "message")
	public static WebElement Message;
	@FindBy(how = How.NAME, using = "upload_file")
	public static WebElement btnuplodFile;
	@FindBy(how = How.NAME, using = "submit")
	public static WebElement btnsubmit;
	@FindBy(how = How.XPATH, using = "//div[@class='status alert alert-success' and text()='Success! Your details have been submitted successfully.']")
	public static WebElement msg1;
	@FindBy(how = How.XPATH, using = "//*[@id=\"form-section\"]/a/span/i\r\n")
	public static WebElement btnhome;
	
	public TestCaseObject() {
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();
	}

	public void login() {
		Setup.getDriver().get(configFileReader.getProperties("urltestcase"));
	}
	public void ClickContact() {
		btnContact.click();
		
	}
	public void saisisNomAdresseMail() {
		username.sendKeys("Rahma");
		email.sendKeys("Rahmalouati873@gmail.com");
		Subject.sendKeys("Test Subject");
		Message.sendKeys("This is a test message.");
	}
	public void TéléchargeFichier() {
		btnuplodFile.sendKeys("C:\\\\Users\\\\user\\\\Desktop\\\\Capture d’écran 202.png");
	}
	public void Clicksubmit() {
		btnsubmit.click();
		
	}
	public void Clickok() {
		Setup.getDriver().switchTo().alert().accept();
	}

	public void Clickhome() {
		btnhome.click();

	}
	

}

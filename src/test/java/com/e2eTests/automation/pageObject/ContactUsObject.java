package com.e2eTests.automation.pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.Setup;

public class ContactUsObject {

	public ConfigFileReader configFileReader;

	@FindBy(how = How.XPATH, using = "//a[normalize-space(text())='Home']")
	public static WebElement home;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space(text())='Contact us']")
	public static WebElement btnContactUs;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space(text())='Autoriser']")
	public static WebElement btnAutoriser;
	
	@FindBy(how = How.XPATH, using = "//h2[normalize-space(text())='Get In Touch']")
	public static WebElement getInTouch;
	
	@FindBy(how = How.NAME, using = "name")
	public static WebElement name;
	
	@FindBy(how = How.NAME, using = "email")
	public static WebElement email;
	
	@FindBy(how = How.NAME, using = "subject")
	public static WebElement subject;
	
	@FindBy(how = How.NAME, using = "message")
	public static WebElement message;
	
	@FindBy(how = How.NAME, using = "upload_file")
	public static WebElement uploadFile;
	
	@FindBy(how = How.NAME, using = "submit")
	public static WebElement btnSubmit;
	
	@FindBy(how = How.CSS, using = ".status.alert.alert-success")
	public static WebElement messageSucces;
	
	@FindBy(how = How.CSS, using = ".fa.fa-angle-double-left")
	public static WebElement btnHome;
	
	
	// constructeur
	public ContactUsObject() {
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();
	}

	public void connexion() {
		Setup.getDriver().get(configFileReader.getProperties("urlAutoExercice"));
	}

	public void verifyColor() {
		// Recuperation de la couleur du fond de l'element home en format rgba
		String color = home.getCssValue("color");
		System.out.println(color);
		// convertir le string récupéré en couleur
		Color c = Color.fromString(color);
		// recuperation de la couleur en format asHex
		String couleurObtenu = c.asHex();
		System.out.println(couleurObtenu);
		Assert.assertEquals(couleurObtenu, "#ffa500");
	}
	
	public void contactUsClic() {
		btnAutoriser.click();
		btnContactUs.click();
	}
	
	public void saisieChamps() {
		name.sendKeys(configFileReader.getProperties("nameAutoExercice"));
		email.sendKeys(configFileReader.getProperties("mailAutoExercice"));
		subject.sendKeys(configFileReader.getProperties("subjectAutoExercice"));
		message.sendKeys(configFileReader.getProperties("messageAutoExercice"));	
	}
	
	public void saisieChampsInvalide() {
		name.sendKeys(configFileReader.getProperties("nameAutoExercice"));
		email.sendKeys(configFileReader.getProperties("mailAutoExerciceNOK"));
		subject.sendKeys(configFileReader.getProperties("subjectAutoExercice"));
		message.sendKeys(configFileReader.getProperties("messageAutoExercice"));	
	}
	
	public void chargerFichier() {
		uploadFile.sendKeys(configFileReader.getProperties("fileUpload"));
	}
	
	public void submitClic() {
		btnSubmit.click();
	}
	
	public void OKClic() {
		Setup.getDriver().switchTo().alert().accept();
	}
	
	public void btnHomeClic() {
		btnHome.click();
	}

}

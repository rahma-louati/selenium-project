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

public class TestCase8Object {
	public ConfigFileReader configFileReader ;
	@FindBy(how = How.XPATH, using = "//a[@href='/products' and contains(text(), ' Products')]")
	public static WebElement btnprodcut;
	@FindBy(how = How.CSS, using = ".title.text-center")
	public static WebElement Allprodcut;
	@FindBy(how = How.CSS, using = "div[class='features_items']")
	public static WebElement listprodcut;
	@FindBy(how = How.CSS, using = "a[href='/product_details/1']")
	public static WebElement btnviewproduc;
	@FindBy(how = How.XPATH, using = "//h2[text()='Blue Top']")
	public static WebElement nonproduit;
	@FindBy(how = How.XPATH, using = "//p[contains(text(), 'Category:')]")
	public static WebElement category;
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Rs. 500')]")
	public static WebElement price;
	@FindBy(how = How.XPATH, using = "//p[b[contains(text(),'Availability:')]]")
	public static WebElement availability;
	@FindBy(how = How.XPATH, using = "//p[b[contains(text(),'Condition:')]]")
	public static WebElement condition;
	@FindBy(how = How.XPATH, using = "//p[b[contains(text(),'Brand:')]]")
	public static WebElement brand; 
	@FindBy(how = How.ID, using = "search_product")
	public static WebElement Recharge; 
	@FindBy(how = How.ID, using = "submit_search")
	public static WebElement btnRecharge;
	@FindBy(how = How.CSS, using = ".title.text-center")
	public static WebElement titleRecharge;
	@FindBy(how = How.CSS, using = ".features_items")
	public static WebElement TousListRecharge;
	public TestCase8Object() {
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();
	}
	public void clickprodcut() {
		btnprodcut.click();
	}
	public void laListeDesProduits() {
	  WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(20));
      wait.until(ExpectedConditions.visibilityOf(listprodcut));
	}

	public void voirpremierproduct() {
		btnviewproduc.click();

	}
	public void ChampDeRecherche() {
	Recharge.sendKeys("Dress");
	btnRecharge.click();
	
		
	}
}

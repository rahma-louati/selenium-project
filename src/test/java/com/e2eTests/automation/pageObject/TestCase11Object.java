package com.e2eTests.automation.pageObject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.Setup;

public class TestCase11Object {
	public ConfigFileReader configFileReader;
	@FindBy(how = How.XPATH, using = "//a[@href='/view_cart' and text()=' Cart']")
	public static WebElement btnCard;
	@FindBy(how = How.XPATH, using = "//div[@class='single-widget']//h2[text()='Subscription']")
	public static WebElement title;
	@FindBy(how = How.ID, using = "susbscribe_email")
	public static WebElement btnemail;
	@FindBy(how = How.ID, using = "subscribe")
	public static WebElement btnbouton;
	@FindBy(how = How.CSS, using = ".alert-success.alert")
	public static WebElement title2;
	@FindBy(how = How.ID, using = "scrollUp")
	public static WebElement btnRemonter;
	@FindBy(how = How.XPATH, using = "(//div[@class='col-sm-6']/h2)[1]")
	public static WebElement titlemsg;

	public TestCase11Object() {
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();
	}

	public void ClickCard() {
		btnCard.click();

	}

	public void Scroll() {
		((JavascriptExecutor) Setup.getDriver()).executeScript("window.scrollBy(0, 500)", "");
	}

	public void saisirmailetcliq() {
		btnemail.sendKeys("Rahmalouati873@gmail.com");
		btnbouton.click();
	}

	public void visbilit() {
		((JavascriptExecutor) Setup.getDriver()).executeScript("window.scrollBy(0, 10000)", "");
		WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(2000));
		wait.until(ExpectedConditions.visibilityOf(title2));

	}

	public void FlècheRemonter()  {
		btnRemonter.click();

	}
}

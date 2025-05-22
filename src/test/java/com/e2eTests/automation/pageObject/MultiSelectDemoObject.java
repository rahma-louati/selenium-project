package com.e2eTests.automation.pageObject;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.Setup;

public class MultiSelectDemoObject {
	public ConfigFileReader configFileReader;
	@FindBy(how = How.ID, using = "cars")
	public static WebElement menuList;
	@FindBy(how = How.ID, using = "oldSelectMenu")
	public static WebElement SeulList;
	@FindBy(how = How.XPATH, using = "(//div[@class=' css-tlfecz-indicatorContainer'])[3]")
	public static WebElement Button;

	@FindBy(how = How.XPATH, using = "//div[contains(text(), 'Blue')]")
	public static WebElement Bleuoption;
	@FindBy(how = How.XPATH, using = "//div[contains(text(), 'Green')]")
	public static WebElement Greenoption;
	private boolean isIndigoSelected;

	public MultiSelectDemoObject() {
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();
	}

	public void login() {
		Setup.getDriver().get(configFileReader.getProperties("urlMultiselct"));
	}

	public void Saaeb() {
		((JavascriptExecutor) Setup.getDriver()).executeScript("window.scrollBy(0, 900)", "");
		Select selectlist = new Select(menuList);
		selectlist.selectByIndex(1);
	}

	public void Audi() {
		Select selectlist = new Select(menuList);
		selectlist.selectByVisibleText("Audi");
	}

	public void Opel() {
		Select selectlist = new Select(menuList);
		selectlist.selectByValue("opel");

	}

	public void MultiSelect() {
		Select selectlist = new Select(menuList);
		List<WebElement> selectedoptions = selectlist.getAllSelectedOptions();
		for (WebElement compteur : selectedoptions) {
			System.out.println(compteur.getText());

		}
	}

	public void Red() {
		((JavascriptExecutor) Setup.getDriver()).executeScript("window.scrollBy(0, 900)", "");
		Select selectlist = new Select(SeulList);

		selectlist.selectByValue("red");

	}

	public void Yellow() {
		Select selectlist = new Select(SeulList);
		selectlist.selectByVisibleText("Yellow");
	}

	public void Black() {
		Select selectlist = new Select(SeulList);
		selectlist.selectByVisibleText("Black");
	}

	public void Indigo() {
		Select selectlist = new Select(SeulList);
		selectlist.selectByVisibleText("Indigo");
	}

	public void selectedOption() {
		Select select = new Select(SeulList);
		List<WebElement> selectoptions = select.getAllSelectedOptions();
		isIndigoSelected = false;
		for (WebElement option : selectoptions) {
			if (option.getText().equals("Indigo")) {
				isIndigoSelected = true;
				break;
			}
		}
	}

	public void clickmenudropdwon() {
		((JavascriptExecutor) Setup.getDriver()).executeScript("window.scrollBy(0, 900)", "");
		Button.click();

	}

	public void Blueoptionn() {
		WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(Bleuoption)).click();
	}

	public void Greenoptionn() {
		WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(Greenoption)).click();
	}
	
	public void lesOptionsSélectionnéesBlueEtGree() {
		WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(Bleuoption));
		wait.until(ExpectedConditions.visibilityOf(Greenoption));
	}
}

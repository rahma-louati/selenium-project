package com.e2eTests.automation.pageObject;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.Setup;

public class DropDowListObject {
	public ConfigFileReader configFileReader ;
	@FindBy(how = How.ID, using = "dropdown-menu")
	public static WebElement btnmenu;
	@FindBy(how = How.ID, using = "rounded-dropdown")
	public static WebElement btnmenu2;
	@FindBy(how = How.ID, using = "multiselect-dropdown")
	public static WebElement btnmenu3;
	@FindBy(how = How.CSS, using = "input[value='Option 1']")
	public static WebElement opt1;
	@FindBy(how = How.CSS, using = "input[value='Option 2']")
	public static WebElement opt2;
	@FindBy(how = How.CSS, using = "input[value='Option 3']")
	public static WebElement opt3;
	@FindBy(how = How.CSS, using = "input[value='Option 5']")
	public static WebElement opt5;

	public DropDowListObject() {
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader = new ConfigFileReader();
	}

	public void login() {
		Setup.getDriver().get(configFileReader.getProperties("urlDragAndDropList"));
	}

	public void click() {
		btnmenu.click();

	}
	public void option3() {
		Select selectList = new Select(btnmenu);
		selectList.selectByValue("3");
	}
	public void option2() {
		Select selectList = new Select(btnmenu);
		selectList.selectByVisibleText("Option 2");
	}
	public boolean isOption2Selected() {
	    Select select = new Select(btnmenu);
	    List<WebElement> selectedOptions = select.getAllSelectedOptions();
	    for (WebElement option : selectedOptions) {
	        if (option.getText().trim().equals("Option 2")) {
	            return true;
	        }
	    }
	    return false;
	}


	    

	public void clickmenu2() {
		btnmenu2.click();
	}
	public void optionB() {
		Select selectList = new Select(btnmenu2);
		selectList.selectByVisibleText("Option B");
	}
	public void optionC() {
		Select selectList = new Select(btnmenu2);
		selectList.selectByValue("z");
	}
	public void OptionCselectionné() {
        Select select = new Select(btnmenu2);  
        List<WebElement> selectedOptions = select.getAllSelectedOptions();  
        boolean isOptionCSelected = false;
        for (WebElement option : selectedOptions) {
            if (option.getText().trim().equals("Option C")) {
                isOptionCSelected = true; 
               break;  
            }
        }
        if (isOptionCSelected) {
            System.out.println("Option C est sélectionnée.");
        } else {
            System.out.println("Option C n'est pas sélectionnée.");
        }
    }

	

	public void multioption1() {
		opt1.click();
	}
	public void multioption2() {
		opt2.click();
	}
	public void multioption3() {
		opt3.click();
	}
	public void multioption5() {
		((JavascriptExecutor) Setup.getDriver()).executeScript("window.scrollBy(0, 500)", "");
		opt5.click();
	}



}
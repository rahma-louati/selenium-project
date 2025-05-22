package com.e2eTests.automation.stepDefintion;


import org.junit.Assert;
import com.e2eTests.automation.pageObject.DropDowListObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DropDowListSteps {
	private DropDowListObject dropDowListObject;
public DropDowListSteps() {
	dropDowListObject = new DropDowListObject();
}
	@Given("j ouvre l url du site qatraining")
	public void jOuvreLUrlDuSiteQatraining() {
		dropDowListObject.login();
	   
	}
	@When("je clique sur le bouton menu1")
	public void jeCliqueSurLeBoutonMenu1() {
		dropDowListObject.click();
	    
	}
	@When("je sélectionne Option3")
	public void jeSélectionneOption3() {
		dropDowListObject.option3();
	    
	}
	@When("je sélectionne Option2")
	public void jeSélectionneOption2() {
		dropDowListObject.option2();
	   
	}
	@Then("je vérifie que loption {string} est sélectionnée")
	public void jeVérifieQueLoptionEstSélectionnée(String optionAttendue) {
		boolean isSelected = dropDowListObject.isOption2Selected();
	    Assert.assertTrue("L'option 2 n'est pas sélectionnée", isSelected);
	    }
	
	
	@When("je clique sur le bouton menu2")
	public void jeCliqueSurLeBoutonMenu2() {
		dropDowListObject.clickmenu2();
	   
	}
	@When("je sélectionne OptionB")
	public void jeSélectionneOptionB() {
		dropDowListObject.optionB();
	    
	}
	@When("je sélectionne OptionC")
	public void jeSélectionneOptionC() {
		dropDowListObject.optionC();
		dropDowListObject.clickmenu2();
	  
	}

	@Then("je vérifie  OptionC  sélectionné")
	public void jeVérifieOptionCSélectionné() {
		 dropDowListObject.OptionCselectionné();    
	}
	

	@When("je sélectionne l Option1")
	public void jeSélectionneLOption1() {
		dropDowListObject.multioption1();
	  
	}
	@When("je sélectionne l Option2")
	public void jeSélectionneLOption2() {
	    dropDowListObject.multioption2();
	}
	@When("je sélectionne l Option3")
	public void jeSélectionneLOption3() {
	  dropDowListObject.multioption3();
	}
	@When("je sélectionne l Option5")
	public void jeSélectionneLOption5() {
	    dropDowListObject.multioption5();
	    }
	@Then("je vérifie  Option1, Option2,Option3 et Option5 sélectionné")
	public void jeVérifieOption1Option2Option3EtOption5Sélectionné() {
	}


}

package com.e2eTests.automation.stepDefintion;

import org.junit.Assert;

import com.e2eTests.automation.pageObject.MultiSelectDemoObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultiSelectDemoSteps {
	private MultiSelectDemoObject multiSelectDemoObject;
	public MultiSelectDemoSteps() {
		multiSelectDemoObject = new MultiSelectDemoObject();
	}

	@Given("j ouvre l url du site DemoQA")
	public void jOuvreLUrlDuSiteDemoQA() {
		multiSelectDemoObject.login();

	}

	@When("je sélectionne Saaeb")
	public void jeSélectionneSaaeb() {
		multiSelectDemoObject.Saaeb();

	}

	@When("je sélectionne Audi")
	public void jeSélectionneAudi() {
		multiSelectDemoObject.Audi();

	}

	@When("je sélectionne Opel")
	public void jeSélectionneOpel() {
		multiSelectDemoObject.Opel();

	}

	@Then("les options sélectionnées  devraient être Saab, Audi et Opel")
	public void lesOptionsSélectionnéesDevraientÊtreSaabAudiEtOpel() {
		multiSelectDemoObject.MultiSelect();

	}

	@When("je sélectionne Red")
	public void jeSélectionneRed() {
		multiSelectDemoObject.Red();

	}
	@When("je sélectionne Yellow")
	public void jeSélectionneYellow() {
		multiSelectDemoObject.Yellow();
	    
	}
	@When("je sélectionne Black")
	public void jeSélectionneBlack() {
		multiSelectDemoObject.Black();
	  
	}
	@When("je sélectionne Indigo")
	public void jeSélectionneIndigo() {
		multiSelectDemoObject.Indigo();
	   
	}

	@Then("je vérifier Indigo sélectionné")
	public void jeVérifierIndigoSélectionné() {
		multiSelectDemoObject.MultiSelect();
	}

	@When("je clique sur le bouton menuu")
	public void jeCliqueSurLeBoutonMenuu() {
	   multiSelectDemoObject.clickmenudropdwon();
	}
	@When("je sélectionne  Blue")
	public void jeSélectionneBlue() {
		multiSelectDemoObject.Blueoptionn();
	    
	}
	@When("je sélectionne  Green")
	public void jeSélectionneGreen() {
		multiSelectDemoObject.Greenoptionn();
	    
	}
	@Then("les options sélectionnées devraient être  Blue et Green")
	public void lesOptionsSélectionnéesDevraientÊtreBlueEtGreen()  {
		multiSelectDemoObject.lesOptionsSélectionnéesBlueEtGree();

		String blueClass = MultiSelectDemoObject.Bleuoption.getAttribute("class");
		String greenClass = MultiSelectDemoObject.Greenoption.getAttribute("class");
		boolean isBlueSelected = (blueClass != null && blueClass.contains("css-12jo7m5"));
	    boolean isGreenSelected = (greenClass != null && greenClass.contains("css-12jo7m5"));
	   Assert.assertTrue("Blue option is not selected!", isBlueSelected);
	    Assert.assertTrue("Green option is not selected!", isGreenSelected);
	}


}

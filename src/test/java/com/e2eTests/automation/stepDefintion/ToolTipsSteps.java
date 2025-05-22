package com.e2eTests.automation.stepDefintion;

import org.junit.Assert;

import com.e2eTests.automation.pageObject.ToolTipsObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ToolTipsSteps {
	private ToolTipsObject toolTipsObject;
	public ToolTipsSteps() {
		toolTipsObject=new ToolTipsObject();
	}
	

	@Given("j ouvre  url du  site qatraining")
	public void jOuvreUrlDuSiteQatraining() {
		toolTipsObject.login();
	   
	}
	@When("je survole le bouton  su {string}")
	public void jeSurvoleLeBoutonSu(String string) {
		toolTipsObject.SurvoleLeBouton();

	}

	@Then("je vérifie que le message affiche est {string}")
	public void jeVérifieQueLeMessageAfficheEst(String string) {
		String toolTipsText =toolTipsObject.affichagemsg();
		Assert.assertEquals("Ceci est un tooltip classique", toolTipsText);
	}


}

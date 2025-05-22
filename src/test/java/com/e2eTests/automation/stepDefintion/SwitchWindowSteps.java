package com.e2eTests.automation.stepDefintion;

import com.e2eTests.automation.pageObject.SwitchWindowObjcet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwitchWindowSteps {
	private SwitchWindowObjcet switchWindowObjcet;
	public SwitchWindowSteps() {
		switchWindowObjcet = new SwitchWindowObjcet();
	}
	
	@Given("j ouvre lurl du site qatraining")
	public void jOuvreLurlDuSiteQatraining() {
		switchWindowObjcet.login();
	  
	}
	@When("je clique sur le bouton {string}")
	public void jeCliqueSurLeBouton(String string) {
		switchWindowObjcet.cliquebouton();
	   
	}
	@When("une nouvelle fenêtre s ouvre")
	public void uneNouvelleFenêtreSOuvre() {
		switchWindowObjcet.NouvelleFenêtre();
	   
	}
	@Then("j écris sur la fenêtre")
	public void jÉcrisSurLaFenêtre() {
		switchWindowObjcet.ÉcrisSurLaFenêtre();
	   
	}



}

package com.e2eTests.automation.stepDefintion;

import com.e2eTests.automation.pageObject.KyBordEventObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class KyBordEventSteps {
	private KyBordEventObject kyBordEventObject;
	
	public  KyBordEventSteps() {
		kyBordEventObject= new KyBordEventObject();
	}
	@Given("jouvre url de site qatraining")
	public void jouvreUrlDeSiteQatraining() {
		kyBordEventObject.login();
	   
	}

	@When("jécris le texte {string}")
	public void jécrisLeTexte(String string) {
		kyBordEventObject.écristexte();

	}
	@When("je copie le texte")
	public void jeCopieLeTexte()  {
		kyBordEventObject.copietexte();
	   
	}
	@Then("je colle le texte")
	public void jeColleLeTexte()  {
		kyBordEventObject.collertexte();
	    
	}



}

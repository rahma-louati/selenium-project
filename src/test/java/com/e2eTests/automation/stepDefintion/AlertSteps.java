package com.e2eTests.automation.stepDefintion;

import com.e2eTests.automation.pageObject.AlertObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertSteps {
	private AlertObject alertObject ;
	public AlertSteps() {
		alertObject= new AlertObject();
	}
	@Given("j ouvre lurl DemoQA")
	public void jOuvreLurlDemoQA() {
		alertObject.login();
	}
	@When("je clique sur le bouton pour voir lalerte")
	public void jeCliqueSurLeBoutonPourVoirLalerte() {
		alertObject.click();
	}
	@Then("je clique sur lalerte")
	public void jeCliqueSurLalerte() {
		alertObject.CliqueLalerte();
	    
	}
}

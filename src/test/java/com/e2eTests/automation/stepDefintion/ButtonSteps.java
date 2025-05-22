package com.e2eTests.automation.stepDefintion;

import org.junit.Assert;

import com.e2eTests.automation.pageObject.ButtonObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ButtonSteps {
	private ButtonObject buttonObject;

	public ButtonSteps() {

		buttonObject = new ButtonObject();
	}

	@Given("j ouvre l url DemoQA")
	public void jOuvreLUrlDemoQA() {
		buttonObject.login();
	}

	@When("je clique sur le boutton")
	public void jeCliqueSurLeBoutton() {
		buttonObject.doubleClick();
	    
	}


	@Then("un message s affiche {string}")
	public void unMessageSAffiche(String attendu) {
		String obtenu = ButtonObject.msg.getText();
		Assert.assertEquals(attendu, obtenu);

	}

	@When("je clique sur le boutton Right Click Me")
	public void jeCliqueSurLeBouttonRightClickMe() {
		buttonObject.RightClick();

	}

	@Then("un message de right clique s affiche {string}")
	public void unMessageDeRightCliqueSAffiche(String attendu) {
		String obtenu = ButtonObject.msg2.getText();
		Assert.assertEquals(attendu, obtenu);
	}

	@When("je clique sur le boutton Click Me")
	public void jeCliqueSurLeBouttonClickMe() {
		buttonObject.iddynamique();

	}

	@Then("un message apres le click s affiche {string}")
	public void unMessageApresLeClickSAffiche(String attendu) {
		String obtenu = ButtonObject.msg3.getText();
		Assert.assertEquals(attendu, obtenu);
	}

}

package com.e2eTests.automation.stepDefintion;

import org.junit.Assert;
import com.e2eTests.automation.pageObject.MouseHoverObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MouseHoverSteps {
	private MouseHoverObject mouseHoverObject;
	public MouseHoverSteps() {
		mouseHoverObject = new MouseHoverObject();
	}
	
	
	@Given("j ouvre le navigateur avec l url qatraining")
	public void jOuvreLeNavigateurAvecLUrlQatraining() {
	    mouseHoverObject.login();
	}

	@When("je survole le bouton {string}")
	public void jeSurvoleLeBouton(String string) {
		mouseHoverObject.mousehover();

	}
	@Then("je vérifie l'affichage des options {string}, {string}, {string}")
	public void jeVérifieLAffichageDesOptions(String attendu1, String attendu2, String attendu3) {
		String result1 = MouseHoverObject.opt1.getText();
		System.out.println(result1);
		Assert.assertEquals(attendu1, result1);
		String result2 = MouseHoverObject.opt2.getText();
		Assert.assertEquals(attendu2, result2);
		String result3 = MouseHoverObject.opt3.getText();
		Assert.assertEquals(attendu3, result3);
	    
	}



}

package com.e2eTests.automation.stepDefintion;

import org.junit.Assert;

import com.e2eTests.automation.pageObject.FrameObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FrameSteps {
	private FrameObject frameObject;
	public FrameSteps() {
		frameObject = new FrameObject();
	}
	
	@Given("jouvre l url du site demo")
	public void jouvreLUrlDuSiteDemo() {
		frameObject.login();
	  
	}
	@When("je clique sur le frame")
	public void jeCliqueSurLeFrame() {
	   frameObject.cliqueframe();
	}

	@When("je reviens vers la page initiale")
	public void jeReviensVersLaPageInitiale() {
		frameObject.revienspageinitiale();
	}

	@When("je écris {string} dans lemail")
	public void jeÉcrisDansLemail(String email) {
		frameObject.ecrireEmail(email);
	}

		@Then("je vérifie que l email est écrit {string}")
		public void jeVérifieQueLEmailEstÉcrit(String attendu)  {
			 String result = frameObject.getEmailValue();
			    Assert.assertEquals(attendu, result);
		}

}

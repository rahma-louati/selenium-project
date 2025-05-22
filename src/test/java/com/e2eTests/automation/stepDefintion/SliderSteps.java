package com.e2eTests.automation.stepDefintion;

import org.junit.Assert;

import com.e2eTests.automation.pageObject.SliderObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SliderSteps {
	private SliderObject sliderObject;
	public SliderSteps () {
		sliderObject = new SliderObject();
	}
	
	@Given("J ouvre  lurl du site qatraining")
	public void jOuvreLurlDuSiteQatraining() {
		sliderObject.login();
	}
	@When("je déplace le slider")
	public void jeDéplaceLeSlider() {
	    sliderObject.deplaceslider();
	}
	

	@Then("je vérifie que {string}")
	public void jeVérifieQue(String string) {
		String resut=SliderObject.title.getText();
		Assert.assertEquals("Valeur du slider : 80", resut);
	
	    
	}




}

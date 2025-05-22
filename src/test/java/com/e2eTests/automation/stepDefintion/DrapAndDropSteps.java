package com.e2eTests.automation.stepDefintion;

import org.junit.Assert;
import com.e2eTests.automation.pageObject.DragAndDropObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DrapAndDropSteps {
	public DragAndDropObject dragAndDropObject;

	public DrapAndDropSteps() {

		dragAndDropObject = new DragAndDropObject();
	}

	@Given("j ouvre le site qatraining")
	public void jOuvreLeSiteQatraining() {
		dragAndDropObject.login();
	}

	@When("je fais un drag and drop")
	public void jeFaisUnDragAndDrop() {
		dragAndDropObject.draganddropelemnt();
	}

	@Then("je vérifie que le message {string} s'affiche")
	public void jeVérifieQueLeMessageSAffiche(String attendu) {
		String resut = DragAndDropObject.msg.getText();
		Assert.assertEquals(attendu, resut);

	}

}

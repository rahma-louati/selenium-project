package com.e2eTests.automation.stepDefintion;

import org.junit.Assert;
import com.e2eTests.automation.pageObject.LogoutObject;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutSteps {
	private LogoutObject logoutObject;

	public LogoutSteps() {
		logoutObject = new LogoutObject();
	}

	@When("je clique sur le bouton menu")
	public void jeCliqueSurLeBoutonMenu() {
		logoutObject.clickBtnmenu();

	}

	@When("je clique sur le bouton logout")
	public void jeCliqueSurLeBoutonLogout() {
		logoutObject.clickBtnlogout();

	}

	@Then("je verifie que l utlisateur est deconnecté et la page connexion est affichée {string}")
	public void jeVerifieQueLUtlisateurEstDeconnectéEtLaPageConnexionEstAffichée(String attendu) {
		String obtenu = LogoutObject.passwordeconne.getText();
		Assert.assertEquals(attendu, obtenu);

	}

}

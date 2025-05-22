package com.e2eTests.automation.stepDefintion;

import org.junit.Assert;
import com.e2eTests.automation.pageObject.LoginObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	private LoginObject loginObject;

	public LoginSteps() {
		loginObject = new LoginObject();
	}

	@Given("j ouvre le navigateur avec l url swaglabs")
	public void jOuvreLeNavigateurAvecLUrlSwaglabs() {
		loginObject.login();
	}

	@When("je saisi le username {string}")
	public void jeSaisiLeUsername(String username) {
		loginObject.saisirUsername(username);
	}

	@When("je saisi le mot de passe {string}")
	public void jeSaisiLeMotDePasse(String password) {
		loginObject.saisirPassword(password);
	}

	@When("je clique sur le boutton login")
	public void jeCliqueSurLeBouttonLogin() {
		loginObject.clickBtn();
	}

	@Then("je me dirige vers la page dacceuil {string}")
	public void jeMeDirigeVersLaPageDacceuil(String attendu) {
		String obtenu = LoginObject.title.getText();
		Assert.assertEquals(attendu, obtenu);
	}

	@Then("un message d erreur s affiche  {string}")
	public void unMessageDErreurSAffiche(String attendu) {
		String resultat = LoginObject.msg.getText();
		Assert.assertEquals(attendu, resultat);
	}

	@Given("je me connecte a l application swaglabs")
	public void jeMeConnecteALApplicationSwaglabs() {
		loginObject.connexion();

	}

}

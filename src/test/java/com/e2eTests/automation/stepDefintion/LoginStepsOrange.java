package com.e2eTests.automation.stepDefintion;

import org.junit.Assert;

import com.e2eTests.automation.pageObject.LoginObjectOrange;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsOrange {

	private LoginObjectOrange loginObjectOrange;

	public LoginStepsOrange() {
		loginObjectOrange = new LoginObjectOrange();
	}

	@Given("J ouvre le navigateur avec url rangeHRMDemo")
	public void jOuvreLeNavigateurAvecUrlRangeHRMDemo() {
		loginObjectOrange.login();
	}
	@When("Je saisi le username")
	public void jeSaisiLeUsername() {
		loginObjectOrange.SaisirUsername();
	}
	@When("Je saisi le mot de passe")
	public void jeSaisiLeMotDePasse() {
		loginObjectOrange.SaisirPassword();
	}

	@When("Je clique sur le boutton Login")
	public void jeCliqueSurLeBouttonLogin() {
		loginObjectOrange.clickBtn();
	}
	
	@When("Je vérifie que le bouton de connexion est de couleur orange")
	public void jeVérifieQueLeBoutonDeConnexionEstDeCouleurOrange() {
		String couleurObtenue = loginObjectOrange.getLoginButtonColorHex();
		Assert.assertEquals(couleurObtenue, "#ff7b1d");
	}
	@Then("je me dirige vers la page dacceuil  {string}")
	public void jeMeDirigeVersLaPageDacceuil(String attendu) {
		loginObjectOrange.pagevisible();
		String resultat = LoginObjectOrange.msg.getText();
		Assert.assertEquals(attendu, resultat);
	}

}

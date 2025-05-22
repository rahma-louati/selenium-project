package com.e2eTests.automation.stepDefintion;
import org.junit.Assert;
import com.e2eTests.automation.pageObject.TestCaseObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCaseSteps {
	private TestCaseObject testCaseObject;
	public  TestCaseSteps() {
		testCaseObject = new TestCaseObject();
	}

	@Given("j ouvre url du site")
	public void jOuvreUrlDuSite() {
	    testCaseObject.login();
	}

	@When("je vérifie que la page d accueil  {string}")
	public void jeVérifieQueLaPageDAccueil(String attendu) {
		
		String resut = TestCaseObject.title.getText().trim();
		String cleanedResult = resut.replaceAll("[^\\x20-\\x7e]", "").trim();
		Assert.assertEquals(attendu, cleanedResult);
	   
	}
	@When("je clique sur le bouton\"Contact Us\"")
	public void jeCliqueSurLeBoutonContactUs() {
	   testCaseObject.ClickContact();
	}
	@When("je vérifie affichage de  {string}")
	public void jeVérifieAffichageDe(String attendu2) {
		String resut2 = TestCaseObject.title2.getText();
		Assert.assertEquals(attendu2, resut2);
	}
	@When("saisis mon nom, mon adresse e-mail, mon objet et mon message")
	public void saisisMonNomMonAdresseEMailMonObjetEtMonMessage() {
	    testCaseObject.saisisNomAdresseMail();
	}
	@When("je télécharge le fichier")
	public void jeTéléchargeLeFichier() {
		testCaseObject.TéléchargeFichier();   
	}
	@When("Cliquez sur le bouton Submit")
	public void cliquezSurLeBoutonSubmit() {
	    testCaseObject.Clicksubmit();
	}
	@When("Cliquez sur le bouton  OK")
	public void cliquezSurLeBoutonOK()  {
	   testCaseObject.Clickok();
	}
	@Then("je vérifie que le messages saffiche {string}")
	public void jeVérifieQueLeMessagesSaffiche(String attendu3) {
		String resut3 = TestCaseObject.msg1.getText();
		Assert.assertEquals(attendu3, resut3);
	}
	@When("je clique sur le bouton  {string}")
	public void jeCliqueSurLeBouton(String string) {
	    testCaseObject.Clickhome();
	}
	
	  @Then("je vérifie que je suis sur la page daccueil {string}")
	    public void jeVérifieQueJeSuisSurLaPageDaccueil(String attendu) {
		String resut = TestCaseObject.title.getText().trim();
		String cleanedResult = resut.replaceAll("[^\\x20-\\x7e]", "").trim();
			Assert.assertEquals(attendu, cleanedResult);
	    }

}

package com.e2eTests.automation.stepDefintion;


import org.junit.Assert;


import com.e2eTests.automation.pageObject.TestCase11Object;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCase11Steps {
	private TestCase11Object testCase11Object;
	public  TestCase11Steps() {
		testCase11Object = new TestCase11Object();
	}


	@When("je clique sur le bouton cart")
	public void jeCliqueSurLeBoutonCart() {
	    testCase11Object.ClickCard();
	}

	@When("Je fais défiler jusqu au pied de page")
	public void jeFaisDéfilerJusquAuPiedDePage() {
		testCase11Object.Scroll();
	   
	}

	@Then("je vérifie {string}")
	public void jeVérifie(String attendu) {
		String resut = TestCase11Object.title.getText();
		Assert.assertEquals(attendu,resut);
	}
	@When("je saisis adresse e-mail et je clique sur la flèche")
	public void jeSaisisAdresseEMailEtJeCliqueSurLaFlèche() {
	    testCase11Object.saisirmailetcliq();
	}
	@Then("je vérifiele message {string}")
	public void jeVérifieleMessage(String attendu) {
		    testCase11Object.visbilit();
		    String result = TestCase11Object.title2.getText();
		    Assert.assertEquals(attendu, result);
		}

	
	
	@When("je Clique sur la flèche en bas à droite pour remonter")
	public void jeCliqueSurLaFlècheEnBasÀDroitePourRemonter() {
	   testCase11Object.FlècheRemonter();
	}
	@Then("je Vérifiez que la page est affichée vers le haut et que le texte {string}")
	public void jeVérifiezQueLaPageEstAffichéeVersLeHautEtQueLeTexte(String attendu) {
	    String resut = TestCase11Object.titlemsg.getText();
	    Assert.assertEquals(attendu, resut);
	    
	}


}

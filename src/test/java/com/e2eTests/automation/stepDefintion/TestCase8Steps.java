package com.e2eTests.automation.stepDefintion;

import org.junit.Assert;

import com.e2eTests.automation.pageObject.TestCase8Object;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCase8Steps {
	private TestCase8Object  testCase8Object;
	public  TestCase8Steps() {
		testCase8Object = new TestCase8Object();
		
	}

	@When("je clique le bouton Products")
	public void jeCliqueLeBoutonProducts() {
		testCase8Object.clickprodcut();
	}
	@Then("je verfie que la page daccueil saffiche  {string}")
	public void jeVerfieQueLaPageDaccueilSaffiche(String attendu) {
		String resut = TestCase8Object.Allprodcut.getText();
		Assert.assertEquals(attendu,resut);
	  
	}

	@When("La liste des produits est visible")
	public void laListeDesProduitsEstVisible() {
		testCase8Object.laListeDesProduits();
		String result = TestCase8Object.Allprodcut.getText();
		Assert.assertTrue("La liste des produits n'est pas visible", TestCase8Object.listprodcut.isDisplayed());

	}
	@When("je clique sur le bouton Voir le produit pour le premier produit")
	public void jeCliqueSurLeBoutonVoirLeProduitPourLePremierProduit() {
		testCase8Object.voirpremierproduct();
	   
	}

	@When("je vérifie que la page daccueil saffiche")
	public void jeVérifieQueLaPageDaccueilSaffiche() {
		Assert.assertTrue("Le nom du produit n'est pas visible", TestCase8Object.nonproduit.isDisplayed());
	}
	@Then("je vérifie que les détails sont visibles  product name, category, price, availability, condition, brand")
	public void jeVérifieQueLesDétailsSontVisiblesProductNameCategoryPriceAvailabilityConditionBrand() {
		Assert.assertTrue("Le nom du produit n'est pas visible", TestCase8Object.nonproduit.isDisplayed());
		Assert.assertTrue("La catégorie du produit n'est pas visible", TestCase8Object.category.isDisplayed());
		Assert.assertTrue("Le prix du produit n'est pas visible", TestCase8Object.price.isDisplayed());
		Assert.assertTrue("La disponibilité du produit n'est pas visible",TestCase8Object.availability.isDisplayed());
		Assert.assertTrue("La condition du produit n'est pas visible", TestCase8Object.condition.isDisplayed());
		Assert.assertTrue("La marque du produit n'est pas visible", TestCase8Object.brand.isDisplayed());
	}

	@When("je saisis le nom du produit dans le champ de recherche et clique sur le bouton « Rechercher »")
	public void jeSaisisLeNomDuProduitDansLeChampDeRechercheEtCliqueSurLeBoutonRechercher() {
	    testCase8Object.ChampDeRecherche();
	}
	@Then("je vérifie que la section {string} est visible")
	public void jeVérifieQueLaSectionEstVisible(String attendu) {
		String result= TestCase8Object.titleRecharge.getText();
		Assert.assertEquals(attendu, result);
	}
	@Then("je vérifie que tous les produits liés à la recherche sont visibles")
	public void jeVérifieQueTousLesProduitsLiésÀLaRechercheSontVisibles() {
		 Assert.assertTrue("La liste des produits n'est pas visible", TestCase8Object.TousListRecharge.isDisplayed());
	}


}

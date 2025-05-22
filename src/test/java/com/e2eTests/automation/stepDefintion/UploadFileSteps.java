package com.e2eTests.automation.stepDefintion;

import org.junit.Assert;

import com.e2eTests.automation.pageObject.UplodFileObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UploadFileSteps {
	private UplodFileObject uplodFileObject;
	public UploadFileSteps() {
		uplodFileObject= new UplodFileObject();
	}

	@Given("j ouvre lurl du site demo")
	public void jOuvreLurlDuSiteDemo() {
	    uplodFileObject.login();
	}
	@When("je clique sur le bouton choisir fichier")
	public void jeCliqueSurLeBoutonChoisirFichier(){
	
	    
	}
	@When("je choisis le fichier")
	public void jeChoisisLeFichier() throws InterruptedException {
		uplodFileObject.ChoisisFichier();
	   
	}
	@When("je clique sur le bouton\"I accept terms of service\"")
	public void jeCliqueSurLeBoutonIAcceptTermsOfService() {
	   uplodFileObject.IAcceptTermsOfService();
	}
	

	@When("je clique sur le bouton submite File")
	public void jeCliqueSurLeBoutonSubmiteFile() {
		uplodFileObject.BoutonSubmiteFile();
	  
	}
	@Then("je vérifie le message {string}")
	public void jeVérifieLeMessage(String attendu) {
		uplodFileObject.WaitSuccessMessagevisible();
		String result= UplodFileObject.successMessage.getText().replaceAll("\\s+", " ").trim();
		System.out.println(result);
	    if (result.endsWith(".")) {
	        result = result.substring(0, result.length() - 1).trim();
	    } 
		Assert.assertEquals(attendu.replaceAll("\\s+", " ").trim(), result);  
	}
	

}

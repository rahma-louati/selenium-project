@ContactUsForm
Feature: Je veux tester le formulaire de contact du site automationexercise

  Background: 
    Given J ouvre le navigateur avec l URL automationexercise
    Then Verifier que la couleur de Home est orange
    When Je clique sur le bouton Contact Us
    Then Le titre saffiche "GET IN TOUCH"

  @Formulaire_cas_passant
  Scenario: Je veux tester le formulaire de contact du site automationexercise avec des données valides
    When Je saisis nom, mail, sujet et message valides
    And Je charge un fichier
    And Je clique sur le bouton Submit
    And Je clique sur le bouton OK
    Then Un message de succes saffiche "Success! Your details have been submitted successfully."
    When Je clique sur le bouton Home
    Then Je me redirige vers Home page

  @Formulaire_cas_non_passant1
  Scenario: Je veux tester le formulaire de contact du site automationexercise avec champ email vide
    And Je charge un fichier
    And Je clique sur le bouton Submit
    Then un message d erreur apparait

  @Formulaire_cas_non_passant2
  Scenario: Je veux tester le formulaire de contact du site automationexercise avec email invalide
    When Je saisis mail invalide
    And Je charge un fichier
    And Je clique sur le bouton Submit
    Then un message d erreur apparait

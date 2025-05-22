@testCase11
Feature: Tester le fonctionalité dabonnement
   Je veux  tester la fonctionnalité dabonnement
Background:  
    Given j ouvre url du site 
  @test_case11
  Scenario: Tester le fonctionalité dabonnement
    When je vérifie que la page d accueil  "Products"
    When je clique sur le bouton cart
    When Je fais défiler jusqu au pied de page
    Then je vérifie "SUBSCRIPTION"
    When je saisis adresse e-mail et je clique sur la flèche
    Then je vérifiele message 'You have been successfully subscribed!'

  @test_case25_26
  Scenario: Tester le fonctionalité dabonnement
    When je vérifie que la page d accueil  "Products"
    When Je fais défiler jusqu au pied de page
    Then je vérifie "SUBSCRIPTION"
    When je Clique sur la flèche en bas à droite pour remonter
    Then je Vérifiez que la page est affichée vers le haut et que le texte "Full-Fledged practice website for Automation Engineers"

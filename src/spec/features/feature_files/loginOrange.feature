@loginOrangeDemo
Feature: Authentification
  Je veux tester la page d authentifcation du site OrangeHRMDemo avec un login et password valides

  @tag1
  Scenario: Je veux tester la page d authentifcation du site OrangeHRMDemo avec un login et password valides
    Given J ouvre le navigateur avec url rangeHRMDemo
    When Je saisi le username 
    When Je saisi le mot de passe 
    When Je vérifie que le bouton de connexion est de couleur orange
    When Je clique sur le boutton Login
    Then je me dirige vers la page dacceuil  "Dashboard"

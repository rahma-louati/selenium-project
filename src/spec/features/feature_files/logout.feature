@logout
Feature: contrôle de la fonctionnalité du bouton "logout"
  je veux tester la déconnexion depuis page Products

  Background: 
    Given j ouvre le navigateur avec l url swaglabs
    When je saisi le username "standard_user"
    When je saisi le mot de passe "secret_sauce"
    When je clique sur le boutton login

  @logout_pass
  Scenario: je veux tester la déconnexion depuis page Products
    Given j ouvre le navigateur avec l url swaglabs
    When je clique sur le bouton menu
    When je clique sur le bouton logout
    Then je verifie que l utlisateur est deconnecté et la page connexion est affichée "Password for all users:"

  @logout_non_pass
  Scenario: je veux tester la connexion depuis page Products
    Then je me dirige vers la page dacceuil "Products"

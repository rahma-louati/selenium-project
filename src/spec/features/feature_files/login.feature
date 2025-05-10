@login
Feature: Authentification
  je veux tester la page dauthentification du site sauceLabs

  @login_cas_passant
  Scenario:  je veux tester la page dauthentification du site sauceLabs avec un login et password valides
    Given j ouvre le navigateur avec l url swaglabs
    When  je saisi le username "standard_user"
    When  je saisi le mot de passe "secret_sauce"
    When je clique sur le boutton login
    Then  je me dirige vers la page dacceuil "Products"
    
   @login_cas_non_passant
   Scenario: je veux tester la page dauthentification du site sauceLabs avec un login et password  non valides
    Given j ouvre le navigateur avec l url swaglabs
    When  je saisi le username "Rahma"
    When  je saisi le mot de passe "Rahma1234"
    When je clique sur le boutton login
    Then un message d erreur s affiche  "Epic sadface: Username and password do not match any user in this service"
    
     @authentification
  Scenario:  je veux tester la page dauthentification du site sauceLabs avec un login et password valides
    Given je me connecte a l application swaglabs
    Then  je me dirige vers la page dacceuil "Products"
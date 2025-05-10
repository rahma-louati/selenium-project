@test_tooltips
Feature: Tester la fonctionnalité tooltips
  Tester la fonctionnalité tooltips

  @tag1
  Scenario: Tester la fonctionnalité tooltips
    Given j ouvre  url du  site qatraining
    When je survole le bouton  su "Ceci est un tooltip classique"
    Then je vérifie que le message affiche est "Ceci est un tooltip classique"

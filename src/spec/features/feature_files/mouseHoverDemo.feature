@test_MH
Feature: Tester la fonctionnalité MouseHover
 Tester la fonctionnalité MouseHover

  @test_Mouse_hover
  Scenario: Tester la fonctionnalité MouseHover
    Given j ouvre le navigateur avec l url qatraining
    When je survole le bouton "hover me"
    Then je vérifie l'affichage des options "Option 1", "Option 2", "Option 3"
  




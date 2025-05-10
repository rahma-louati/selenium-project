
@testDRG
Feature: Tester la fonctionnalité drag and drop
  Tester la fonctionnalité drag and drop

  @test_drag_drop
  Scenario: Tester la fonctionalite drag and drop
    Given j ouvre le site qatraining
    When je fais un drag and drop
    Then je vérifie que le message "Déposé avec succès !" s'affiche
  

@test_uplod
Feature: Tester la fonctionnalité d upload de fichier
  Tester la fonctionnalité d upload de fichier

  @test_up
  Scenario: Tester la fonctionnalité d upload de fichier
    Given j ouvre lurl du site demo
    When je clique sur le bouton choisir fichier
    When je choisis le fichier
    When je clique sur le bouton"I accept terms of service"
    When je clique sur le bouton submite File
    Then je vérifie le message "1 file has been successfully uploaded"

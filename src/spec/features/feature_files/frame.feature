@test_FE
Feature: Tester la fonctionalté frame
  Tester la fonctionalté frame

  @test_frame_email
  Scenario: Tester la fonctionnalité frame et email
    Given jouvre l url du site demo
    When je clique sur le frame
    When je reviens vers la page initiale
    When je écris "Rahmalouati873@gmail.com" dans lemail
    Then je vérifie que l email est écrit "Rahmalouati873@gmail.com"

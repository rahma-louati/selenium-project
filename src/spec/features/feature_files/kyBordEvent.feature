@test_keyBordEvent
Feature: Tester la fonctionalite de copier et coller
  Tester la fonctionalite de copier et coller

  @tag1
  Scenario: Tester la fonctionalite de copier et coller
    Given jouvre url de site qatraining
    When jécris le texte "Bonjour"
    When je copie le texte
    Then je colle le texte

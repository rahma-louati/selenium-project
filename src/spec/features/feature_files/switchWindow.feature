@Switch
Feature: Tester la fonctionalite switch window
  Tester la fonctionnalité de basculement entre fenêtres

  @tag1
  Scenario: Tester la fonctionalite switch window
    Given j ouvre lurl du site qatraining
    When je clique sur le bouton "Ouvrir une nouvelle fenêtre"
    When une nouvelle fenêtre s ouvre
    Then j écris sur la fenêtre

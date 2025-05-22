@test_slider
Feature: Tester la fonctionalité de silder 
  Tester la fonctionalité de silder 

  @tag1
  Scenario: Tester la fonctionalité de silder 
    Given J ouvre  lurl du site qatraining
    When je déplace le slider
    Then je vérifie que "Valeur du slider : 80"
 



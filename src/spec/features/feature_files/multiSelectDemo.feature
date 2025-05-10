@TestSelect
Feature: Tester le multi-sélect du site DemoQA
  je veux tester la sélection du site DemoQA

  @Test_multi_select
  Scenario: je veux tester la sélection de plusieurs options dans le multi-sélect
    Given j ouvre l url du site DemoQA
    When je sélectionne Saaeb
    When je sélectionne Audi
    When je sélectionne Opel
    Then les options sélectionnées  devraient être Saab, Audi et Opel 
@Test_seul_select
 Scenario: je veux tester la sélection d options Old Style Select Menu
  Given j ouvre l url du site DemoQA
  When je sélectionne Red
  When je sélectionne Yellow
  When je sélectionne Black
  When je sélectionne Indigo
  Then je vérifier Indigo sélectionné
  @Test_multi_select_Drop
  Scenario: je veux tester la sélection d options Multiselect drop down
  Given j ouvre l url du site DemoQA
  When je clique sur le bouton menuu
  When je sélectionne  Blue
  When je sélectionne  Green
  Then les options sélectionnées devraient être  Blue et Green

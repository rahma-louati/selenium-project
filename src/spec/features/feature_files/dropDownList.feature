@Dropdown
Feature: Tester le multi-sélect du site qatraining
  je veux tester la sélection du site qatraining

  @Dropdown_classique
  Scenario: je veux tester la sélection de Dropdown classique
    Given j ouvre l url du site qatraining
    When je clique sur le bouton menu1
    When je sélectionne Option3
    When je sélectionne Option2
    Then je vérifie que loption "Option2" est sélectionnée

  @Dropdown_arrondi_moderne
  Scenario: je veux tester la sélection Dropdown arrondi moderne
    Given j ouvre l url du site qatraining
    When je clique sur le bouton menu2
    When je sélectionne OptionB
    When je sélectionne OptionC
    Then je vérifie  OptionC  sélectionné

  @Dropdown_multiselect
  Scenario: je veux tester Dropdown multiselect
    Given j ouvre l url du site qatraining
    When je sélectionne l Option1
    When je sélectionne l Option2
    When je sélectionne l Option3
    When je sélectionne l Option5
    Then je vérifie  Option1, Option2,Option3 et Option5 sélectionné

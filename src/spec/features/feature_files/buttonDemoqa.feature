@button
Feature: Tester les boutons du site DemoQA
  je veux tester les buttons du site DemoQA

  Background: 
    Given j ouvre l url DemoQA

  @test_double_click
  Scenario: je veux tester le button Double Click Me
    When je clique sur le boutton
    Then un message s affiche "You have done a double click"

  @test_right_click
  Scenario: je veux tester le bouton Right Click Me
    When je clique sur le boutton Right Click Me
    Then un message de right clique s affiche "You have done a right click"

  @test_dynamic_id
  Scenario: je veux tester le bouton Click Me
    When je clique sur le boutton Click Me
    Then un message apres le click s affiche "You have done a dynamic click"

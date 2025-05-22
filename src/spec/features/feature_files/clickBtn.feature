@clickBtn
Feature: Je veux tester les boutons du site DemoQA

  Background: 
    Given J ouvre le navigateur avec l URL DemoQA
    When Je clique sur Elements
    When Je clique sur Boutons

  @Double_clic
  Scenario: Je veux tester le double clic
    Given Je clique sur Double Click Me
    Then Un message de succes de double clic apparait "You have done a double click"

  @Right_clic
  Scenario: Je veux tester le right clic
    Given Je clique sur Right Click Me
    Then Un message de succes de right clic apparait "You have done a right click"

  @Dynamic_clic
  Scenario: Je veux tester le dynamic clic
    Given Je clique sur Click Me
    Then Un message de succes de dynamic clic apparait "You have done a dynamic click"

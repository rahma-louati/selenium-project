@FrameSwitch
Feature: Je veux tester le frame switch

  @FrameSwitch
  Scenario: Je veux tester le frame switch
    Given J ouvre le navigateur avec l URL demo guru
    When Je clique sur le iFrame
    When Je reviens vers la page initiale
    When Je saisis une adresse mail
    Then Le mail saffiche

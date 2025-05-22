@CopierColler
Feature: Je veux tester le Copier/Coller

  @CopierColler_cas_passant
  Scenario: Je veux tester le copier coller
    Given J ouvre le navigateur avec l URL qatraining
    When Je saisis un texte dans le champs texte à copier
    Then Le texte saisi est copié et collé dans le champs zone pour coller


@mouseHover
Feature: Je veux tester la fonctionnalité mouse hover

  @mouseHover
  Scenario: Je veux tester la fonctionnalité mouse hover
    Given J ouvre le navigateur avec url mouse hover 
    When Je survole le curseur sur le bouton Hover me
    Then Trois options saffichent "Option 1" "Option 2" "Option 3"


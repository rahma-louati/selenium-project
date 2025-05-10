@test_case6
Feature: Tester la fonctionnalité de Contact Us
    Je veux  tester la fonctionnalité de Contact Us

  @test_case6
  Scenario: Tester le formulaire de contact
    Given j ouvre url du site 
    When je vérifie que la page d accueil  "Products"
    When je clique sur le bouton"Contact Us"
    When je vérifie affichage de  "GET IN TOUCH"
    When saisis mon nom, mon adresse e-mail, mon objet et mon message
    When je télécharge le fichier
    When Cliquez sur le bouton Submit
    When Cliquez sur le bouton  OK
    Then je vérifie que le messages saffiche "Success! Your details have been submitted successfully."
    When je clique sur le bouton  "Home"
    Then je vérifie que je suis sur la page daccueil "Products"

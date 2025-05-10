@test_case
Feature: tester tous les produits et de la page de détails des produits
  Je veux  tester la fonctionnalité tous les produits et de la page de détails des produits
Background:  
    Given j ouvre url du site 
  @test_case8
  Scenario: tester tous les produits et de la page de détails des produits
    When je vérifie que la page d accueil  "Products"
    When je clique le bouton Products
    Then je verfie que la page daccueil saffiche  "ALL PRODUCTS"
    When La liste des produits est visible
    When je clique sur le bouton Voir le produit pour le premier produit
    When je vérifie que la page daccueil saffiche 
    Then je vérifie que les détails sont visibles  product name, category, price, availability, condition, brand
 
 @test_case_9
  Scenario: testerle bouton « Rechercher »
    When je vérifie que la page d accueil  "Products"
    When je clique le bouton Products
    Then je verfie que la page daccueil saffiche  "ALL PRODUCTS"
     When je saisis le nom du produit dans le champ de recherche et clique sur le bouton « Rechercher »
    Then je vérifie que la section "SEARCHED PRODUCTS" est visible
    And je vérifie que tous les produits liés à la recherche sont visibles
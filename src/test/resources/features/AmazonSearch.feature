
Feature: Amazon search feature

  Scenario: As a user I should see the search result successfully
    Given User is on Amazon page
    When User search product "iPhone13 512"
    And User clicks first product

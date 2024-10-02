Feature: Verify the dashboard feature of the application

  Background:
    Given user is on product list page
    When user inputs valid "standard_user" and "secret_sauce"

  Scenario: User should see only six products in the dashboard page
    Then user verifies the product count is six



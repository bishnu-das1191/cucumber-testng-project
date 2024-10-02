Feature: Verify the login feature of the application

  Background:
    Given user visits the portal

  Scenario Outline: User can login with invalid username and password
    When user inputs invalid "<username>" and "<password>"
    Then User can see error message

    Examples:
      | username | password |
      | admin    | 123      |
      | wrong    | pass123  |


#  @smoke
#  Scenario: User can login with sample check
#    Given user visits the portal

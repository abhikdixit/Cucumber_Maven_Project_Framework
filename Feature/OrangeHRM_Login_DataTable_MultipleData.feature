#Author: Abhinay Dixit
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
@smoke
Feature: To Test OrangeHRM Login functionality with multiple value

  Scenario Outline: Successful Login with multiple Valid Credentials
    #Scenario: Successful Login with Valid Credentials
    Given User is on OrangeHRM Home Page
    When User enters "<Username>" and "<Password>" for OrangeHRM
    And User click on Login button of OrangeHRM app
    Then User should be in Home page and Dashboard page should display
    Given User Click on Welcome User Link
    When User Click on Logout Link
    Then Login Page should display
    And Login button should display

    Examples: With Multiple Data
      | Username | Password |
      | Admin    | admin123 |
      | Admin    | admin123 |
      | Admin    | admin123 |
      | Admin    | admin123 |

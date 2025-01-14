#Author: Abhi
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
@E2E @smoke
Feature: To Test WebOrder Sign In and Sign-out Functionality
Description: This will cover valid scenario of WebOrder Loging app along with Logout functionality
  Scenario: Successful Login with Valid Credentials in WebOrder application
    Given User has Launched Chrome Browser
    When User Navigate to Sign In Page of WebOrder Application
    And User enters valid username and password in weborder login page
    And User Click on Login Button in from weborder login page
    Then User should be logged in and List of All Orders page should display

  Scenario: Successful LogOut from WebOrder Application
    When User click on Logout link from the home page
    Then user should be taken back to Login page.

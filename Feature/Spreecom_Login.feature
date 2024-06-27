#Author: Ragisha Shruthy
#Keywords Summary : SpreeCommerce
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
Feature: To Test SpreeCommerce Sign On Functionality

  @smoke @E2E
  Scenario: Successful Login with Valid Credentials in SpreeCommerce app
    Given User has Launched Browser
    When User Navigate to Login Page
    And User enters email and password
    And User Clicks on Login Button
    Then User should logged in and My Account page should display 
    And Logged in succesfully message should be displayed 
    And email id is displayed in Account info

    @smoke @E2E
  Scenario: Successful logout in SpreeCommerce app
    When User Clicks Logout Button
    Then User should Navigate to Login Page 
    And Signed out successfully message should be displayed 
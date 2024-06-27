#Author: Ragisha Shruthy
#Keywords Summary : SpreeCommerce
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
Feature: To Test SpreeCommerce Sign On Functionality

  @smoke @E2E
  Scenario Outline: Successful Login with Valid Credentials in SpreeCommerce app
    Given User has Launched Browser
    When User Navigate to Login Page
    And User enters "<email>" and "<password>" in spreecom
    And User Clicks on Login Button
    Then User should get proper "<ExpResult>" in spreecom

    
     Examples: With Multiple Data
      | email | password | ExpResult |
      | tdd@spree.com   | spree1234 | Invalid email or password.|
      | tdd1@spree.com   | spree123 | Invalid email or password.|
      | tdd@spree.com   |    | Invalid email or password.|
      |    | spree123 | Invalid email or password.|
      | api@spree.com | spree123| Logged in successfully |
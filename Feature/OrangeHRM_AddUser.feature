#Author: Abhinay Dixit
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
@smoke
Feature: To Test Orange HRM Add User Functionality

  Background: Successful Login with Valid Credentials in OrangeHRM app
    Given User has Launched Browser
    When User Navigate to Sign On Page
    And User enters username and password
    And User Click on Login Button
    Then User should logged in and Dashboard page should display
    Then User Should see Marketplace

  Scenario: Verify User is on Add User Page
    Given User Click on PIM Page
    When User Click on Admin tab
    And User Click on Add button
    Then User should be navigated to Add User page

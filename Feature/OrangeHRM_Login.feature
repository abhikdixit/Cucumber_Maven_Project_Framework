#Author: Abhinay Dixit
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
Feature: To Test Orange HRM Sign On and Sign Out Functionality

  @smoke @sanity
  Scenario: Successful Login with Valid Credentials in OrangeHRM app
    Given User has Launched Browser
    When User Navigate to Sign On Page
    And User enters username and password
    And User Click on Login Button
    Then User should logged in and Dashboard page should display
    Then User Should see Marketplace
	#@sanity
  Scenario: Successful Logout from OrangeHRM
    Given User Click on Welcome User Link
    When User Click on Logout Link
    Then Login Page should display
    And Login button should display
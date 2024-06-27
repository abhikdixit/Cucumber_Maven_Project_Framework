#Author: Abhi
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#@E2E @smoke
Feature: To Test nopcommerce Sign On and Sign-out Functionality

  #@smoke
  Scenario: Successful Login with Valid Credentials in nopcommerce App
    Given User has Launched Browser in nopcommerce
    When User Navigate to Admin area Sign On Page in nopcommerce
    And User enters email and password in nopcommerce
    And User Click on Login Button in nopcommerce
    Then User should logged in and Dashboard page should display nopcommerce

  Scenario: Successful LogOut from nopcommerce
    When User LogOut from the nopcommerce Application
    Then User should return back to Login page of nopcommerce
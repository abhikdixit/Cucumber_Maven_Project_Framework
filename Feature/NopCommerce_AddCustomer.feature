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
  Background: Successful Login with Valid Credentials in nopcommerce App
    Given User has Launched Browser in nopcommerce
    When User Navigate to Admin area Sign On Page in nopcommerce
    And User enters email and password in nopcommerce
    And User Click on Login Button in nopcommerce
    Then User should logged in and Dashboard page should display nopcommerce

 Scenario: Successful addition of new Customers NopCommerce
    Given User is at Dashboard page
    When User click on Right pane_Customers tab
    And  User click on Customers child tab
    Then User should be on Customer page
    When User click on Add New button
    Then User should be on Customer Info page
    When User enter the details like Email,FirstName,LastName,Gender and Company
    And Click on Save Button
    Then it should display "The new customer has been added successfully."
    And Added user should display in customer Web Table
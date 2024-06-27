#Author: Abhinay Dixit
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
Feature: To Test Google Search Fucntionality
@smoke
Scenario: Successful Search with Valid Input
	Given User is on Google Home Page
	When User Enter the keyword as "Playwright" in search box	
	And User click on Search Button
	Then Search result related to "Playwright: Fast and reliable end-to-end testing for modern ..." word should display
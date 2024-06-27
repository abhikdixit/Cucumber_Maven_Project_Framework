#Author: Abhinay Dixit
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
Feature: To GET Employee details of Chercher Tech API endpoints
#@sanity
Scenario: Successful GET request using Employee id
	Given User is on Chercher tech URI Home Page
	When User Enter the Emp id "ind"
	Then verify the name return from server
	And verify the description return from server
	And verify the price return from server
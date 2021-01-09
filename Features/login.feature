#Author
#Date
#Description
Feature: feature to test Login functionality
 
 	Scenario: check login is successful with valid credentials
 
 	Given user is on login page
  	When user enters username and password
  	And click on login button
  	Then user is navigated to the home page
	

Feature: This feature is for verify loging activity



Scenario: Verify user login
Given Open ecommerce "<URL>" application 
Then click account link
Then Enter user namd and password and click login
Then Verify user login sussecc

Feature: Create account of facebook8
As a user you need to open facebook login page and do the validation

Scenario: validate First name field
Given User need to be on facebook page
When User enters user first name
Then User checks user first name is present
Then close browser

Scenario: validate multiple fields for create user
Given User need to be on facebook page
When User enters user first name 
And user enters surname
Then User checks user first name is present
But user mobile field should be blank
Then close browser

Feature: Create account of facebook5
As a user you need to open facebook login page and do the validation

Scenario: validate First name field
Given User need to be on facebook page
When User enters user "David" first name
Then User checks user "David" first name is present

Scenario: validate multiple fields for create user
Given User need to be on facebook page
When User enters user "Ryan" first name 
And user enters "Roger" surname
Then User checks user "Ryan" first name is present
But user mobile field should be blank

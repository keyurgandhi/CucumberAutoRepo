Feature: Create account of facebook1
As a user you need to open facebook login page and do the validation

Background: common login steps
Given User need to be on facebook page

Scenario: validate First name field
When User enters user "David" first name
Then User checks user "David" first name is present
Then close browser

Scenario: validate multiple fields for create user
When User enters user "Ryan" first name 
And user enters "Roger" surname
Then User checks user "Ryan" first name is present
But user mobile field should be blank
Then close browser

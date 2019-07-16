Feature: Create account of facebook2
As a user you need to open facebook login page and do the validation



Scenario Outline: validate multiple fields for create user
Given User need to be on facebook page
When User enters user "<user>" first name 
And user enters "<surname>" surname
Then User checks user "<user>" first name is present
But user mobile field should be blank
Then close browser
Examples:
 | user    |surname |
 |Tom      |Jad     |
 |Tim      |Jid     |
 |key      |Jam     |

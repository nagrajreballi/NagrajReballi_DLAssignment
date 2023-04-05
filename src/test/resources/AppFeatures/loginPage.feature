Feature: Login page feature

Background:
Given user is on login page 


Scenario Outline: Login with Invalid username and valid password credentials
When user enters Invalid username <username>
And user enters valid password <password>
Then clicks on the login button for Invalid username 
Examples:
 |username|password|
 |standard_user123|secret_sauce|
 
 
Scenario Outline: Login with valid username and Invalid password credentials
When user enters valid username <username>
And user enters Invalid password <password>
Then user clicks on the login button for Invalid password
Examples:
 |username|password|
 |standard_user|secret_sauce123|

@sanity
Scenario Outline: Login with valid username and valid password credentials
When user enters valid userName for valid credentials <username>
And user enters valid passWord for valid credentials <password>
Then user clicks on the login button for valid credentials
Examples:
 |username|password|
 |standard_user|secret_sauce|

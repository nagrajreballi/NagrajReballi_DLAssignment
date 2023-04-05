Feature: Swag Labs HomePage Feature

Background:
Given user has already logged in to application
	|username|password|
 	|standard_user|secret_sauce|

@sanity
Scenario: Verify the page title
When user gets the title of home the page
Then home page title should be "Swag Labs"




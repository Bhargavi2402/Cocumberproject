Feature: Make my trip feature
Scenario Outline:: make my trip loginpage
	Given User is already login page
    When title of the login page is makemytrip
    Then user enters "<username>" and "<password>"
    And user clicks on login button
    Then user is on homepages
 Examples:
 	|username| password|
 	|9553524225|Bh@rgavi24$|
 	|9441818726|abc@123|


   
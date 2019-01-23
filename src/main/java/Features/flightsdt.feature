Feature: Flights booking
Scenario: Flights booking with values
Given User is already login page
    When title of the login page is makemytrip
    Then user enters credentials to login
    |9553524225|Bh@rgavi24$|
    And user clicks on login button
    
    And user enters from to and date 
    |Goa, India|Bangalore, India|FEBRUARY|10|
    And user clicks on search button

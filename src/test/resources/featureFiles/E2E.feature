Feature: Automate booking for Ryan Air

Scenario: User is on home page and selects the options
Given user is on homepage
When user clicks From
And user clicks To
And user selects from date
And user selects return date
And user selects number of passengers
And user accepts the terms and agreement
And user clicks on search button
Then user is navigated to flight selection page with Page Title as "Ryanair"
When user clicks on the first flight
And user clicks on the second flight
And user clicks on Continue with Basic Fare
And user accepts the basic fare on the pop up
And user clicks on Login Button
And verify if the Login window contains the String "Make it simple with myRyanair"
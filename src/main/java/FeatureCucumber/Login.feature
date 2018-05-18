Feature: MercuryTours Automate 
Scenario Outline: LogIn To The MercuryTours Application	
Given User Already in Log In Page
When title of the page is Welcome: Mercury Tours
Then Enter "<username>" and "<password>" and click on Login button

Examples:

	|username|password|Passenger|departingfrom|     
	|ShivarajR|Reset123|2|Acapulco|

Scenario Outline: Enter the passenger Details

Given User is on Find Flights Page
When User verified the title
Then Enyter "<Passenger>" and "<departingfrom>" 
Then Close the Browser

Examples:

	|username|password|Passenger|departingfrom|     
	|ShivarajR|Reset123|2|Acapulco|

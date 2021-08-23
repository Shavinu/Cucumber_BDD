Feature: Ebay Advanced Search Page 

@P24 
Scenario: Ebay Logo on Advanced Search Page 
	Given I am Ebay Advanced Search Page 
	When I click on Ebay logo 
	Then I am navigted to Ebay Home Page 
	
@P25 
Scenario: Advanced Search of an item 
	Given I am Ebay Advanced Search Page 
	When I advanced search an item 
		| keyword   | exclude      | min | max  |
		| iPhone 11 | refurblished | 300 | 1000 |
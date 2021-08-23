Feature: Ebay Home Page Scenarios

  @P1
  Scenario: Advanced Search Link
    Given I am on Ebay Home Page
    When I click on Advanced Link
    Then I navigate to Advanced Search Page

  @P2
  Scenario: Seach item count
    Given I am on Ebay Home Page
    When I search for 'iPhone 11'
    Then I validate that number of search results are more than 1000

  @P3
  Scenario: Seach item count
    Given I am on Ebay Home Page
    When I search for 'Macbook pro 2019'
    Then I validate that number of search results are more than 200

  @P4
  Scenario: Search for an item in category
    Given I am on the Ebay Home Page
    When I search for 'soap' in 'Baby' category

  @P5 @setCookies
  Scenario Outline: Home Page links
    Given I am on Ebay Home Pgae
    When I click on '<link>'
    Then I validate that page navigates to '<url>' and '<title>'

    Examples: 
      | link        | url                                                  | title                         |
      | Electronics | https://www.ebay.com/b/Electronics/bn_7000259124     | Electronics products for sale |
      | Sports      | https://www.ebay.com/b/Sporting-Goods/888/bn_1865031 | Sporting Goods for sale       |
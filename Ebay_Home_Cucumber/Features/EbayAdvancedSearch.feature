@tag
Feature: EBAY Advanced Search Page

  @p24
  Scenario: EBAY logo on Advanced Search Page 2
    Given I am on Ebay Advanced Search Page
    When I clickn Ebay logo
    Then Navigated Ebay Home Page

  @p300 @setCookies
  Scenario: Advanced Search Page an Item 6
    Given I am on Ebay Advanced Search Page
    When I advanced Search an Item
      | Keyword   | exclude     | min  | max  |
      | iphone 11 | refurbished | 2000 | 6000 |

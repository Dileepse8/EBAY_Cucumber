@tag
Feature: EBAY Advanced page link working

  @p1 @setCookies 
  Scenario: Advanced Search Link open 1
    Given I am on eBay Home Page
    When I click on Advanced Link
    Then I navigate toAdvanced Search Page

  @p2 @setCookies
  Scenario: Search Items Count 3
    Given I am on eBay Home Page
    When I search for 'iphone12'
    Then I validate atleast 100 search items present

  @p24 @p25
  Scenario: Search Items Count 4
    Given I am on eBay Home Page
    When I search for 'Toy cars'
    Then I validate atleast 10000 search items present

  @p2 @setCookies
  Scenario: Search Items Count 5
    Given I am on eBay Home Page
    When I search for 'soap' in 'baby' category
    Then I validate atleast 10 search items present

  @p500
  Scenario Outline: Home Page Links Search  7
    Given I am on eBay Home Page
    When I click on '<link>'
    Then I validate that Page navigates to '<url>' and title contains '<title>'

    Examples: 
      | link    | url                                                                                               | title       |
      | Motors  | https://www.ebay.com/sch/6028/i.html?_from=R40&_nkw=Auto+Parts+Accessories&_blrs=recall_filtering | eBay        |
      | Fashion | https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545                                | Accessories |
      | Sports  | https://www.ebay.com/b/Sporting-Goods/888/bn_1865031                                              | Sporting    |

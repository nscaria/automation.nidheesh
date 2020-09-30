@UserJourney @Search
Feature: Search a product
  AS A End user
  I WANT TO Search for a product
  SO THAT I could see the searched product

  Background:
    Given Customer is on a homepage

  @Smoke
  Scenario Outline: Search a product
    When  Customer search some "<products>" on search box
    And  Customer should see the searched "<products>"
    Then Customer could see  "<total>"number of product displayed

    Examples:
      | products | | total |
      | DRESSES  | | Showing 1 - 7 of 7 items  |

 @UserJourney @Basket
Feature: Filter products
  AS A End user
  I WANT TO Filter the product based on my preference
  SO THAT I could see my preferred product

  Background:
    Given Customer is on a homepage

  @Smoke
  Scenario Outline: Search a product
    When  Customer search some "<products>" on search box
    And   User chooses Faded Short Sleeve T-shirts from resultPage
    And   User add product to the basket
    Then  User should see product been added to the basket

    Examples:
      | products |  | products |
      | T-Shirt  |  | Faded Short Sleeve T-shirts |

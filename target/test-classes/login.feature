@UserJourney @Login
Feature: Validate login functionality of the application with valid credentials
  AS A End user
  I WANT TO login to my account
  SO THAT I can see my account information and browse

  Background:
    Given Customer is on a homepage

  @Smoke
  Scenario Outline:
    When  user navigates to sign in page
    And   User enter valid "<email address>" and valid "<password>"
    And   user sign
    Then  User navigates to my account page

    Examples:
      |  email address  |password|
      | ontest561@gmail.com | test123|

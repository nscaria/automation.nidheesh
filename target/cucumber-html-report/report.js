$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/basket.feature");
formatter.feature({
  "name": "Filter products",
  "description": "  AS A End user\n  I WANT TO Filter the product based on my preference\n  SO THAT I could see my preferred product",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@UserJourney"
    },
    {
      "name": "@Basket"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Search a product",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "Customer search some \"\u003cproducts\u003e\" on search box",
  "keyword": "When "
});
formatter.step({
  "name": "User chooses Faded Short Sleeve T-shirts from resultPage",
  "keyword": "And "
});
formatter.step({
  "name": "User add product to the basket",
  "keyword": "And "
});
formatter.step({
  "name": "User should see product been added to the basket",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "products",
        "",
        "products"
      ]
    },
    {
      "cells": [
        "T-Shirt",
        "",
        "Faded Short Sleeve T-shirts"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Customer is on a homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "cucumberSteps.LoginStepDefs.customerIsOnAHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search a product",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@UserJourney"
    },
    {
      "name": "@Basket"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "Customer search some \"T-Shirt\" on search box",
  "keyword": "When "
});
formatter.match({
  "location": "cucumberSteps.SearchStepDefs.customerSearchSomeOnSearchBox(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User chooses Faded Short Sleeve T-shirts from resultPage",
  "keyword": "And "
});
formatter.match({
  "location": "cucumberSteps.BasketStepDefs.userChoosesFadedShortSleeveTShirtsFromResultPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User add product to the basket",
  "keyword": "And "
});
formatter.match({
  "location": "cucumberSteps.BasketStepDefs.userAddProductToTheBasket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see product been added to the basket",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumberSteps.BasketStepDefs.userShouldSeeProductBeenAddedToTheBasket()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/login.feature");
formatter.feature({
  "name": "Validate login functionality of the application with valid credentials",
  "description": "  AS A End user\n  I WANT TO login to my account\n  SO THAT I can see my account information and browse",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@UserJourney"
    },
    {
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "user navigates to sign in page",
  "keyword": "When "
});
formatter.step({
  "name": "User enter valid \"\u003cemail address\u003e\" and valid \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user sign",
  "keyword": "And "
});
formatter.step({
  "name": "User navigates to my account page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email address",
        "password"
      ]
    },
    {
      "cells": [
        "ontest561@gmail.com",
        "test123"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Customer is on a homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "cucumberSteps.LoginStepDefs.customerIsOnAHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@UserJourney"
    },
    {
      "name": "@Login"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "user navigates to sign in page",
  "keyword": "When "
});
formatter.match({
  "location": "cucumberSteps.LoginStepDefs.userNavigatesToSignInPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter valid \"ontest561@gmail.com\" and valid \"test123\"",
  "keyword": "And "
});
formatter.match({
  "location": "cucumberSteps.LoginStepDefs.userEnterValidAndValid(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sign",
  "keyword": "And "
});
formatter.match({
  "location": "cucumberSteps.LoginStepDefs.userSign()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to my account page",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumberSteps.LoginStepDefs.userNavigatesToMyAccountPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/search.feature");
formatter.feature({
  "name": "Search a product",
  "description": "  AS A End user\n  I WANT TO Search for a product\n  SO THAT I could see the searched product",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@UserJourney"
    },
    {
      "name": "@Search"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Search a product",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "Customer search some \"\u003cproducts\u003e\" on search box",
  "keyword": "When "
});
formatter.step({
  "name": "Customer should see the searched \"\u003cproducts\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Customer could see  \"\u003ctotal\u003e\"number of product displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "products",
        "",
        "total"
      ]
    },
    {
      "cells": [
        "DRESSES",
        "",
        "Showing 1 - 7 of 7 items"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Customer is on a homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "cucumberSteps.LoginStepDefs.customerIsOnAHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search a product",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@UserJourney"
    },
    {
      "name": "@Search"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "Customer search some \"DRESSES\" on search box",
  "keyword": "When "
});
formatter.match({
  "location": "cucumberSteps.SearchStepDefs.customerSearchSomeOnSearchBox(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Customer should see the searched \"DRESSES\"",
  "keyword": "And "
});
formatter.match({
  "location": "cucumberSteps.SearchStepDefs.customerShouldSeeTheSearched(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Customer could see  \"Showing 1 - 7 of 7 items\"number of product displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumberSteps.SearchStepDefs.customerCouldSeeNumberOfProductDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
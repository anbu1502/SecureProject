$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/login.feature");
formatter.feature({
  "name": "Verify the Flipkart page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user should in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_should_in_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify the add and remove products",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@positive"
    }
  ]
});
formatter.step({
  "name": "user should login \"9488381520\" and \"g1r9b6617\" then verify is \"Anbu\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_should_login_and_then_verify_is(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should search electronics and select inverter AC",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_should_search_electronics_and_select_inverter_AC()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should add product to cart",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_should_add_product_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should add one more quatity then print discount and price",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_should_add_one_more_quatity_then_print_discount_and_price()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should print total price",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_should_print_total_price()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should navigate to myCart page and the remove products then verify",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_navigate_to_myCart_page_and_the_remove_products_then_verify()"
});
formatter.result({
  "status": "passed"
});
});
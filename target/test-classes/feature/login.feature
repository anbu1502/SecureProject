Feature: Verify the Flipkart page

  Background: 
    Given user should in login page

  @positive
  Scenario: Verify the add and remove products
    When user should login "9488381520" and "g1r9b6617" then verify is "Anbu"
    And user should search electronics and select inverter AC
    When user should add product to cart
    And user should add one more quatity then print discount and price
    And user should print total price
    Then user should navigate to myCart page and the remove products then verify

  @negative @invalidUser
  Scenario: Verify with invalid userName details in login
    When user should verify with invaild userName "948834152" and "g1r9b6617"
    Then verify "Please enter valid Email ID/Mobile number" message is displayed

  @negative @verifyPassword
  Scenario: Verify with invalid password details in login
    When user should verify with invaild password"9488381520" and "g1r9" 
    Then User should verify not to login"Your username or password is incorrect"

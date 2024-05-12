Feature: Verifying of landing page

  Background: 
    Given user opens a browser
    When Usr launch an url
@smoke
  Scenario: Check  user is able to acces the Homepage of the demoblaze
    Then User should observe the page title
@smoke
  Scenario: User is able to click on aproduct
    And Click on a product
    Then user should naviagte to respective product
@smoke
  Scenario: Check the contents displaying under catgeory section
    Then user should display with below contents
      | Phones | Laptops | Monitors |
@regression
  Scenario Outline: 
    When usr click on login link
    Then User eneter "<username> " and "<password>" and click on login button
    Then use should verify logged successfully

    Examples: 
      | username | password |
      | demo     | demo     |
      | demo12   | demo     |
      | demo     |      123 |

Feature: Verify the Myntra Homepage

  Background: 
    Given user launches browser
    When enter url

  @smoke
  Scenario: Check user is able to open screen
    Then observe the contents

  @smoke
  Scenario: Check the links displaying in the home page
    Then observe the contents displaying in the header
      | Best Sellers | Mobiles | Customer Service | Books | Electronics | Prime | Fashion | New Releases |

  @regression
  Scenario Outline: verify user is able to search a product
    And enter a <product> and click on search
    Then respective should display

    Examples: 
      | product  |
      | 'iphone' |
      | 'oppo'   |
      | 'motto'  |

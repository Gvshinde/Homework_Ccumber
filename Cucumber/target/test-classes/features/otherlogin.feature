@OtherLoginFeature @Regression
Feature: Other Codefios login functionality Validation(Negative Scenarios)

  @OtherLoginScenario1
  Scenario Outline: User should not be able to login with invalid credential(other)
    Given User is on the codefios login page
    When User Enters username "<username>"
    When User enters password "<password>"
    When User clicks on signin button
    Then User should land on dashboard page

    Examples: 
      | username           | password |
      | demo2@codefios.com | abc123   |
      | demo@codefios.com  | abc124   |
      | demo3@codefios.com | abc124   |
      |                    |          |

  
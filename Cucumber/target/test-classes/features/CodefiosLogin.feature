
@LoginFeature @Regression
Feature: Codefios login functionality VAlidation

  Background:
    Given User is on the codefios login page
    When User Enters username "demo@codefios.com"
  @LoginScenario1 @smoke
  Scenario: User should be able to login with valid credential
    When User enters password "abc123"
    When User clicks on signin button
    Then User should land on dashboard page

  @LoginScenario2
  Scenario: User should not be able to login with invalid credential
    When User enters password "abc124"
    When User clicks on signin button
    Then User should land on dashboard page



Feature: Open Tekshool page and navigate to test environment and check for test environment title

  @Test
  Scenario: Check for test environment title
    When User Open tekschool of America website
    And User click on test environment link
    Then User should see Test environment webpage
 
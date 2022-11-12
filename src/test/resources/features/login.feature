@test
Feature: As a user, I should be able to log in
 Scenario Outline: Verify login with valid Credentials

    Given user on the log in
    When user use username "<username>" and passcode "<passcode>" one
    And user click the log in button
    Then Verify the user should be at the dashboard page

    Examples:
      | username | passcode    |
      | user7    | Userpass123 |
      | user34   | Userpass123 |
      | user99   | Userpass123 |
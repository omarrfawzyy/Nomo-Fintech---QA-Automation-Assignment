@Regression
Feature: Login

  Scenario: Verify that app is login successfully
    Given User opens Application
    Then User Clicks on menu
    Then User Clicks on login
    Then User Enters username
    And User Enters no password
    Then User Clicks on login button
    Then Verify that no password error message
    And User Enters no user details
    Then User Clicks on login button
    Then Verify that no username error message
    And User Enters no match details
    Then User Clicks on login button
    Then Verify that no match error message
    And User Enters locked user
    Then User Clicks on login button
    Then Verify that locked error message
    Then User Enters username
    And User Enters password
    Then User Clicks on login button
    Then Verify that login successfully


@login
Feature: facebook loghin feature test

  Scenario Outline: user able to login with vlaid information
    Given user on facebook homepage
    When user enter "<email>"
    And user enter "<password>" in box
    And user click on login
    Then user login successfully

    Examples: 
      | email      | password |
      | 3473348094 | MDra4788 |

Feature: My Account

  Background:
    Given The user is placed in the practice page

  Scenario Outline: My Accounts Log out
    When Click on My Account Menu
    And Enter the username <username> and password <password> in the text boxes
    And Click on login button
    And Click on Logout button
    Then User successfully comes out from the site and returns to login page
    Examples:
      | username          | password    |
      | estefania.cabrera | Crowdar2022 |



  Scenario Outline: My Accounts Adress Functionality
    When Click on My Account Menu
    And Enter the username <username> and password <password> in the text boxes
    And Click on login button
    And Click on Address link
    Then User must view billing address and ship address
    Examples:
      | username          | password    |
      | estefania.cabrera | Crowdar2022 |
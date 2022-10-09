@Estefi
Feature: Log In

  Background:
    Given The user is placed in the practice page


  Scenario Outline: Log-in with valid username and password
    When Click on My Account Menu
    And Enter the username <username> and password <password> in the text boxes
    And Click on login button
    Then User must successfully login to the web page

    Examples:
      | username          | password    |
      | estefania.cabrera | Crowdar2022 |

  Scenario Outline: Log-in Errors
    When Click on My Account Menu
    And Enter the username <username> and password <password> in the text boxes
    And Click on login button
    Then Proper error <mensaje> must be displayed and prompt to enter login again

    Examples:
      | username                            | password    | mensaje                                                   |
      |                                     | Crowdar2022 | Error: Username is required.                              |
      | estefania@crowdaronline.com         | Crowdar2022 | Error: A user could not be found with this email address. |
      | estefania.cabrera@crowdaronline.com |             | Error: Password is required.                              |


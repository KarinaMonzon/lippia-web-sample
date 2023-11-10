@Login
Feature: login

  Background:
    Given The client is in practice

  @LoginSensitive
  Scenario Outline:Login handles
    Given The client click on My Account
    When The client logs in with <username> and <password> changed
    Then The client must visualize a warning <message>

    Examples:
      | username                  | password          | message                                           |
      | carolinalopez02@gmail.com | Carolingian2024!! | A user could not be found with this email address |

  @loginAuthentication
  Scenario Outline: Login Authentication
    Given The client click on My Account
    When The client logs in with <username> and <password> changed
    And The client logged in and is heading to another tab
    Then The client presses the back button should not log in then he can view the general page

    Examples:
      | username                   | password         |
      | carolinalopez021@gmail.com | MarSolLuna1234!! |

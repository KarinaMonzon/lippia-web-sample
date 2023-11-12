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
      | username                   | password            | message                                           |
      | CaRoLiNaLoPeZ021@gmail.com | CarolINALopEZ2024!! | The password you entered for the username CaRoLiNaLoPeZ021@gmail.com is incorrect |

  @loginAuthentication
  Scenario Outline: Login Authentication
    Given The client click on My Account
    When The client logs in with <username> and <password> changed
    And The client logged in and is heading to another tab web site
    And The client presses the back button should not log in
    Then The client view the general page

    Examples:
      | username                   | password         |
      | carolinalopez021@gmail.com | MarSolLuna1234!! |

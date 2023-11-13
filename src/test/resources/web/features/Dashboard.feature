@Dashboard
Feature: Dashboard

  Background:
    Given The client is in practice

  @Details @Academy
  Scenario Outline: View and update account details
    Given The client click on My Account
    When The client logs in with <user> and <pass> valid
    And  The client successfully login to the web page
    And The client click on "Account details"
    Then the client can view account details where he can change his password also
    Examples:
      | user                       | pass             |
      | carolinalopez021@gmail.com | MarSolLuna1234!! |

  @Logout
  Scenario Outline: Logs out successfully
    Given The client click on My Account
    When The client logs in with <user> and <pass> valid
    And The client successfully login to the web page
    And The client clicked on "Logout"
    Then The client successfully to logout the web page
    Examples:
      | user                       | pass             |
      | carolinalopez021@gmail.com | MarSolLuna1234!! |



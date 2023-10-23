@Login
Feature: login
  Background:
    Given the client is in practice

  @loginValid
  Scenario Outline: Login with valid credentials
    Given the client click on My Account menu
    When the client logs in with <username> and <password> valid credentials
    Then the client is successfully logged in to the website

    Examples:
      | username                 | password        |
      | mariacSoto1234@gmail.com | MariaSoto1234!! |

  @loginIncorrect
  Scenario Outline: Login with invalid credentials
    Given the client click on My Account menu
    When the client logs in with  <username> and <password> invalid credentials
    Then the client must visualize <message> and will be prompted to enter again
    Examples:
      | username                 | password        | message                                           |
      | mariacsoto@gmail.com     | mariasoto1234   | A user could not be found with this email address |
      | mariacSoto1234@gmail.com |                 | Password is required                              |
      |                          | MariaSoto1234!! | Username is required                              |
      |                          |                 | Username is required                              |

  @RegisterValid
  Scenario Outline: Registration with valid credentials
    Given the client click on My Account menu
    When the client registered <email> and <pass> correct
    Then the client is successfully logged in to the website

    Examples:
      | email                     | pass              |
      | carolinalopez02@gmail.com | Carolingian2024!! |

  @registerInvalid
  Scenario Outline: Registration with invalid credentials
    Given the client click on My Account menu
    When the client registered <email> and <password> incorrect
    Then  the client must visualize a warning <message>

    Examples:
      | email                       | password            | message                              |
      | carolinalopez1@gmail        | Carolinalopez2024!! | Please provide a valid email address |
      |                             | Carolinalopez2024!! | Please provide a valid email address |
      | carolinalopez2024@gmail.com |                     | Please enter an account password     |
      |                             |                     | Please provide a valid email address |
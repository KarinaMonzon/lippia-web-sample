@Register
Feature: Register invalid

  Background:
    Given The client is in practice

  @RegisterInvalid
  Scenario Outline: Registration with invalid credentials
    Given  The client click on My Account
    When The client registered <email> and <password> incorrect
    Then The client must visualize a warning <message>
    Examples:
      | email                       | password | message                              |
      | carolinalopez2024@gmail.com |          | Please enter an account password     |
      |                             |          | Please provide a valid email address |
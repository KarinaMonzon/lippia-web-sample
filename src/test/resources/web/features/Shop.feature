
Feature: Shop

  Background:
    Given the client is in practice

  @Filter
  Scenario: verify filter by price
    Given the client tap on Shop menu
    Then the client see Filter By Price

  @Price
  Scenario: verify this particular product
    Given the client tap on Shop menu
    When the client click any of the product available in the product category
    Then the client can view only see particular product

  @Desplega
  Scenario Outline: verify default sorting dropdown
    Given the client tap on Shop menu
    When the user click <Default Sorting>
    Then the user can views the <Default Sorting> only

    Examples:
      | Default Sorting |
      | popularity      |











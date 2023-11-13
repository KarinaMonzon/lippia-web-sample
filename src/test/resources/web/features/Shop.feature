@Shop
Feature: Shop
  Background:
    Given The client is in practice

  Scenario: Complete Purchase Process with Place Order
    Given The client click on Shop menu
    When The client add any of the product available
    And The client link to go payment page
    And The client now click on "PROCEED TO CHECKOUT" aot payment
    And The client enter <FirstName>, <LastName>, <Company>, <Email>, <Phone>, <Country>, <Address>, <State>, <City>, <PostCode> and can choose any means of payment
    Then The client on clicking "Place order" and navigate to the order confirmation pag


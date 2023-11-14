@Coupon
Feature: Home

  Background:
    Given The client is in practice
    When The client click on the image in the arrivals

  @CheckCoupon
  Scenario: Add to basket check apply coupon
    Given The client adds the book to your basket
    When The client click on "VIEW BASKET" check item with price
    And The client now click on "PROCEED TO CHECKOUT" aot payment
    Then The client has the feasibility to add coupon in the payment and see additional details

  @PlaceOrder
  Scenario Outline: Performs a purchase in the online of a book
    Given The client adds the book to your basket
    When The client click on "VIEW BASKET" check item with price
    And  The client now click on "PROCEED TO CHECKOUT" aot payment
    And  The client enter <FirstName>, <LastName>, <Company>, <Email>, <Phone>, <Country>, <Address>, <State>, <City>, <PostCode> and can choose any means of payment
    Then  The client on clicking "Place order" and navigate to the order confirmation pag

    Examples:
      | FirstName | LastName | Company | Email                   | Phone      | Country   | Address     | State   | City    | PostCode |
      | Karina    | Monzon   | Academy | karinamon1849@gmail.com | 2616666917 | Argentina | Antonio 151 | Mendoza | Mendoza | 5501     |



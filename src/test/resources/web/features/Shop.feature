@Shop
Feature: Shop

  Background:
    Given The client is in practice

  @CouponOptionShop
  Scenario: Coupon option
    Given The client click on Shop menu
    When The client add any of the product available
    And The client clicked in link "ShoppingCart" to go payment page
    And The client now click on "PROCEED TO CHECKOUT" aot payment
    Then The client has the feasibility to add coupon in the payment and see additional details

  @PlaceOrderShop @Academy
  Scenario Outline: Complete Purchase Process with Place Order
    Given The client click on Shop menu
    When The client add any of the product available
    And  The client clicked in link "ShoppingCart" to go payment page
    And The client now click on "PROCEED TO CHECKOUT" aot payment
    And The client enter <FirstName>, <LastName>, <Company>, <Email>, <Phone>, <Country>, <Address>, <State>, <City>, <PostCode> and can choose any means of payment
    Then The client on clicking "Place order" and navigate to the order confirmation pag

    Examples:
      | FirstName | LastName | Company | Email                   | Phone      | Country   | Address     | State   | City    | PostCode |
      | Karina    | Monzon   | Academy | karinamon1849@gmail.com | 2616666917 | Argentina | Antonio 151 | Mendoza | Mendoza | 5501     |


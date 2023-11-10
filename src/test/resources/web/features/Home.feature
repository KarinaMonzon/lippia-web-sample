@Coupon
Feature: Home

  Background:
    Given The client is in practice
    When The client click on the image in the arrivals

  @CheckCoupon @Academy
  Scenario: Add to basket check apply coupon
    Given The client adds the book to your basket
    When The client click on "VIEW BASKET" and now click on "PROCEED TO CHECKOUT"
    Then The client has the feasibility to add coupon in the payment and see additional details

  @PlaceOrder
  Scenario: Pay with a payment method and place order
    Given The client adds the book to your basket
    When The client click on "VIEW BASKET" and now click on "PROCEED TO CHECKOUT"
    And The client can fill his details and can choose any means of payment
    Then  The client on clicking "Place order" and navigate to the order confirmation pag

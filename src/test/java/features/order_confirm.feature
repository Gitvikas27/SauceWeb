Feature: Order Confirmation in Sauce Demo Website

  Scenario: User places an order successfully
    Given the user is on the Sauce Demo login page
    When the user logs in with valid credentials
    And the user adds a product to the cart
    And the user navigates to the cart page
    And the user proceeds to checkout
    And the user enters personal information
    | First Name | Last Name | Zip Code |
    | John       | Doe       | 12345    |
    And the user confirms the order
    Then the user should see the order confirmation message
    
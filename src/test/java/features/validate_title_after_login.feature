Feature: Validate App Title after Login

  Scenario: Validate the App Title after successful login
    Given the user is on the Sauce Demo login page
    When the user logs in with valid credentials
    Then the user should see the page title as "Swag Labs"
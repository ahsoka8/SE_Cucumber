@regression
Feature: Negative Login Test
@negativeLogin
  Scenario Outline: negative login tests
    Given The user is on the login page
    When The user logs in with using credentials "<invalidUserEmail>" and "<invalidPassword>"
    Then Verify that warning message is "<message>"
    Examples:
      | invalidUserEmail | invalidPassword  | message                                  |
      | invalidEmail     | Mg12345678       | Email address is incorrect. Please check |
      | mgezer@gmail.com | invalidPassword  | Password is incorrect. Please check      |
      |                  | mgezer@gmail.com | Please enter your email.                 |
      | mgezer@gmail.com |                  | Please enter your password!              |
      |                  |                  | Please enter your email.                 |



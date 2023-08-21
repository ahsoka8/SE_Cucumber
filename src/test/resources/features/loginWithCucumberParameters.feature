@regression
Feature: Login Tests with cucumber parameters

  Background:
    Given The user is on the login page

  @rerun
  Scenario: Login as Leia Organa- Cucumber Parameters
   # Given The user is on the login page
    When The user logs in with using credentials "leia@gmail.com" and "Leia123456"
    Then The user should be able to login
    And Verify that username "leia" is displayed on dashboard page

  @wip @number
  Scenario: Login as Mike- Cucumber Parameters
  #  Given The user is on the login page
    When The user logs in with using credentials "mike@gmail.com" and "mike1234"
    Then The user should be able to login
    And Verify that username "mike" is displayed on dashboard page
    And The number is 5
    And The number also is 5.5
    And The number can be 2.1
# class task
  #login as Rosa with cucumber parameters

  @wip @c_maven_2
  Scenario: Login as Rosa- Cucumber Parameters
   # Given The user is on the login page
    When The user logs in with using credentials "rosa@test.com" and "Test123456"
    Then The user should be able to login
    And Verify that username "Rosa" is displayed on dashboard page

  @c_maven
  Scenario: Login with list
    When The user logins with following credentials
      | leia@gmail.com |
      | Leia123456     |
    Then The user should be able to login

    @dnm @rerun
  Scenario Outline: Login with list DDF
    When The user logins with following credentials
      | <userEmail> |
      | <password>  |
    Then The user should be able to login
    Examples:
      | userEmail | password |
      | rosa@test.com | Test123456 |
      | mike@gmail.com | mike1234 |
      | leia@gmail.com | Leia123456 |
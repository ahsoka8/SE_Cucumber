Feature: Login Functionality
  # user story = feature
  # test case = scenario
  # test steps = Given, When, Then etc..Feature:

#  Background:
#    Given The user is on the login page

  Scenario: Login as Leia Organa
    Given The user is on the login page
    When The user enters Leia's credentials
    Then The user should be able to login

  Scenario: Login as HanSolo
    Given The user is on the login page
    When The user enters HanSolo's credentials
    Then The user should be able to login

    # class task :
  # new scenario: Login as Rosa
  Scenario: Login as Rosa
    Given The user is on the login page
    When The user enters Rosa's credentials
    Then The user should be able to login

  Scenario: Login as Obiwan
    Given The user is on the login page
    When The user enters Obiwan's email
    And The user enters Obiwans's password
    And The user clicks on login button
    Then The user should be able to login
    And The user should be able to see own username
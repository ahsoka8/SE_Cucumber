@regression
Feature: Login Functionality
  # user story = feature
  # test case = scenario
  # test steps = Given, When, Then etc..Feature:

#  Background:
#    Given The user is on the login page
  @Leia @Login
  Scenario: Login as Leia Organa
    Given The user is on the login page
    When The user enters Leia's credentials
    Then The user should be able to login

  @HanSolo @Login
  Scenario: Login as HanSolo
    Given The user is on the login page
    When The user enters HanSolo's credentials
    Then The user should be able to login

    # class task :
  # new scenario: Login as Rosa
  @Rosa @Login @database
  Scenario: Login as Rosa
    Given The user is on the login page
    When The user enters Rosa's credentials
    Then The user should be able to login


  @John @Login @Smoke
  Scenario: Login as John
    Given The user is on the login page
    When The user enters John's credentials
    Then The user should be able to login
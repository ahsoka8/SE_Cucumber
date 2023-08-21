@regression
Feature: Edit profile page

  @editProfile
  Scenario Outline: edit profile page
    Given The user is on the login page
    When The user logs in with using credentials "<userEmail>" and "<password>"
    And The user navigates to "<name>" and "<menu>"
    And The user navigates to "<submenu>"
    And The user adds "about" "<about>"
    And The user adds "company" "<company>"
    And The user selects "<job>" from the menu
    And The user adds "website" "<website>"
    And The user adds "location" "<location>"
    And The user adds "skills" "<skills>"
    And The user clicks on save changes button
    Examples:
      | userEmail      | password | name | menu       | submenu      | about               | company   | job              | website          | location | skills        |
      | mike@gmail.com | mike1234 | mike | My Profile | Edit Profile | graduated SDET 2023 | Krafttech | QA Test Engineer | www.kraftech.com | Istanbul | Selenium,Java |

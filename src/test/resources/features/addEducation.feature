@regression
Feature: Add Education Tests

  @c_education @rerun
  Scenario: Check Add Education Form Labels
    Given The user is on the login page
    When The user logs in with using credentials "leia@gmail.com" and "Leia123456"
    Then The user should be able to login
    When The user navigates to "leia" and "My Profile"
    When The user navigates to "Add Education"
    Then The user should be able to see following form Labels
      | School or Bootcamp *    |
      | Degree or Certificate * |
      | Study                   |
      | From Date               |
      | To Date                 |
      | Program Description     |

  @c_addEducation @rerun
  Scenario Outline: Adding new education record to <accountName>
    Given The user is on the login page
    When The user logs in with using credentials "<email>" and "<password>"
    And The user navigates to "<accountName>" and "<menu>"
    And The user navigates to "<subMenu>"
    And The user fills the form with: "<school>", "<degree>", "<study>", "<fromDate>", "<toDate>" and "<description>"
    Then The user should be able to see last added education record with "<school>"
    Then The user should be able to delete last added record with "<school>"
    Examples:
      | email          | password   | accountName | menu       | subMenu       | school    | degree | study       | fromDate | toDate   | description |
      | leia@gmail.com | Leia123456 | leia        | My Profile | Add Education | Cambridge | first  | engineering | 11051998 | 23022003 | intensive   |
      | mike@gmail.com | mike1234   | mike        | My Profile | Add Education | Stanford  | first  | informatik  | 11051999 | 23022002 | online      |


  @c_education_2
  Scenario: Check Add Education Form Labels
    Given The user is on the login page
    When The user logs in with using credentials "leia@gmail.com" and "Leia123456"
    Then The user should be able to login
    When The user navigates to "leia" and "My Profile"
    When The user navigates to "Add Education"
    Then The user should be able to see following form labels second version
      | School or Bootcamp *    |
      | Degree or Certificate * |
      | Study                   |
      | From Date               |
      |                         |
      | To Date                 |
      | Program Description     |
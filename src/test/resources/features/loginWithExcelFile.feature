Feature: Login test with excel file

  @wip
  Scenario Outline: Login Test-1
    Given The user is on the login page
    When The user logins with using excel file:"<path>", "<sheetName>" and <rowNumber>
    Then The user should be able to login
    Examples:
      | path                              | sheetName | rowNumber |
      | src/test/resources/LoginList.xlsx | QaTeam1   | 1         |
      | src/test/resources/LoginList.xlsx | QaTeam4   | 0         |
      | src/test/resources/LoginList.xlsx | QaTeam3   | 5         |
      | src/test/resources/LoginList.xlsx | QaTeam2   | 2         |
      | src/test/resources/LoginList.xlsx | QaTeam2   | 4         |
      | src/test/resources/LoginList.xlsx | QaTeam4   | 5         |


  @wip
  Scenario Outline: Login Test-2
    Given The user is on the login page
    When The user logins with "Your Email"  and "Password" using excel file:"<path>", "<sheetName>" and <rowNumber>
    Then The user should be able to login
    And The user verifies success login with "Your Name" using excel file:"<path>", "<sheetName>" and <rowNumber>
    Examples:
      | path                              | sheetName | rowNumber |
      | src/test/resources/LoginList.xlsx | QaTeam1   | 1         |
      | src/test/resources/LoginList.xlsx | QaTeam2   | 0         |
      | src/test/resources/LoginList.xlsx | QaTeam3   | 5         |
      | src/test/resources/LoginList.xlsx | QaTeam4   | 2         |
      | src/test/resources/LoginList.xlsx | QaTeam2   | 4         |
      | src/test/resources/LoginList.xlsx | QaTeam3   | 0         |

      #Task:
      # excel dosyasi kullnilarak add education yapilsin.
      # excel dosyasi kullanilarak eklenen education record verify edilsin.
      # excel dosyasi kullanilarak eklenen education record silinsin.
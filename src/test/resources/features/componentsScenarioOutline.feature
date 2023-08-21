Feature: Components Title Test

  @title
  Scenario Outline: Title checks
    Given The user is on the login page
    When The user logs in with using credentials "leia@gmail.com" and "Leia123456"
    And The user navigates to "<tab>" and "<module>"
    Then Verify that "<title1>","<title2>" and "<title3>"
    Examples:
      | tab        | module | title1 | title2     | title3 |
      | Components | Alerts | Home   | Components | Alerts |
      | Forms      | Input  | Home   | Forms      | Input  |
      | JavaScript | Clicks | Home   | JavaScript | Clicks |


     #
     # | Components | Accordion    | Home   | Components | Accordion |
    #  | Components | Carousel     | Home   | Components | Carousel  |
     # | Components | List Group   | Home   | Components | Listgroup |
    #  | Components | Modal        | Home   | Components | Modal     |
     # | Components | Tabs         | Home   | Components | Tabs      |
     # | Components | Tooltips     | Home   | Components | Tooltips  |
     # | Components | Charts       | Home   | Components | Charts    |
    #  | Components | Iframe       | Home   | Components | Iframe    |
     # | Components | Open New Tab | Home   | Components | Opennew   |
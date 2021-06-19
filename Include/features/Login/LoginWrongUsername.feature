Feature: Login Success

  Scenario Outline: User success login
    Given User navigate to landing page
    When User click login button on landing page
    And User input username <username>
    And User input password <password>
    And User click login button
    Then Show warning notification wrong username or password
    And Close Browser

    Examples: 
      | username      | password                 |
      | isma_test 		| FDqfYzPLXJcK+FVpIAfpJg== |

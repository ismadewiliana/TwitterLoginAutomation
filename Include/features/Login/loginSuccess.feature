Feature: Login Success

  Scenario Outline: User success login
    Given User navigate to landing page
    When User click login button on landing page
    And User input username <username>
    And User input password <password>
    And User click login button
    Then User navigate to home page
    And Close Browser

    Examples: 
      | username      | password                 |
      | isma_testing 	| FDqfYzPLXJcK+FVpIAfpJg== |

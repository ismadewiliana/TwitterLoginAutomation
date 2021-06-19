Feature: Login Success

  Scenario Outline: User success login
    Given User navigate to landing page
    When User click login button on landing page
    And User input username <username>
    Then Login button not active
    And Close Browser

    Examples: 
      | username      | password                 |
      | isma_testing 	| FDqfYzPLXJcK+FVpIAfpJg== |

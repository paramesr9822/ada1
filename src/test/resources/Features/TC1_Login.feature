@Login
Feature: Verifying Adactin Hotel login details.

  Scenario Outline: Verifying Adactin Hotel Login valid
    Given User is on the Adactin page
    When User should perform login "<username>" , "<password>"
    Then User should verify after login success message "Hello paramesr2020!"

    Examples: 
      | username     | password     |
      | paramesr2020 | p@r@mesr2020 |

  @Two @E2E
  Scenario Outline: Verifying Adactin Hotel login using Enter
    Given User is on the Adactin page
    When User should perform login "<username>","<password>" with Enter key
    Then User should verify after login success message "Hello paramesr2020!"

    Examples: 
      | username     | password     |
      | paramesr2020 | p@r@mesr2020 |

  Scenario Outline: Verifying Adactin Hotel Login Invalid Credentials
    Given User is on the Adactin page
    When User should perform login "<username>","<password>" with Enter key
    Then User should verify after login with Invalid Credential error message contains "Invalid Login details or Your Password might have expired"

    Examples: 
      | username     | password     |
      | paramesr1992 | p@r@mesr1992 |

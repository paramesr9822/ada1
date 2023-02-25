@SelectHotel
Feature: Verifying Adactin select hotel details

  Scenario Outline: Verifying Adactin select hotel page with select
    Given User is on the Adactin page
    When User should perform login "<username>" , "<password>"
    Then User should verify after login success message "Hello paramesr2020!"
    When User needs to search hotel using "<location>","<hotels>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should navigate to select hotel and verify the success message "Select Hotel"
    And User should Click the radiobtn and continue
    Then User should verify after click continue success message "Book A Hotel"

    Examples: 
      | username     | password     | location  | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | paramesr2020 | p@r@mesr2020 | Melbourne | Hotel Creek | Standard | 2 - Two   | 02/12/2022  | 03/12/2022   | 3 - Three     | 1 - One         |

  Scenario Outline: Verifying Adactin select hotel page without select
    Given User is on the Adactin page
    When User should perform login "<username>" , "<password>"
    Then User should verify after login success message "Hello paramesr2020!"
    When User needs to search hotel using "<location>","<hotels>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should navigate to select hotel and verify the success message "Select Hotel"
    And User should Click the continue
    Then User should verify after click continue error message "Please Select a Hotel"

    Examples: 
      | username     | password     | location  | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | paramesr2020 | p@r@mesr2020 | Melbourne | Hotel Creek | Standard | 2 - Two   | 02/12/2022  | 03/12/2022   | 3 - Three     | 1 - One         |

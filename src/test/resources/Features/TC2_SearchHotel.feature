@SearchHotel
Feature: Verifying Adactin search hotel details

  Scenario Outline: Verifying Adactin search hotel page with all fields to navigate to select page
    Given User is on the Adactin page
    When User should perform login "<username>" , "<password>"
    Then User should verify after login success message "Hello paramesr2020!"
    When User needs to search hotel using "<location>","<hotels>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should navigate to select hotel and verify the success message "Select Hotel"

    Examples: 
      | username     | password     | location  | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | paramesr2020 | p@r@mesr2020 | Melbourne | Hotel Creek | Standard | 2 - Two   | 02/12/2022  | 03/12/2022   | 3 - Three     | 1 - One         |

  Scenario Outline: Verifying Adactin search hotel page with mandatory fields to navigate to select page
    Given User is on the Adactin page
    When User should perform login "<username>" , "<password>"
    Then User should verify after login success message "Hello paramesr2020!"
    When User needs to search hotel using mandatory fields "<location>","<noOfRooms>","<checkInDate>","<checkOutDate>" and "<adultsPerRoom>"
    Then User should navigate to select hotel and verify the success message "Select Hotel"

    Examples: 
      | username     | password     | location | noOfRooms | checkInDate | checkOutDate | adultsPerRoom |
      | paramesr2020 | p@r@mesr2020 | Brisbane  | 2 - Two   | 02/12/2022  | 03/12/2022   | 3 - Three     |

  Scenario Outline: Verifying Adactin search hotel page by date checking
    Given User is on the Adactin page
    When User should perform login "<username>" , "<password>"
    Then User should verify after login success message "Hello paramesr2020!"
    When User needs to search hotel using "<location>","<hotels>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should verify after search with the date error message "Check-In Date shall be before than Check-Out Date" and "Check-Out Date shall be after than Check-In Date"

    Examples: 
      | username     | password     | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | paramesr2020 | p@r@mesr2020 | Brisbane | Hotel Creek | Standard | 2 - Two   | 02/12/2023  | 03/12/2022   | 3 - Three     | 1 - One         |

  Scenario Outline: Verifying Adactin search hotel page without entering any fields
    Given User is on the Adactin page
    When User should perform login "<username>" , "<password>"
    Then User should verify after login success message "Hello paramesr2020!"
    When User should click search without entering any fields
    Then User should verify after search with the error message "Please Select a Location"

    Examples: 
      | username     | password     |
      | paramesr2020 | p@r@mesr2020 |

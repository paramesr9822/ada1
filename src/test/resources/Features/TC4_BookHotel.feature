@BookHotel
Feature: Verifying Adactin Hotel Book Hotel details

  Scenario Outline: Verifying Adactin Hotel Book Hotel page by entering all fields
    Given User is on the Adactin page
    When User should perform login "<username>" , "<password>"
    Then User should verify after login success message "Hello paramesr2020!"
    And User needs to search hotel using "<location>","<hotels>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childPerRoom>"
    Then User should navigate to select hotel and verify the success message "Select Hotel"
    And User should Click the radiobtn and continue
    Then User should verify after click continue success message "Book A Hotel"
    And User should book hotel "<firstName>","<lastName>" and "<billingAddress>"
      | ccType           | ccNo             | expMonth  | expYear | CVV  |
      | VISA             | 1234567890123456 | April     |    2020 | 4567 |
      | MasterCard       | 2222222222222222 | September |    2021 | 1234 |
      | American Express | 8384793040836432 | March     |    2022 | 9876 |
    Then User should verify after booking success message "Booking Confirmation" and save order id

    Examples: 
      | username     | password     | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childPerRoom | firstName    | lastName | billingAddress |
      | paramesr2020 | p@r@mesr2020 | Sydney   | Hotel Creek | Double   | 1 - One   | 02/12/2022  | 03/12/2022   | 2 - Two       | 0 - None     | Parameswaran | R        | Aruppukottai   |

  Scenario Outline: Verifying Adactin Hotel Book Hotel page without entering any fields
    Given User is on the Adactin page
    When User should perform login "<username>" , "<password>"
    Then User should verify after login success message "Hello paramesr2020!"
    And User needs to search hotel using "<location>","<hotels>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childPerRoom>"
    Then User should navigate to select hotel and verify the success message "Select Hotel"
    And User should Click the radiobtn and continue
    Then User should verify after click continue success message "Book A Hotel"
    And User should click Book Now without entering any fields
    Then User should verify after click Book Now error message "Please Enter your First Name", "Please Enter you Last Name", "Please Enter your Address", "Please Enter your 16 Digit Credit Card Number", "Please Select your Credit Card Type", "Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number"

    Examples: 
      | username     | password     | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childPerRoom |
      | paramesr2020 | p@r@mesr2020 | Sydney   | Hotel Creek | Double   | 1 - One   | 02/12/2022  | 03/12/2022   | 2 - Two       | 0 - None     |

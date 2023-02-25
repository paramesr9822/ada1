@CancelBooking
Feature: Verifying Adactin Hotel Cancel Booking

  @one
  Scenario Outline: Verifying Adactin Hotel Cancel Booking with Order Id
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
    And User should cancel order id
    Then User should verify after cancelled order id success message "The booking has been cancelled."

    Examples: 
      | username     | password     | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childPerRoom | firstName    | lastName | billingAddress |
      | paramesr2020 | p@r@mesr2020 | Sydney   | Hotel Creek | Double   | 1 - One   | 15/10/2022  | 18/10/2022   | 2 - Two       | 0 - None     | Parameswaran | R        | Aruppukottai   |

  @Two
  Scenario Outline: Verifying Adactin Hotel Cancel Booking with existing Order Id
    Given User is on the Adactin page
    When User should perform login "<username>" , "<password>"
    Then User should verify after login success message "Hello paramesr2020!"
    And User should cancel existing "<orderId>"
    Then User should verify after cancelled existing order id success message "The booking has been cancelled."

    Examples: 
      | username     | password     | orderId    |
      | paramesr2020 | p@r@mesr2020 | 63O8O72OC3 |

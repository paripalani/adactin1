Feature: User booking a hotel

  Scenario: User logs in with valid credentials
    Given the user is on the login page
    When the user enters valid username  and password then clicks on the login button
     | username     | password |
      | itachi101998 | 2G2H43   |

  
    Then the user should be redirected to the search hotel page
      
    When user fills the search hotel page
    And the user clicks on the search button
    Then the user should be redirected to the select hotel page
    When the user selects the hotel
    And the user clicks on the continue button
    Then the user should be redirected to the book a hotel page
    When the user fills the firstname, lastname,address,creditcardno, and cvv
     | firstname | lastname | address     | creditcardno     | cvv |
      | John      | Doe      | 123 St.     | 1234567890123456 | 123 |
   
    And the user selects the credit card type and expiration date
    And the user clicks on the book now button
    Then the user should be redirected to the booking confirmation page
     
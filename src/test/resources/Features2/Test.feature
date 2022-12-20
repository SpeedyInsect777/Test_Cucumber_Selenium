Feature: As a user I should be able to login in to the given page
  enter provided data than after processing order
  I should be able to see new order on the view all orders page

#  Scenario:
#   Given user is already logged in to the page
#    When user is on order page
#    Then user enters appropriate test data
#      | Product      | Familybea    |
#      | Quantity     | 25           |
#      | CustomerName | Mike Tyson   |
#      | Street       | 7 eddy road  |
#      | City         | Marion       |
#      | State        | Ohio         |
#      | Zipcode      | 43302        |
#      | CardNumber   | 123456789012 |
#      | ExpDate      | 77/88        |
#    Then user should see new order in the table on view all order page


  @wip

  Scenario Outline:
    Given user is already logged in to the page
    When user is on order page
    * user enters Product "<Product>"
    * user enters Quantity "<Quantity>"
    * user enters CustomerName "<CustomerName>"
    * user enters Street "<Street>"
    * user enters City "<City>"
    * user enters State "<State>"
    * user enters Zipcode "<Zipcode>"
    * user enters CardNumber "<CardNumber>"
    * user enters ExpDate "<ExpDate>"
    * user should see new order in the table on view all order page

    Examples:
      | Product    | Quantity | CustomerName    | Street          | City        | State | Zipcode | CardNumber   | ExpDate |
      | Familybea  | 25       | Mike Tyson      | 7 eddy road     | Marion      | Ohio  | 43302   | 123456789012 | 77/88   |
      | Screenable | 55       | Jim Carey       | 1 fountain road | Cleveland   | Ohio  | 44512   | 123456789012 | 77/88   |
      | Familybea  | 41       | Bob Marley      | 7 davids road   | Toledo      | Ohio  | 44789   | 123456789012 | 77/88   |
      | MoneyCog   | 65       | Michael Jackson | 32 harlem ave   | Madison     | Ohio  | 41257   | 123456789012 | 77/88   |
      | Familybea  | 51       | David Beckham   | 71 ace road     | Lorain      | Ohio  | 45874   | 123456789012 | 77/88   |
      | Screenable | 12       | Fernando Torres | 22 brook road   | Springfield | Ohio  | 45632   | 123456789012 | 77/88   |
      | Familybea  | 98       | Michael Jordan  | 17 lily road    | Dayton      | Ohio  | 48963   | 123456789012 | 77/88   |
      | MoneyCog   | 24       | Muhammed Ali    | 237 front road  | Cincinnati  | Ohio  | 45625   | 123456789012 | 77/88   |
      | Familybea  | 34       | Charles Theron  | 725 Marble road | Logan       | Ohio  | 45677   | 123456789012 | 77/88   |


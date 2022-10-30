#    Test_02 Etsy Search Functionality Title Verification (without parameterization)
#    1. User is on https://www.etsy.com
#    2. User types Wooden Spoon in the search box
#    3. User clicks search button
#    4. User sees Wooden Spoon is in the title

Feature: As a user when i go to etsy.com and enter "wooden spoon" on the sear box and
  i should be able to see wooden spoon as a title
@wip
  Scenario: When user enters etsy.com and searches for
  wooden spoon title needs to be as its expected

    Given user is on "https://www.etsy.com"
    Then user types "Wooden Spoon" in the search box
    And user clicks search button
    Then user sees "Wooden spoon - Etsy" is in the title



 # Test_01: Etsy Title Verification
 # 1. user is on https://www.etsy.com
 # 2. user sees title as it's expected.

  #Expected TITLE :
  # Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone

  Feature: As a user I should be able to go google.com and search potato
    and title must match with search content

    @wip
  Scenario: Go to www.etsy.com and verify title as expected

    When as user i go to "www.etsy.com"
    Then as a user i should see title as its expected




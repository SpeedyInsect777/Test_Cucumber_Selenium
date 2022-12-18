

Feature: Wikipedia Search Functionality and verifications

  Background:

    Given User is on Wikipedia home page

  Scenario Outline: Wikipedia Search Functionality Title Verification with using DDT

    When User types "<searchValue>" in the wiki search box

    Then User sees "<expectedTitle>" is in the wiki title

    Examples:
      | searchValue       | expectedTitle     |
      | Steve Jobs        | Steve Jobs        |
      | Bill Gates        | Bill Gates        |
      | Cristiano Ronaldo | Cristiano Ronaldo |
      | Elon Musk         | Elon Musk         |
      | Albert Einstein   | Albert Einstein   |
      | Chuck Norris      | Chuck Norris      |
      | Alisher Usmanov   | Alisher Usmanov   |


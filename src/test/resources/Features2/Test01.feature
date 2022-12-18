


Feature: user goes to given website and clicks given link


  Scenario: user passes List of input text
    Given user goes input text passes List of provided text
        #index
      | user1 |
      | user2 |
      | user3 |

  Scenario: user passes Map of input text
    Then user goes input text passes Map of provided text
        #key     value
      | user1 | password1 |
      | user2 | password2 |
      | user3 | password3 |
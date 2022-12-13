

Feature:
  User enters to the given website and searches to
  given values and compares if title matches.


@"ScenarioOutlineTest"
  Scenario Outline:

    When a User goes to the given website and search for "<names>"
    Then user should be able to see exact same name as a title

    Examples:

      | names      |
      | Manuchekhr |
      | Asoev      |
      | Yusuf      |
      | Asoev      |
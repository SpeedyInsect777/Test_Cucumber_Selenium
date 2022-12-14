
@wip
Feature: user goes to the given web and searches for people
  and compares if title matches with searching result

  Background:
   Given User goes to google page

  Scenario Outline:

    Given user must search "<names>"
    Then user must see "<titles>"


    Examples:
      | names      | titles                     |
      | Tarzan     | Tarzan - Google Search     |
      | Mike Tyson | Mike Tyson - Google Search |
      | Jim Carey  | Jim Carey - Google Search  |
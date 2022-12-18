Feature: user must be able to locate "Registration Form" and
  click on it then user must be able to fill out form and click signup


  Background:
    Given user must be able to click on "Registration Form"



  Scenario Outline:
    Then  user must pass "<firstname>","<lastname>","<username>","<email>","<password>","<phone>"

    And user must select "<gender>"

    Then user passes "<dateOfBirth>"


    Examples:
      | firstname | lastname | username  | email          | password  | phone        | gender | dateOfBirth |
      | Mike      | Dave     | username1 | abc1@gmail.com | password1 | 444-555-6666 | Male   | 05/05/1989  |
      | David     | Craig    | username2 | abc2@gmail.com | password2 | 666-111-8888 | Male   | 06/02/1987  |
      | Sean      | Paul     | username3 | abc3@gmail.com | password3 | 282-987-6020 | Male   | 22/07/1985  |
      | Peter     | Steve    | username4 | abc4@gmail.com | password4 | 986-234-6768 | Male   | 12/06/1986  |
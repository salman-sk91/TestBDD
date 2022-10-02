@L2 @Regression
Feature: Account Holder withdraws cash Register Feature


  Scenario: Account has sufficient funds
    Given the account balance is $100
    And the card is valid
    And the machine contains enough money
      | username | password |
      | salman   | pass1    |
      | salman2  | pass2    |

  @ignore
  Scenario Outline: Account has sufficient funds2

    Given the account balance is $100
    And the card is valid
    And the machine contains "<username>" enough money "<password>"
    Examples:
      | username | password |
      | salman   | pass1    |
      | salman2  | pass2    |

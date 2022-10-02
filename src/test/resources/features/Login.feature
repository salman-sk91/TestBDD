@L2 @ignore
Feature: Account Holder withdraws cash Login Feature

    Scenario: Account has sufficient funds
        Given the account balance is $100
        And the card is valid
        And the machine contains enough money
            | username | password |
            | salman   | pass1    |
            | salman2  | pass2    |
        When the Account Holder requests $20
        Then the ATM should dispense $20
        And the account balance should be $80
        And the card should be returned

Feature: Search for specific item

    Scenario: search for something and verify title contains it

        Given user is on google main page
        When user enter 'apple' in search box
        Then user verifies page tittle contains 'apple'


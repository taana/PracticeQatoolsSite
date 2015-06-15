Feature: Practice

  Background: 
    Given Open URL
    

  Scenario: Entering valid values into selected fields
    When Type Name & Last Name
    Then Click on Submit button
    And Close browser

  Scenario: Locating elements
    When Click on the link Partial Link Test
    Then Click on the another link Link Test
    And Close browser

    
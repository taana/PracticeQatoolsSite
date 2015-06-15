Feature: Practice browser navigation

  Background: Given Navigate to Automation Practice Switch Windows page

  Scenario: Navigation forward back
    Given Home page should be opened
    When About page should be opened
    Then Navigate back to home page
    And Navigate forward to about page
    And Refresh browser
    And Close browser

  Scenario: Window Commands
    When Get Window name
    Then Click on New Message Window
    Then Get all the Windows names
    And Close the pop up window

 
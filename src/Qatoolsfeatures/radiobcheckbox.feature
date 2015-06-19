Feature: Practice selecting checkboxes and radiobuttons

  Scenario: Selecting buttons
    Given Open URL
    When Select Radio button(female)
    Then Select Third radio button for category Years of Exp
    Then Check the checkbox 'Automation Tester' for category Profession
    Then Check the checkbox 'Selenium IDE' for category Automation Tool
    And Close browser

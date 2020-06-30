
Feature: Login User

  Scenario: Login user
    Then Click "Вход" button
    Then Input login
    Then Input password
    Then Click button enter
    Then Content with "Здравствуй, " visible
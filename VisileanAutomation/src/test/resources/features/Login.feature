Feature: Login.feature :Login Visilean Web Application

  Background: Below are the common step for each scenario
    Given Open Chrome Browser and Start Application
    When I enter URL "https://go.visilean.com/Visilean/login"
    And I should should see visilean login page

  Scenario: Test Login with Valid Credentials
    When I enter username "admin@visilean.com" and password "6G:N3;&xu."
    And I click on Submit button on login page
    Then I should login sucessfully
    And I click on System button dropdown button
    And I click on logout button
    And I should should see visilean login page

  Scenario: Test Login with InValid Credentials
    When I enter username "admin@visilean.com" and password "56985"
    And I click on Submit button on login page
    Then I should See validation message

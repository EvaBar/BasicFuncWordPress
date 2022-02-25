
Feature: Login functionality
  As a user, I should be able to login with valid credentials

  Background: Login
    Given User is on the login page
    When User clicks login button

@tag
  Scenario: Wordpress login
  And User enters "username" and "password"
  Then User is on the home page

@wip
  Scenario Outline: Wordpress unseccessful login
   And User enters wrong "<username>" or "<password>"
    Then message should be displayed based on "<username>" or "<password>"


    Examples:
    |username|password|
    |evab2   |        |
    |evab25  |David!25|




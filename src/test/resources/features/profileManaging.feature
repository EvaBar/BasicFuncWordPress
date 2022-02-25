Feature: Managing my profile info
  As a user, I should be able to update my profile information
  as first name, last name, public name, about me info,
  hide my gravatar profile and to save my profile details


  Scenario: Profile update
  Given User is on my profile page
  When User updates personal info
  Then User saves profile details
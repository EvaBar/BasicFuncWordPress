Feature: Managing my profile info
  As a user, I should be able to update my profile information
  as first name, last name, public name, about me info,
  hide my gravatar profile and to save my profile details

  As a user, I should be able to hide my gravatar profile

  Background:
    Given User is on my profile page

@tag
  Scenario: Profile update
    When User updates personal info
   When User clicks hide my gravatar profile button
   Then User saves profile details


    Scenario: Upload photo
      When hide gravatar button is selected
      Then User can upload the photo
Feature: Profile page info
  As a user, when i click my profile icon, I should be on my profile page
  and see the following features:
  first name,
  last name,
  public display name,
  about me info,
  I can hide my gravatar profile,
  profile links,
  manage which sites appear in my profile.

@tag
  Scenario: My profile info
    Given User is on the home page
    When User clicks my profile icon
    Then User is on my profile page
    And User can see the following features:
      |First name|
      |Last name|
      |Public display name|
      |About me           |


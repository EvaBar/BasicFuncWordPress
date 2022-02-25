package com.aweber.step_definitions;

import com.aweber.pages.ProfileManagingPage;
import io.cucumber.java.en.When;

public class GravatarStep_Defs {

    @When("User clicks hide my gravatar profile button")
    public void user_clicks_hide_my_gravatar_profile_button() {
        ProfileManagingPage profile = new ProfileManagingPage();
        profile.hideGravatarBox.click();
        profile.saveButton.click();
    }

}

package com.aweber.step_definitions;

import com.aweber.pages.MyProfilePage;
import com.aweber.utilities.BrowserUtils;
import com.aweber.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProfileStep_Defs {

    MyProfilePage profile = new MyProfilePage();

    @When("User clicks my profile icon")
    public void user_clicks_my_profile_icon() {
        //BrowserUtils.sleep(2);
        profile.icon.click();
    }

    @Then("User is on my profile page")
    public void user_is_on_my_profile_page() {
        BrowserUtils.sleep(3);
        String actualT = Driver.getDriver().getTitle();
        System.out.println(actualT);
        String expectedT = "My Profile";
        System.out.println(expectedT);
        Assert.assertTrue(actualT.contains(expectedT));
    }



    @Then("User can see the following features:")
    public void user_can_see_the_following_features(List<String> profileList) {

        System.out.println("Profile list = "+profileList);

        for(String each:profileList){
            System.out.println("Each list "+each);

        }

        List<String> newList = new ArrayList<>();
        newList.add(profile.firstName.getText());
        newList.add(profile.lastName.getText());
        newList.add(profile.displayName.getText());
        newList.add(profile.aboutMe.getText());
        System.out.println(newList);

        Assert.assertEquals(profileList, newList);


    }


}

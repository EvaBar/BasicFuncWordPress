package com.aweber.step_definitions;

import com.aweber.pages.ProfileManagingPage;
import com.aweber.utilities.BrowserUtils;
import com.aweber.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

public class ManageProfileStep_Defs {
    ProfileManagingPage manage = new ProfileManagingPage();

    @When("User updates personal info")
    public void user_updates_personal_info() {
        manage.inputFirstName.clear();
        manage.inputFirstName.sendKeys("Newname");
        manage.inputLastName.clear();
        manage.inputLastName.sendKeys("Newname");
        manage.inputPublicName.clear();
        manage.inputPublicName.sendKeys("Public Nickname");
        manage.inputAboutMe.clear();
        manage.inputAboutMe.sendKeys("Info");
        //manage.hideGravatarBox.click();
        BrowserUtils.sleep(3);
        manage.saveButton.click();
    }

    @Then("User saves profile details")
    public void user_saves_profile_details() {
        String actualMsg = manage.successMsg.getText();
        System.out.println(actualMsg);
        String expectedMsg = "Settings saved successfully!";
        System.out.println(expectedMsg);

       Driver.closeDriver();

    }

    @When("hide gravatar button is selected")
    public void hide_gravatar_button_is_disabled() {
        //manage.hideGravatarBox.click();
        Boolean a = manage.hideGravatarBox.isSelected();

        System.out.println(a);
    }

    @Then("User can upload the photo")
    public void user_can_upload_the_photo() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(manage.upload));
        String path = "C:\\Users\\romev\\OneDrive\\Desktop\\Minions.jpeg";
        manage.upload.sendKeys(path);

        manage.upload.click();
        manage.changePhotoButton.click();
        //"C:\Users\romev\OneDrive\Desktop\Minions.jpeg"

        String path1 ="C:\\Users\\Desktop\\Minions.jpeg";
        //String s1 = System.getProperty("user.home")+"/Desktop/Minions.jpeg";
        //String s2 = "System.getProperty(\"user.home\")+\"\\\\Desktop\\\\Minions.jpeg\"";

    }

}

package com.aweber.step_definitions;

import com.aweber.pages.LoginPage;
import com.aweber.utilities.BrowserUtils;
import com.aweber.utilities.ConfigurationReader;
import com.aweber.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class LoginStep_Defs {

    LoginPage log = new LoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("https://wordpress.com/");
    }
    @When("User clicks login button")
    public void user_clicks_login_button() {
        log.mainLogin.click();
    }

    @When("User enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        log.username.sendKeys(ConfigurationReader.getProperty("username")+ Keys.ENTER);
        log.password.sendKeys(ConfigurationReader.getProperty("password")+Keys.ENTER);
    }
    @Then("User is on the home page")
    public void user_is_on_the_home_page() {
        BrowserUtils.sleep(3);
        String actualTitle = Driver.getDriver().getTitle();
        //BrowserUtils.sleep(5);
        System.out.println("Actual title ="+actualTitle);
        String expectedInTitle = "Following ‹ Reader";

        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    @When("User enters wrong {string} or {string}")
    public void user_enters_wrong_or(String string, String string2) {
        log.username.sendKeys(string);
        log.continueButton.click();

    }



    @Then("message should be displayed based on {string} or {string}")
    public void should_be_displayed(String string, String string2) {


        if(!string.equals(ConfigurationReader.getProperty("username"))){

            log.errorMsg.isDisplayed();
        }else{
            log.password.sendKeys(string2);
            log.loginButton.click();
            log.errorPasswMsg.isDisplayed();
        }

    }







}

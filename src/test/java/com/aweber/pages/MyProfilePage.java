package com.aweber.pages;

import com.aweber.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {

    public MyProfilePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//img[@class='gravatar'])[1]")
    public WebElement icon;

    @FindBy(xpath = "//label[@for='first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//label[@for='last_name']")
    public WebElement lastName;

    @FindBy(xpath = "//label[@for='display_name']")
    public WebElement displayName;

    @FindBy(xpath = "//label[@for='description']")
    public WebElement aboutMe;

    @FindBy(xpath = "//strong[@class='profile__link-destination-label-lead']")
    public WebElement gravatar;

    }


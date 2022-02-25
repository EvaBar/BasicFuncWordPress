package com.aweber.pages;

import com.aweber.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadPhotoPage {

    public UploadPhotoPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//span[@class='edit-gravatar__label']")
    public WebElement upload;
    @FindBy(xpath = "//button[@class='button image-editor__buttons-button is-primary']")
    public WebElement changePhotoButton;
    @FindBy(xpath = "//span[@class='notice__content']")
    public WebElement message;
    }






package com.aweber.pages;

import com.aweber.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileManagingPage {

    public ProfileManagingPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "first_name")
    public WebElement inputFirstName;

    @FindBy(id = "last_name")
    public WebElement inputLastName;

    @FindBy(id = "display_name")
    public WebElement inputPublicName;

    @FindBy(id = "description")
    public WebElement inputAboutMe;

    @FindBy(xpath = "//button[@locale='en']")
    public WebElement saveButton;

    @FindBy(xpath = "//span[.='Settings saved successfully!']")
    public WebElement successMsg;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement hideGravatarBox;

    @FindBy(xpath = "//span[.='Click to change photo']")
    public WebElement upload;

    @FindBy(xpath = "//button[@class='button image-editor__buttons-button is-primary']")
    public WebElement changePhotoButton;



}

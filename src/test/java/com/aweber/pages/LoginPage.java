package com.aweber.pages;

import com.aweber.utilities.ConfigurationReader;
import com.aweber.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@role='menuitem'])[3]")
    public WebElement mainLogin;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement username;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;


    @FindBy(xpath = "//div[@class='form-input-validation is-error']")
    public WebElement errorMsg;


    @FindBy(xpath = "//button[@locale='en']")
    public WebElement continueButton;

    @FindBy(xpath = "//div[@class='form-input-validation is-error']")
    public WebElement errorPasswMsg;

    @FindBy(xpath = "//button[.='Log In']")
    public WebElement loginButton;


}

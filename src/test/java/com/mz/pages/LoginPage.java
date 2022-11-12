package com.mz.pages;

import com.mz.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);


    }
    @FindBy (xpath = "//input[@id='user']")
    public WebElement userNam;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy (xpath = "//input[@id='submit-form']")
    public WebElement loginButton;
}

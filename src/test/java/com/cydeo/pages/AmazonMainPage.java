package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonMainPage {

    public AmazonMainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "sp-cc-accept")
    public WebElement acceptCookiesButton;

    @FindBy (id = "twotabsearchtextbox")
    public WebElement searchBox;

}

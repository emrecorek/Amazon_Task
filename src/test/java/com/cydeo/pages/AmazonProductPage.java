package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonProductPage {

    public AmazonProductPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "productTitle")
    public WebElement productName;

    @FindBy(xpath = "(//span[@class='selection'])[1]")
    public WebElement size;

    @FindBy(xpath = "(//span[@class='selection'])[2]")
    public WebElement color;

    @FindBy(xpath = "//div[@id='availability']/span")
    public WebElement stockStatus;

    @FindBy(xpath = "//span[@class='a-price aok-align-center']")
    public WebElement price;

    public void productInformation() {

        String productName = this.productName.getText();
        productName = productName.substring(0, productName.indexOf("("));

        String size = this.size.getText();
        String color = this.color.getText();
        String stockStatus = this.stockStatus.getText();
        String price = this.price.getText();
        price = price.replace("\n", ",");

        System.out.println(productName + " Size:" + size + "\nColor:" + color + "  Price:" + price + "\nStock:" + stockStatus);

    }


}

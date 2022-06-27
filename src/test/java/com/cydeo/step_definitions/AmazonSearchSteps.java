package com.cydeo.step_definitions;

import com.cydeo.pages.AmazonMainPage;
import com.cydeo.pages.AmazonProductPage;
import com.cydeo.pages.AmazonSearchPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WaitUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class AmazonSearchSteps {

    AmazonMainPage mainPage = new AmazonMainPage();
    AmazonSearchPage searchPage = new AmazonSearchPage();
    AmazonProductPage product = new AmazonProductPage();

    @Given("User is on Amazon page")
    public void userIsOnAmazonPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        mainPage.acceptCookiesButton.click();
    }

    @When("User search product {string}")
    public void userSearchProduct(String product) {
        mainPage.searchBox.sendKeys(product + Keys.ENTER);
       // mainPage.searchButton.click();

    }

    @And("User clicks first product")
    public void userClicksFirstProduct() {
        WaitUtils.waitVisibilityOfElement(searchPage.firstProduct);
        searchPage.firstProduct.click();
    }


    @Then("User sees product information")
    public void userSeesProductInformation() {
        product.getProductsInformation();
    }
}

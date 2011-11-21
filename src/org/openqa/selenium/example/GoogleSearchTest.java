package org.openqa.selenium.example;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class GoogleSearchTest extends BaseTest{

    @Test
    public void searchForCheese() {
        // Create a new instance of the search page class
        // and initialise any WebElement fields in it.
        GoogleSearchPage searchPage = PageFactory.initElements(driver, GoogleSearchPage.class);
        // And now do the search.
        searchPage.searchFor("Cheese");
        // Initialize the results page
        GoogleSearchResultsPage resultsPage = PageFactory.initElements(driver, GoogleSearchResultsPage.class);
        // Click the 'Images' link in the sidebar
        resultsPage.clickImages();
    }

}
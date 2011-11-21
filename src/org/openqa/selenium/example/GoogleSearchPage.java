package org.openqa.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {

    @FindBy(name = "q")
    private WebElement searchBox;

    public void searchFor(String text) {
        // And here we use it. Note that it looks like we've
        // not properly instantiated it yet....
        searchBox.sendKeys(text);
        searchBox.submit();
    }

}

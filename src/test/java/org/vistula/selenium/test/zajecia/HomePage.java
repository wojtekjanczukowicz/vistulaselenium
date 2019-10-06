package org.vistula.selenium.test.zajecia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;
    @FindBy (id="search_form_input_homepage")
    private WebElement searchBar;
    @FindBy (id="search_button_homepage")
    private WebElement searchButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void search(String text) {
        searchBar.sendKeys(text);
        searchButton.submit();
    }
}

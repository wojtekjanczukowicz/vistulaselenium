package org.vistula.selenium.test.pop;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchNewProject {
    private WebDriver driver;
    @FindBy (id="search")
    private WebElement search;

    public SearchNewProject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void searchNewProject(String a) {
        search.sendKeys(a);
        search.sendKeys(Keys.ENTER);
    }
}
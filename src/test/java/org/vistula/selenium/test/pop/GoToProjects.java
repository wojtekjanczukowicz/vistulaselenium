package org.vistula.selenium.test.pop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoToProjects {
    private WebDriver driver;
    @FindBy(className = "activeMenu")
    private WebElement iconProject;

    public GoToProjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickGoToProjects() {
        iconProject.click();
    }
}
package org.vistula.selenium.test.pop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewProject {
    private WebDriver driver;
    @FindBy(className = "button_link")
    private WebElement addProject;
    @FindBy (id="name")
    private WebElement title;


    public AddNewProject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAddNewProject() {
        addProject.click();

    }
}
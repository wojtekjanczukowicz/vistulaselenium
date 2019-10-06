package org.vistula.selenium.test.pop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FillAndSaveProject {
    private WebDriver driver;
    @FindBy (id="name")
    private WebElement title;
    @FindBy (id="prefix")
    private WebElement prefix;
    @FindBy (id="description")
    private WebElement description;
    @FindBy (id="save")
    private WebElement save;


    public FillAndSaveProject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillAndSaveData(String a, String b, String c) {
        title.sendKeys(a);
        prefix.sendKeys(b);
        description.sendKeys(c);
        save.click();
    }
}
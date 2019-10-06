package org.vistula.selenium.test.pop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoToAdminTool {
    private WebDriver driver;
    @FindBy(css = "span.icon_tools")
    private WebElement adminIcon;


    public GoToAdminTool(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAdminTool() {
        adminIcon.click();
    }
}
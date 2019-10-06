package org.vistula.selenium.test.pop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePracaDomowa {
    private WebDriver driver;
    @FindBy (id="email")
    private WebElement email;
    @FindBy (id="password")
    private WebElement password;
    @FindBy (id="login")
    private WebElement login;

    public HomePagePracaDomowa(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void tryToLogin(String a, String b) {
        email.sendKeys(a);
        password.sendKeys(b);
        login.click();
    }
}

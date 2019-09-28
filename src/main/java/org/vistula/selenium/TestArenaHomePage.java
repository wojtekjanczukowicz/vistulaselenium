package org.vistula.selenium;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestArenaHomePage extends BasePage {

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login")
    private WebElement login;

    public TestArenaHomePage(WebDriver driver) {
        super(driver);
    }

    public void attemptLogin(String loginText, String passwordText) {
        email.sendKeys(loginText);
        password.sendKeys(passwordText);
        login.click();
    }

    public void verifyErrorMessage() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.presenceOfElementLocated(By.className("login_form_error")));

        Assertions.assertThat(driver.getTitle()).contains("TestArena");
    }

    public void verifyTitle() {
        Assertions.assertThat(driver.getTitle()).contains("TestArena");
    }
}

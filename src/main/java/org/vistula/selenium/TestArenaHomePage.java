package org.vistula.selenium;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestArenaHomePage {

    private WebDriver driver;

    public TestArenaHomePage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement email;
    private WebElement password;
    private WebElement login;

    public void initializeElements() {
        email = driver.findElement(By.id("email"));
        password = driver.findElement(By.id("password"));
        login = driver.findElement(By.id("login"));
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

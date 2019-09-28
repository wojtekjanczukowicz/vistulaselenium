package org.vistula.selenium.test.part1;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArenaTest extends BaseTest {

    private static final String VALID_LOGIN = "administrator@testarena.pl";
    private static final String VALID_PASSWORD = "sumXQQ72$L";
    private static final String INVALID_PASSWORD = "wrongPassword";

    private WebElement email;
    private WebElement password;
    private WebElement login;

    @Before
    public void openTestArena() {
        driver.get("http://demo.testarena.pl/zaloguj");
        initializeElements();
    }

    private void initializeElements() {
        email = driver.findElement(By.id("email"));
        password = driver.findElement(By.id("password"));
        login = driver.findElement(By.id("login"));
    }

    @Test
    public void myFirstSeleniumTest() {
        Assertions.assertThat(driver.getTitle()).contains("TestArena");
    }

    @Test
    public void myFirstInteractionTest() {
        attemptLogin(VALID_LOGIN, VALID_PASSWORD);

        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.presenceOfElementLocated(By.id("footer")));

        Assertions.assertThat(driver.getTitle()).contains("Kokpit");
    }

    @Test
    public void wrongLoginTest() {
        attemptLogin(VALID_LOGIN, INVALID_PASSWORD);

        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.presenceOfElementLocated(By.className("login_form_error")));

        Assertions.assertThat(driver.getTitle()).contains("TestArena");
    }

    private void attemptLogin(String loginText, String passwordText) {
        email.sendKeys(loginText);
        password.sendKeys(passwordText);
        login.click();
    }

}

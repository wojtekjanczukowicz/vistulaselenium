package org.vistula.selenium.test.part1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.Assertions;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArenaTest {

    private WebDriver driver;

    @BeforeClass
    public static void setDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void captchatest(){
        driver=new ChromeDriver();
        driver.get("http://demo.testarena.pl/zaloguj");
        WebElement captcha = driver.findElement(By.className("g-recaptcha"));
        driver.quit();
    }

    @Test
    public void Polewymagane(){
        driver=new ChromeDriver();
        driver.get("http://demo.testarena.pl/zaloguj");
        WebElement login = driver.findElement(By.id("login"));
        login.click();
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.presenceOfElementLocated(By.className("login_form_error")));

        driver.quit();
    }
    @Test
    public void SzukajVistulazEnterem() {
        driver = new ChromeDriver();
        driver.get("http://google.pl");
        WebElement Szukaj = driver.findElement(By.cssSelector("input[type='text']"));
        WebElement SzukajBtn = driver.findElement(By.cssSelector("input[name='btnK']"));
        Szukaj.sendKeys("Vistula University");
        Szukaj.sendKeys(Keys.ENTER);

    }

    @Test
    public void DuckDuckGoTest() {
        driver = new ChromeDriver();
        driver.get("https://duckduckgo.com/");
        WebElement Szukaj = driver.findElement(By.cssSelector("#search_form_input_homepage"));
        WebElement SzukajBtn = driver.findElement(By.cssSelector("#search_button_homepage"));
        Szukaj.sendKeys("Vistula University");
        SzukajBtn.submit();

        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='https://www.vistula.edu.pl']")));
        driver.quit();


    }

    @Test
    public void myFirstSeleniumTest() {
        driver = new ChromeDriver();
        driver.get("http://demo.testarena.pl/zaloguj");
        Assertions.assertThat(driver.getTitle()).contains("TestArena");
        driver.quit();
    }

    @Test
    public void myFirstInteractionTest() {
        driver = new ChromeDriver();
        driver.get("http://demo.testarena.pl/zaloguj");
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.id("login"));
        //WebElement captcha = driver.findElement(By.id("rc-anchor-alert"));

        email.sendKeys("administrator@testarena.pl");
        password.sendKeys("sumXQQ72$L");
        login.click();

        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.presenceOfElementLocated(By.id("footer")));

        Assertions.assertThat(driver.getTitle()).contains("Kokpit");
        driver.quit();
    }

}

package org.vistula.selenium.test.part1;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.Assertions;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DuckDuckGo {

    private WebDriver driver;

    @BeforeClass
    public static void setDriver() {
        WebDriverManager.chromedriver().setup();
    }


    @Test
    public void DuckDuckGoTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://duckduckgo.com/");
        WebElement Szukaj = driver.findElement(By.cssSelector("#search_form_input_homepage"));
        WebElement SzukajBtn = driver.findElement(By.cssSelector("#search_button_homepage"));
        Szukaj.sendKeys("Vistula University");
        SzukajBtn.submit();

        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a.module__official-url")));
        WebElement link=driver.findElement(By.cssSelector("a.module__official-url"));
        Assertions.assertThat(link.getAttribute("href"))
        .isEqualTo("https://www.vistula.edu.pl/");

        driver.quit();


    }
}
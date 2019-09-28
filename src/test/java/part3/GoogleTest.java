package part3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

    private WebDriver driver;

    @BeforeClass
    public static void setDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void googleSearch() {
        driver = new ChromeDriver();
        driver.get("https://www.google.pl");
        WebElement searchBox = driver.findElement(By.cssSelector("[title='Search'"));
        searchBox.sendKeys("Vistula University");
        searchBox.sendKeys(Keys.ENTER);
        driver.quit();
    }
}

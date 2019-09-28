package part3;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.vistula.selenium.test.part1.BaseTest;

public class GoogleTest extends BaseTest {

    @Test
    public void googleSearch() {
        driver.get("https://www.google.pl");
        WebElement searchBox = driver.findElement(By.cssSelector("[title='Search'"));
        searchBox.sendKeys("Vistula University");
        searchBox.sendKeys(Keys.ENTER);
    }
}

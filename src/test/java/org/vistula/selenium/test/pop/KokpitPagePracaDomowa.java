package org.vistula.selenium.test.pop;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KokpitPagePracaDomowa {

    private WebDriver driver;

    public KokpitPagePracaDomowa(WebDriver driver) {
        this.driver=driver;

    }

    public void waitForKokpitPage() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.presenceOfElementLocated
                        (By.id("footer")));
        Assertions.assertThat(driver.getTitle()).contains("Kokpit");
    }
}

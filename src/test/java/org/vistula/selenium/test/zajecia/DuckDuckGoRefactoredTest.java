package org.vistula.selenium.test.zajecia;
import org.junit.Test;

public class DuckDuckGoRefactoredTest extends VistulaSeleniumTest {

    @Test
    public void shouldFindVistula() {
        HomePage homePage = new HomePage(driver);
        homePage.search("Vistula University");

        SearchResultPage searchResultPage = new SearchResultPage((driver));
        searchResultPage.waitForSidebarLink();
        searchResultPage.verifyLinkUrl("https://www.vistula.edu.pl/");
    }
}
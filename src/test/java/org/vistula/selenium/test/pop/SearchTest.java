package org.vistula.selenium.test.pop;

import org.junit.Test;
import org.vistula.selenium.pages.pop.MainPage;
import org.vistula.selenium.pages.pop.PostPage;
import org.vistula.selenium.pages.pop.SearchResultsPage;

public class SearchTest extends SeleniumTest {

    private static final String BLOG = "https://www.awesome-testing.com";

    @Test
    public void shouldSuccessfullyFindPostAndDisplayCommentsSection() {
        driver.get(BLOG);
        MainPage mainPage = new MainPage(driver);
        mainPage.isInitialized();

        SearchResultsPage searchResultsPage =  mainPage.searchFor("public speaking");
        searchResultsPage.isInitialized();
        searchResultsPage.assertThatPostsAreDisplayed();

        PostPage postPage = searchResultsPage.clickOnFirstPost();
        postPage.isInitialized();
        postPage.assertThatCommentSectionIsDisplayed();
    }
}
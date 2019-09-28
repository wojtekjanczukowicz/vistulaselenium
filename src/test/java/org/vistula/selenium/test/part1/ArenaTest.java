package org.vistula.selenium.test.part1;

import org.junit.Before;
import org.junit.Test;
import org.vistula.selenium.LoggedInHomePage;
import org.vistula.selenium.TestArenaHomePage;

public class ArenaTest extends BaseTest {

    private static final String VALID_LOGIN = "administrator@testarena.pl";
    private static final String VALID_PASSWORD = "sumXQQ72$L";
    private static final String INVALID_PASSWORD = "wrongPassword";

    private TestArenaHomePage testArenaHomePage;

    @Before
    public void openTestArena() {
        driver.get("http://demo.testarena.pl/zaloguj");
        testArenaHomePage = new TestArenaHomePage(driver);
    }

    @Test
    public void myFirstSeleniumTest() {
        testArenaHomePage.verifyTitle();
    }

    @Test
    public void myFirstInteractionTest() {
        testArenaHomePage.attemptLogin(VALID_LOGIN, VALID_PASSWORD);
        LoggedInHomePage loggedInHomePage = new LoggedInHomePage(driver);
        loggedInHomePage.verifyIsLoaded();
    }

    @Test
    public void wrongLoginTest() {
        testArenaHomePage.attemptLogin(VALID_LOGIN, INVALID_PASSWORD);
        testArenaHomePage.verifyErrorMessage();
    }


}

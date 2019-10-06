package org.vistula.selenium.test.pop;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;

public class ArenaTestPracaDomowa extends VistulaSeleniumTestPracaDomowa{

    @Test
    public void PracaDomowa() {
       HomePagePracaDomowa homePagePracaDomowa = new HomePagePracaDomowa(driver);
       homePagePracaDomowa.tryToLogin("administrator@testarena.pl", "sumXQQ72$L");

       KokpitPagePracaDomowa kokpitPagePracaDomowa = new KokpitPagePracaDomowa(driver);
       kokpitPagePracaDomowa.waitForKokpitPage();

       GoToAdminTool goToAdminTool = new GoToAdminTool (driver);
       goToAdminTool.clickAdminTool();

       AddNewProject addNewProject = new AddNewProject(driver);
       addNewProject.clickAddNewProject();

       FillAndSaveProject fillAndSaveProject = new FillAndSaveProject(driver);
        String projectName = RandomStringUtils.randomAlphabetic(7);
        fillAndSaveProject.fillAndSaveData(projectName, RandomStringUtils.randomAlphabetic(8) , "opisOpisOpis");

       GoToProjects goToProjects = new GoToProjects(driver);
       goToProjects.clickGoToProjects();

       SearchNewProject searchNewProject = new SearchNewProject(driver);
       searchNewProject.searchNewProject(projectName);
    }

}

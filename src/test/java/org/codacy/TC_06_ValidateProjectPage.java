package org.codacy;

import pages.Autenthication;
import pages.Scraps;
import pages.NavBar;
import pages.ProjectPage;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import pages.Scraps;


@Test
public class TC_06_ValidateProjectPage extends BaseTest {

    public void tc06ValidateProjectPage() throws Exception {
        Autenthication autenthication = new Autenthication((RemoteWebDriver) driver, testEnvironment);
        ProjectPage projectPage = new ProjectPage((RemoteWebDriver) driver,testEnvironment);
        NavBar navBar = new NavBar((RemoteWebDriver)driver,testEnvironment);
        Scraps scraps = new Scraps((RemoteWebDriver)driver, testEnvironment);

        autenthication.loginwithGoogle();
        navBar.validateProjectNavBar();
        projectPage.validateAddPropjectbtn();
        navBar.selectCodacy2Organization();
        scraps.validateIntercoom();
        projectPage.projectPageSearch();
        projectPage.validateCommitTable();
        projectPage.validateSearchisPresent();
        navBar.validateAccountMenu();
        autenthication.logout();
    }

}

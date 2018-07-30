package org.codacy;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import pages.*;


@Test
public class TC_10_ValidateIssuesPage extends BaseTest {

    public void tc10ValidateIssuesPage() throws Exception {
        Autenthication autenthication = new Autenthication((RemoteWebDriver) driver, testEnvironment);
        ProjectPage projectPage = new ProjectPage((RemoteWebDriver) driver, testEnvironment);
        NavBar navBar = new NavBar((RemoteWebDriver) driver, testEnvironment);
        SideBar sideBar = new SideBar((RemoteWebDriver) driver, testEnvironment);
        IssuesPage issuesPage = new IssuesPage((RemoteWebDriver) driver, testEnvironment);

        autenthication.loginwithGoogle();
        navBar.selectQAtestOrganization();
        projectPage.selectProjectLanding2018();
        sideBar.validateSideBar();
        sideBar.sideBarSelectIssues();
        issuesPage.issuesHeader();
        issuesPage.validateSearch();
        issuesPage.selectIssue();
        issuesPage.validateResultPanel();
        autenthication.logout();
    }
}

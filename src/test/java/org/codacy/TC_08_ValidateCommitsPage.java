package org.codacy;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import pages.*;


@Test
public class TC_08_ValidateCommitsPage extends BaseTest {

    public void tc08ValidateCommitsPage() throws Exception {
        Autenthication autenthication = new Autenthication((RemoteWebDriver) driver, testEnvironment);
        ProjectPage projectPage = new ProjectPage((RemoteWebDriver) driver, testEnvironment);
        NavBar navBar = new NavBar((RemoteWebDriver) driver, testEnvironment);
        Scraps scraps = new Scraps((RemoteWebDriver) driver, testEnvironment);
        SideBar sideBar = new SideBar((RemoteWebDriver) driver, testEnvironment);
        CommitsPage commits = new CommitsPage((RemoteWebDriver)driver, testEnvironment);

        autenthication.loginwithGoogle();
        navBar.selectQAtestOrganization();
        projectPage.selectProjectLanding2018();
        sideBar.validateSideBar();
        sideBar.sideBarSelectCommits();
        commits.validateCommitTable();
        commits.selectCommit();
        commits.validateCommitDetailContainer();
        commits.validateCommitDetailMetrics();
        commits.validateCommitDetailStatusBanner();
        commits.validateCommitDetailTabs();
        autenthication.logout();
    }

}

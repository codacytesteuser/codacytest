package org.codacy;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import pages.*;


@Test
public class TC_11_ValidatePullRequetsPage extends BaseTest {

    public void tc11ValidatePullRequestsPage() throws Exception {
        Autenthication autenthication = new Autenthication((RemoteWebDriver) driver, testEnvironment);
        ProjectPage projectPage = new ProjectPage((RemoteWebDriver) driver, testEnvironment);
        NavBar navBar = new NavBar((RemoteWebDriver) driver, testEnvironment);
        SideBar sideBar = new SideBar((RemoteWebDriver) driver, testEnvironment);
        PullRequestPage pullRequestPage = new PullRequestPage((RemoteWebDriver)driver, testEnvironment);

        autenthication.loginwithGoogle();
        navBar.selectQAtestOrganization();
        projectPage.selectProjectCodacyWebsite();
        sideBar.validateSideBar();
        sideBar.sideBarSelectPullRequests();
        pullRequestPage.selectOpenPullRequetsDropdown();
        pullRequestPage.validatePullOpenRequestsTable();
        pullRequestPage.selectMergePullRequetsDropdown();
        pullRequestPage.validatePullMergedRequestsTable();
        pullRequestPage.selectMergedPullRequet();
        pullRequestPage.validateInviteContainerDetails();
        pullRequestPage.validateCommitDetail();
        pullRequestPage.validateCommitMetricsDetails();
        pullRequestPage.validateNewIssuesDetails();
        pullRequestPage.validateFixedIssuesDetails();
        pullRequestPage.validateHotspotsDetails();
        pullRequestPage.validateNewDuplicationDetails();
        pullRequestPage.validateFixedDuplicationDetails();
        pullRequestPage.validateFilesDetails();
        pullRequestPage.validateDiffDetails();
        pullRequestPage.validateCommitsDetails();
        autenthication.logout();
    }
}

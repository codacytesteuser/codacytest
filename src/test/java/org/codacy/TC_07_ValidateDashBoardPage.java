package org.codacy;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import pages.*;


@Test
public class TC_07_ValidateDashBoardPage extends BaseTest {

    public void tc07ValidateDashBoardPage() throws Exception {
        Autenthication autenthication = new Autenthication((RemoteWebDriver) driver, testEnvironment);
        ProjectPage projectPage = new ProjectPage((RemoteWebDriver) driver, testEnvironment);
        NavBar navBar = new NavBar((RemoteWebDriver) driver, testEnvironment);
        Scraps scraps = new Scraps((RemoteWebDriver) driver, testEnvironment);
        SideBar sideBar = new SideBar((RemoteWebDriver) driver, testEnvironment);
        Dashboard dashboard = new Dashboard((RemoteWebDriver) driver, testEnvironment);

        autenthication.loginwithGoogle();
        navBar.selectQAtestOrganization();
        projectPage.selectProjectLanding2018();
        sideBar.validateSideBar();
        dashboard.selectHistoryDashboard();
        dashboard.chartsContainer();
        dashboard.openPullRequestsContainer();
        dashboard.projectCertificationContainer();
        dashboard.coverageContainer();
        dashboard.projectContentHeader();
        dashboard.IssuesBreakDownContainer();
        dashboard.selectCodeDashboard();
        dashboard.dashboardHistoryIssuesList();
        dashboard.dashboardHistoryMainGraph();
        dashboard.dashboardHistoryIssuesList();
        dashboard.dashboardHistorysideBarLinesofCode();
        dashboard.dashboardHistorysideBarTechnicalDebt();
        autenthication.logout();
    }

}

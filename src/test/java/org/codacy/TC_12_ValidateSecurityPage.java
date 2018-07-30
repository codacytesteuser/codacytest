package org.codacy;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import pages.*;


@Test
public class TC_12_ValidateSecurityPage extends BaseTest {

    public void tc12ValidateSecurityPage() throws Exception {
        Autenthication autenthication = new Autenthication((RemoteWebDriver) driver, testEnvironment);
        ProjectPage projectPage = new ProjectPage((RemoteWebDriver) driver, testEnvironment);
        NavBar navBar = new NavBar((RemoteWebDriver) driver, testEnvironment);
        SideBar sideBar = new SideBar((RemoteWebDriver) driver, testEnvironment);
        SecurityPage securityPage = new SecurityPage((RemoteWebDriver) driver, testEnvironment);

        autenthication.loginwithGoogle();
        navBar.selectQAtestOrganization();
        projectPage.selectProjectCodacyWebsite();
        sideBar.validateSideBar();
        sideBar.sidebarSelectSecurity();
        securityPage.validateSecurityHeader();
        securityPage.validateWarningsSearch();
        securityPage.validateMoreBtn();
        securityPage.validateSecurityList();
        securityPage.selectAuth();
        securityPage.selectCSRF();
        securityPage.selectCookies();
        securityPage.selectCryptography();
        securityPage.selectDos();
        securityPage.selectFileAccess();
        securityPage.selectFirefoxOS();
        securityPage.selectHTTP();
        securityPage.selectInputValidation();
        securityPage.selectInsecureStorage();
        securityPage.selectInsecureModules();
        securityPage.selectOther();
        securityPage.selectRegex();
        securityPage.selectRoutes();
        securityPage.selectSqlInjection();
        securityPage.selectUnexpectedBehaviour();
        securityPage.selectXSS();
        autenthication.logout();
    }
}

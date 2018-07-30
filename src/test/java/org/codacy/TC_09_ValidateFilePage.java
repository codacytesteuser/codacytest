package org.codacy;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import pages.*;


@Test
public class TC_09_ValidateFilePage extends BaseTest {

    public void tc09ValidateFilePage() throws Exception {
        Autenthication autenthication = new Autenthication((RemoteWebDriver) driver, testEnvironment);
        ProjectPage projectPage = new ProjectPage((RemoteWebDriver) driver, testEnvironment);
        NavBar navBar = new NavBar((RemoteWebDriver) driver, testEnvironment);
        SideBar sideBar = new SideBar((RemoteWebDriver) driver, testEnvironment);
        FilesPage filesPage = new FilesPage((RemoteWebDriver)driver,testEnvironment);

        autenthication.loginwithGoogle();
        navBar.selectQAtestOrganization();
        projectPage.selectProjectLanding2018();
        sideBar.validateSideBar();
        sideBar.sideBarSelectFiles();
        filesPage.validateFileSearch();
        filesPage.validateFileTable();
        filesPage.selectFile();
        filesPage.detailFileHeader();
        filesPage.detailFileValidateIgnoreFileButton();
        filesPage.detailFileTableStatistic();
        filesPage.detailvalidateFileSourceView();
        autenthication.logout();
    }

}

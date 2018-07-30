package org.codacy;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import pages.Autenthication;
import pages.ProjectPage;


@Test
public class TC_04_LoginWithGitHub extends BaseTest {


    public void tc04LoginWithGitHub() throws Throwable {
        Autenthication autenthication = new Autenthication((RemoteWebDriver) driver, testEnvironment);
        ProjectPage projectPage = new ProjectPage((RemoteWebDriver)driver, testEnvironment);

        autenthication.loginWithGithub();
        projectPage.validateCommitTable();
        autenthication.logout();
    }

}

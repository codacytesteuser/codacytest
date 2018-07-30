package org.codacy;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import pages.Autenthication;
import pages.ProjectPage;


@Test
public class TC_03_LoginWithBitBucket extends BaseTest {


    public void tc03LoginWithBitBucket() throws Throwable {
        Autenthication autenthication = new Autenthication((RemoteWebDriver) driver, testEnvironment);
        ProjectPage projectPage = new ProjectPage((RemoteWebDriver)driver, testEnvironment);

        autenthication.loginWithBitbucket();
        projectPage.validateCommitTable();
        autenthication.logout();
    }

}

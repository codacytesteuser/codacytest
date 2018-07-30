package org.codacy;

import pages.Autenthication;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import pages.ProjectPage;


@Test
public class TC_02_LoginWithGoogle extends BaseTest {


    public void tc02LoginWithGoogle() throws Throwable {
        Autenthication autenthication = new Autenthication((RemoteWebDriver) driver, testEnvironment);
        ProjectPage projectPage = new ProjectPage((RemoteWebDriver)driver, testEnvironment);

        autenthication.loginwithGoogle();
        projectPage.validateCommitTable();
        autenthication.logout();
    }

}

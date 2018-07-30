package org.codacy;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import pages.Autenthication;
import pages.ProjectPage;
import pages.VerifyElements;

public class TC_07_HomepageVerifyImg extends BaseTest {


    @Test
    public void tc06HomepageVerifyLink() {

        VerifyElements verifyElements = new VerifyElements((RemoteWebDriver) driver, testEnvironment);
        Autenthication autenthication = new Autenthication((RemoteWebDriver) driver, testEnvironment);
        ProjectPage projectPage = new ProjectPage((RemoteWebDriver) driver, testEnvironment);

        verifyElements.verifyImg();
        verifyElements.testsoft();
    }
}


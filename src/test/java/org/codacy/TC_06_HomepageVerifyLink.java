package org.codacy;

import org.eclipse.jetty.client.api.Authentication;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Autenthication;
import pages.ProjectPage;
import pages.VerifyElements;

import java.util.List;

public class TC_06_HomepageVerifyLink extends BaseTest {


    @Test
    public void tc06HomepageVerifyLink() {

        VerifyElements verifyElements = new VerifyElements((RemoteWebDriver) driver, testEnvironment);
        Autenthication autenthication = new Autenthication((RemoteWebDriver) driver, testEnvironment) ;
        ProjectPage projectPage = new ProjectPage((RemoteWebDriver) driver, testEnvironment);

        verifyElements.verifyLink();
        verifyElements.testsoft();

    }
}


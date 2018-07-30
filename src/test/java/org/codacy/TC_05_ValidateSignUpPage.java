package org.codacy;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import pages.Autenthication;
import pages.Homepage;
import pages.Scraps;
import pages.SignUpPage;


@Test
public class TC_05_ValidateSignUpPage extends BaseTest {


    public void tc05ValidateSignUpPage() throws Throwable {
        Homepage homepage = new Homepage((RemoteWebDriver) driver, testEnvironment);
        SignUpPage signUpPage = new SignUpPage((RemoteWebDriver)driver, testEnvironment);
        Scraps scraps = new Scraps((RemoteWebDriver)driver,testEnvironment);

        homepage.selectTryForFree();
        homepage.validateNavBar();
        signUpPage.ValidateSingupPage();
        signUpPage.selectSignUpBitbucket();
        scraps.navigateBack();
        signUpPage.selectSignUpGithub();
        scraps.navigateBack();
        signUpPage.selectSignUpGoogle();
        scraps.navigateBack();
        homepage.validatefooter();

    }

}

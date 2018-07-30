package org.codacy;

import pages.Homepage;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


@Test
public class TC_01_ValidateHomepage extends BaseTest {


    public void  tc01ValidateHomepage() throws Throwable {
        //Istancia a classe
        Homepage homepage = new Homepage((RemoteWebDriver) driver, testEnvironment);
        homepage.validateNavBar();
        homepage.validateHomecontainer();
        homepage.lovebyDevelopersContainer();
        homepage.saveTimeCodeReview();
        homepage.integratedYourWOrkflow();
        homepage.trackProjectQuality();
        homepage.customersFeedback();
        homepage.singUpFooterContainer();
        homepage.validatefooter();

       /* homepage.validateRequestDemobtn();
        homepage.allFeatures();
        homepage.validateLearnMore();
        homepage.validateSignupFooter();
        homepage.validatefooter();*/

    }

}


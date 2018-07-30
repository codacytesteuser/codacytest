package org.codacy;

        import org.aeonbits.owner.ConfigFactory;
        import org.openqa.selenium.*;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.openqa.selenium.ie.InternetExplorerDriver;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import org.testng.annotations.*;

        import java.io.IOException;
        import java.util.concurrent.TimeUnit;

public abstract class BaseTest {


    public WebDriver driver;
    public WebDriverWait wait;

    public WebDriver getDriver() {
        return driver;
    }

 public Environment testEnvironment;

    @BeforeTest
    @Parameters({"environment"})
    public void beforeTest(String environment) {
        System.out.println("Running in " + environment);
        ConfigFactory.setProperty("env", environment);
        testEnvironment = ConfigFactory.create(Environment.class);

    }

    @BeforeMethod
    @Parameters({"browser", "environment"})
    public void loadConfiguration(String browser, String environment) throws IOException {

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "/Users/brunomedley/Documents/MedleyTeste/Binaries/chromedriver");
            driver = new ChromeDriver();
        }
        if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "/Users/brunomedley/Documents/MedleyTeste/Binaries/geckodriver");
            driver = new FirefoxDriver();
        } /*else { TODO
            System.setProperty("webdriver.ie.driver", "/Users/brunomedley/Documents/MedleyTeste/Binaries/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }*/
     //   ConfigFactory.setProperty("env", environment);
      //  testEnvironment = ConfigFactory.create(Environment.class);
       // System.out.println(testEnvironment.url());
        driver.get(testEnvironment.url());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @AfterMethod
    public void cleanup() {
        driver.manage().deleteAllCookies();

    }

    @AfterClass
    public void close() {
        driver.quit();
    }
}

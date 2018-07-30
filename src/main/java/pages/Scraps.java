package pages;

import org.codacy.BasePage;
import org.codacy.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Scraps extends BasePage {
    private static final String INTERCOM = "intercom-launcher-discovery-frame";

    public Scraps(RemoteWebDriver driver, Environment env) {
        super(driver, env);
    }


    public void validateIntercoom() throws Exception {

        getElementWhenVisible(By.name(INTERCOM)).isDisplayed();
        getElementWhenVisible(By.name(INTERCOM)).click();
        getElementWhenVisible(By.name(INTERCOM)).click();

    }

    public void navigateBack(){

        driver.navigate().back();

    }
}

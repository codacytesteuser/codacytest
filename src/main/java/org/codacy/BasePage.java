package org.codacy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class BasePage extends Fragment {

    public WebDriverWait wait;
    public WebDriver driver;
    protected Environment env;

    public BasePage(RemoteWebDriver driver, Environment env) {
        super(driver);
        this.env = env;
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, 10);
    }
}

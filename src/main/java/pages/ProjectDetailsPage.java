package pages;

import org.codacy.BasePage;
import org.codacy.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class ProjectDetailsPage extends BasePage {

    @FindBy (id = "navigation-sidebar")
    private WebElement NavigationBar;
    private static final String CENAS = "navigation-sidebar" ;

    public ProjectDetailsPage(RemoteWebDriver driver, Environment env) {
        super(driver, env);
    }

    public void navigationBar(){

        wait.until(elementToBeClickable(NavigationBar)).isDisplayed();
        getElementWhenVisible(By.id(CENAS)).isDisplayed();
    }
}

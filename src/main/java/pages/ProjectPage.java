package pages;

import org.codacy.BasePage;
import org.codacy.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class ProjectPage extends BasePage {


    private static final String STATUSCOLUMN ="status_column" ;
    private static final String PROJECTCOLUMN = "project_column";
    private static final String LASTCOMMITCOLUMN = "last_commit_column";
    private static final String ISSUESCOLUMN = "issues_column";
    private static final String PROJECT_LIST = "project-list" ;
    private static final String SELECT_PROJECT ="project-2286";
    private static final String ADD_PROJECT_BTN = "add_project_btn";
    private static final String SEARCH_TXT_BOX = "project-search";
    private static final String FILTER_DROPDOWN = "//*[@class='select2-selection__rendered']";
    private static final String PROJECT_PRESENT = "project-1835";
    private static final String NEW_PROJECT_DISPLAYED = "project-1671";
    private static final String SELECT_PROJECT_CODACY_WEBSITE = "project-2241";


    public ProjectPage(RemoteWebDriver driver, Environment env) {
        super(driver, env);
    }

    public void validateCommitTable() {

        getElementWhenVisible(By.id(STATUSCOLUMN)).isDisplayed();
        getElementWhenVisible(By.id(PROJECTCOLUMN)).isDisplayed();
        getElementWhenVisible(By.id(LASTCOMMITCOLUMN)).isDisplayed();
        getElementWhenVisible(By.id(ISSUESCOLUMN)).isDisplayed();
        getElementWhenVisible(By.id(PROJECT_LIST)).isDisplayed();
    }


    public void validateSearchisPresent() {

        getElementWhenVisible(By.id(SEARCH_TXT_BOX)).isDisplayed();
        getElementWhenVisible(By.xpath(FILTER_DROPDOWN)).isDisplayed();

    }

    public void projectPageSearch() {

        getElementWhenVisible(By.id(SEARCH_TXT_BOX)).isDisplayed();
        getElementWhenVisible(By.id(SEARCH_TXT_BOX)).click();
        getElementWhenVisible(By.id(SEARCH_TXT_BOX)).sendKeys("codacy-core");
        getElementWhenVisible(By.id(PROJECT_PRESENT)).isDisplayed();
        getElementWhenVisible(By.id(SEARCH_TXT_BOX)).clear();
        getElementWhenVisible(By.id(SEARCH_TXT_BOX)).sendKeys(Keys.SPACE);
        getElementWhenVisible(By.id(SEARCH_TXT_BOX)).sendKeys(Keys.BACK_SPACE);
        getElementWhenVisible(By.id(NEW_PROJECT_DISPLAYED)).isDisplayed();
    }

    public void validateAddPropjectbtn() {

        getElementWhenVisible(By.id(ADD_PROJECT_BTN)).isDisplayed();

    }

    public void selectProjectLanding2018() {

        getElementWhenVisible(By.id(SELECT_PROJECT)).click();
    }

    public void selectProjectCodacyWebsite() {

        getElementWhenVisible(By.id(SELECT_PROJECT_CODACY_WEBSITE)).click();


    }
}



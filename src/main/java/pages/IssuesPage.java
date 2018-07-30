package pages;

import org.codacy.BasePage;
import org.codacy.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class IssuesPage extends BasePage {

    private static final String DASHBOARD_HEADER ="dashboard_header" ;
    private static final String DROPDOWN_MENU_BRANCHES = "//*[@class=\"dropdown-page-selector dropdown\"]";
    private static final String DROPDOWN_BRANCH_NAME = "dropdown-branch-name" ;
    private static final String FILTER_BAR = "filter_bar";
    private static final String FILTER_LANGUAGE = "Language";
    private static final String FILTER_JAVASCRIPT = "Javascript";
    private static final String FILTER_CATEGORY = "Category";
    private static final String FILTER_CODE_STYLE = "Code Style";
    private static final String FILTER_LEVEL = "Level";
    private static final String FILTER_INFO = "Info";
    private static final String FILTER_PATTERN = "Pattern";
    private static final String FILTER_QUOTES_STYLE = "2376";
    private static final String FILTER_ENFORCE_CAMEL = "2287";
    private static final String AUTHOR = "Author";
    private static final String FILTER_AUTHOR = "//*[contains(text(),'Ines Pinto')]" ;
    private static final String CLEAR_FILTER = "clear-filters";
    private static final String ISSUE_DETAIL = "//*[@class=\"issue-message\"]";
    private static final String ISSUE_DETAIL_RESULT_CONTAINER = "//*[@class=\"IssueDetail\"]";
    private static final String VIEW_FILE_BTN = "//*[@class=\"btn btn-default btn-sm\"]";
    private static final String SETTINGS_BTN = "//*[@class=\"btn-group float-right\"]";
    private static final String SETTINGS_IGNORE_ISSUE = "//*[contains(text(),'Ignore issue')]";
    private static final String SETTINGS_REMOVE_PATTERN = "//*[contains(text(),'Remove pattern')]";
    private static final String SETTINGS_IGNORE_FILE = "//*[contains(text(),'Ignore file')]";
    private static final String SETTINGS_BITBUCKET = "//*[@class=\"fa fa-bitbucket\"]";
    private static final String DETAIL_LINES = "//*[@class=\"DetailLines detail-lines\"]";
    private static final String PATTERN_EXPLANATION = "//*[@class=\"col-md-12 col-xs-12 PatternExplanation pattern-explanation\"]";
    private static final String SOURCE_LINK = "//*[@href=\"http://eslint.org/docs/rules/camelcase\"]";

    public IssuesPage(RemoteWebDriver driver, Environment env) {
        super(driver, env);
    }

    public void issuesHeader() {
        getElementWhenVisible(By.id(DASHBOARD_HEADER)).isDisplayed();
        getElementWhenVisible(By.xpath(DROPDOWN_MENU_BRANCHES)).isDisplayed();
        getElementWhenVisible(By.id(DROPDOWN_BRANCH_NAME)).isDisplayed();

    }

    public void validateSearch() {

        getElementWhenVisible(By.id(FILTER_BAR)).isDisplayed();
        getElementWhenVisible(By.id(FILTER_LANGUAGE)).isDisplayed();
        getElementWhenVisible(By.id(FILTER_LANGUAGE)).click();
        getElementWhenVisible(By.id(FILTER_JAVASCRIPT)).isDisplayed();
        getElementWhenVisible(By.id(FILTER_JAVASCRIPT)).click();
        getElementWhenVisible(By.id(FILTER_CATEGORY)).click();
        getElementWhenVisible(By.id(FILTER_CODE_STYLE)).isDisplayed();
        getElementWhenVisible(By.id(FILTER_LEVEL)).click();
        getElementWhenVisible(By.id(FILTER_INFO)).isDisplayed();
        getElementWhenVisible(By.id(FILTER_PATTERN)).click();
        getElementWhenVisible(By.id(FILTER_QUOTES_STYLE)).isDisplayed();
        getElementWhenVisible(By.id(FILTER_ENFORCE_CAMEL)).isDisplayed();
        getElementWhenVisible(By.id(AUTHOR)).click();
        getElementWhenVisible(By.xpath(FILTER_AUTHOR)).isDisplayed();
        getElementWhenVisible(By.id(CLEAR_FILTER)).isDisplayed();
        getElementWhenVisible(By.id(CLEAR_FILTER)).click();


    }

    public void selectIssue () {
        getElementWhenVisible(By.id(FILTER_PATTERN)).isDisplayed();
        getElementWhenVisible(By.id(FILTER_PATTERN)).click();
        getElementWhenVisible(By.id(FILTER_ENFORCE_CAMEL)).click();
        getElementWhenVisible(By.xpath(ISSUE_DETAIL)).click();

    }

    public void validateResultPanel() {

        getElementWhenVisible(By.xpath(ISSUE_DETAIL_RESULT_CONTAINER)).isDisplayed();
        getElementWhenVisible(By.xpath(VIEW_FILE_BTN)).isDisplayed();
        getElementWhenVisible(By.xpath(SETTINGS_BTN)).isDisplayed();
        getElementWhenVisible(By.xpath(SETTINGS_BTN)).click();
        getElementWhenVisible(By.xpath(SETTINGS_IGNORE_ISSUE)).isDisplayed();
        getElementWhenVisible(By.xpath(SETTINGS_REMOVE_PATTERN)).isDisplayed();
        getElementWhenVisible(By.xpath(SETTINGS_IGNORE_FILE)).isDisplayed();
        getElementWhenVisible(By.xpath(SETTINGS_BITBUCKET)).isDisplayed();
        getElementWhenVisible(By.xpath(DETAIL_LINES)).isDisplayed();
        getElementWhenVisible(By.xpath(PATTERN_EXPLANATION)).isDisplayed();
        getElementWhenVisible(By.xpath(SOURCE_LINK)).isDisplayed();

    }

}

package pages;

import org.codacy.BasePage;
import org.codacy.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SecurityPage extends BasePage {
    private static final String HEADER_CONTAINER = "dashboard_header";
    private static final String PAGE_SELECTOR = "page_selector";
    private static final String PAGE_SELECTOR_BRANCH = "dropdown-branch-name";
    private static final String LAST_UPDATED = "sec-last-updated";
    private static final String WARNING_FILTER = "//*[@class='btn btn-default btn-filter-dropdown dropdown-toggle']";
    private static final String WARNING_FILTER_LIST = "//*[@class='dropdown-menu select-filter-list']";
    private static final String MORE_BTN = "dropdownMenu1";
    private static final String MORE_FILTER_LIST = "//*[@aria-labelledby=\"dropdownMenu1\"]";
    private static final String FILTER_INSECURE = "sec-category-error";
    private static final String FILTER_TURNED_OFF = "sec-category-info";
    private static final String SECURITY_CATEGORY_LIST_CONTAINER = "security-category-list";
    private static final String FILTER_TURN_ON_ALL_SECURTY_PATTERNS = "turn-on-patterns";
    private static final String SELECT_AUTH = "//*[@id=\"security-category-list\"]//*[@id=\"Auth\"]";
    private static final String SIDE_PANEL_AUTH_CONTAINER = "js-side-info-Auth";
    private static final String SELECT_CSRF = "//*[@id=\"security-category-list\"]//*[@id=\"CSRF\"]";
    private static final String SIDE_PANEL_CSRF_CONTAINER = "js-side-info-CSRF";
    private static final String SELECT_COOKIES = "//*[@data-security-category=\"Cookies\"]";
    private static final String SIDE_PANEL_COOKIES_CONTAINER = "js-side-info-Cookies";
    private static final String SELECT_CRYPTOGRAPHY = "//*[@data-security-category=\"Cryptography\"]";
    private static final String SIDE_PANEL_CRYPTOGRAPHY_CONTAINER = "js-side-info-Cryptography";
    private static final String SELECT_DOS = "//*[@data-security-category=\"DoS\"]";
    private static final String SIDE_PANEL_DOS_CONTAINER = "js-side-info-DoS";
    private static final String SELECT_FILE_ACCESS = "//*[@data-security-category=\"File-Access\"]";
    private static final String SIDE_PANEL_FILE_ACCESS_CONTAINER = "js-side-info-File-Access";
    private static final String SELECT_FIREFOX_OS = "//*[@data-security-category='Firefox-OS']";
    private static final String SIDE_PANEL_FIREFOXOS_CONTAINER = "js-side-info-Firefox-OS";
    private static final String SELECT_HTTP = "//*[@data-security-category=\"HTTP\"]";
    private static final String SIDE_PANEL_HTTP_CONTAINER = "js-side-info-HTTP";
    private static final String SELECT_INPUT_VALIDATION = "//*[@data-security-category=\"Input-validation\"]";
    private static final String SIDE_PANEL_INPUT_VALIDATION_CONTAINER = "js-side-info-Input-validation";
    private static final String SELECT_INSECURE_STORAGE = "//*[@data-security-category='Insecure-Storage']";
    private static final String SIDE_PANEL_INSECURE_STORAGE_CONTAINER = "js-side-info-Insecure-Storage";
    private static final String SELECT_INSECURE_MODULES = "//*[@data-security-category=\"Insecure-Storage\"]";
    private static final String SIDE_PANEL_INSECURE_CONTAINER = "js-side-info-Insecure-Storage";
    private static final String SELECT_OTHER = "//*[@data-security-category=\"Other\"]";
    private static final String SIDE_PANEL_OTHER_CONTAINER = "js-side-info-Other";
    private static final String SELECT_REGEX = "//*[@data-security-category=\"Regex\"]";
    private static final String SIDE_PANEL_REGEX_CONTAINER = "js-side-info-Regex";
    private static final String SELECT_ROUTES = "//*[@data-security-category=\"Routes\"]";
    private static final String SIDE_PANEL_ROUTES_CONTAINER = "js-side-info-Routes";
    private static final String SELECT_SQL_INJECTION = "//*[@data-security-category='SQL-Injection']";
    private static final String SIDE_PANEL_SQL_INJECTION_CONTAINER = "js-side-info-SQL-Injection";
    private static final String SELECT_UNEXPECTED_BEHAVIOUR = "//*[@data-security-category=\"Unexpected-behaviour\"]";
    private static final String SIDE_PANEL_UNEXPECTED_BEHAVIOUR_CONTAINER = "js-side-info-Unexpected-behaviour";
    private static final String SELECT_XSS = "//*[@data-security-category=\"XSS\"]";
    private static final String SIDE_PANEL_XSS_CONTAINER = "js-side-info-XSS";


    public SecurityPage(RemoteWebDriver driver, Environment env) {
        super(driver, env);
    }

    public void validateSecurityHeader() {
        getElementWhenVisible(By.id(HEADER_CONTAINER)).isDisplayed();
        getElementWhenVisible(By.id(PAGE_SELECTOR)).isDisplayed();
        getElementWhenVisible(By.id(PAGE_SELECTOR_BRANCH)).isDisplayed();
        getElementWhenVisible(By.id(LAST_UPDATED)).isDisplayed();

    }

    public void validateWarningsSearch() {
        getElementWhenVisible(By.xpath(WARNING_FILTER)).isDisplayed();
        getElementWhenClickable(By.xpath(WARNING_FILTER)).click();
        getElementWhenVisible(By.xpath(WARNING_FILTER_LIST)).isDisplayed();
        getElementWhenVisible(By.id(FILTER_INSECURE)).isDisplayed();
        getElementWhenVisible(By.id(FILTER_TURNED_OFF)).isDisplayed();
    }

    public void validateMoreBtn() {
        getElementWhenVisible(By.id(MORE_BTN)).isDisplayed();
        getElementWhenClickable(By.id(MORE_BTN)).click();
        getElementWhenVisible(By.xpath(MORE_FILTER_LIST)).isDisplayed();
        getElementWhenVisible(By.id(FILTER_TURN_ON_ALL_SECURTY_PATTERNS));


    }

    public void validateSecurityList() {
        getElementWhenVisible(By.id(SECURITY_CATEGORY_LIST_CONTAINER)).isDisplayed();


    }

    public void selectAuth() {
        getElementWhenClickable(By.xpath(SELECT_AUTH)).click();
        getElementWhenVisible(By.id(SIDE_PANEL_AUTH_CONTAINER)).isDisplayed();

    }

    public void selectCSRF() {
        getElementWhenClickable(By.xpath(SELECT_CSRF)).click();
        getElementWhenVisible(By.id(SIDE_PANEL_CSRF_CONTAINER)).isDisplayed();

    }

    public void selectCookies() {
        getElementWhenClickable(By.xpath(SELECT_COOKIES)).click();
        getElementWhenVisible(By.id(SIDE_PANEL_COOKIES_CONTAINER)).isDisplayed();

    }

    public void selectCryptography() {
        getElementWhenClickable(By.xpath(SELECT_CRYPTOGRAPHY)).click();
        getElementWhenVisible(By.id(SIDE_PANEL_CRYPTOGRAPHY_CONTAINER)).isDisplayed();

    }

    public void selectDos() {
        getElementWhenClickable(By.xpath(SELECT_DOS)).click();
        getElementWhenVisible(By.id(SIDE_PANEL_DOS_CONTAINER)).isDisplayed();

    }

    public void selectFileAccess() {
        getElementWhenClickable(By.xpath(SELECT_FILE_ACCESS)).click();
        getElementWhenVisible(By.id(SIDE_PANEL_FILE_ACCESS_CONTAINER)).isDisplayed();

    }

    public void selectFirefoxOS() {
        getElementWhenClickable(By.xpath(SELECT_FIREFOX_OS)).click();
        getElementWhenVisible(By.id(SIDE_PANEL_FIREFOXOS_CONTAINER)).isDisplayed();

    }

    public void selectHTTP() {
        getElementWhenClickable(By.xpath(SELECT_HTTP)).click();
        getElementWhenVisible(By.id(SIDE_PANEL_HTTP_CONTAINER)).isDisplayed();

    }

    public void selectInputValidation() {
        getElementWhenClickable(By.xpath(SELECT_INPUT_VALIDATION)).click();
        getElementWhenVisible(By.id(SIDE_PANEL_INPUT_VALIDATION_CONTAINER)).isDisplayed();

    }

    public void selectInsecureStorage() {
        getElementWhenClickable(By.xpath(SELECT_INSECURE_STORAGE)).click();
        getElementWhenVisible(By.id(SIDE_PANEL_INSECURE_STORAGE_CONTAINER)).isDisplayed();

    }

    public void selectInsecureModules() {
        getElementWhenClickable(By.xpath(SELECT_INSECURE_MODULES)).click();
        getElementWhenVisible(By.id(SIDE_PANEL_INSECURE_CONTAINER)).isDisplayed();

    }

    public void selectOther() {
        getElementWhenClickable(By.xpath(SELECT_OTHER)).click();
        getElementWhenVisible(By.id(SIDE_PANEL_OTHER_CONTAINER)).isDisplayed();

    }

    public void selectRegex() {
        getElementWhenClickable(By.xpath(SELECT_REGEX)).click();
        getElementWhenVisible(By.id(SIDE_PANEL_REGEX_CONTAINER)).isDisplayed();

    }

    public void selectRoutes() {
        getElementWhenClickable(By.xpath(SELECT_ROUTES)).click();
        getElementWhenVisible(By.id(SIDE_PANEL_ROUTES_CONTAINER)).isDisplayed();

    }

    public void selectSqlInjection() {
        getElementWhenClickable(By.xpath(SELECT_SQL_INJECTION)).click();
        getElementWhenVisible(By.id(SIDE_PANEL_SQL_INJECTION_CONTAINER)).isDisplayed();

    }

    public void selectUnexpectedBehaviour() {
        getElementWhenClickable(By.xpath(SELECT_UNEXPECTED_BEHAVIOUR)).click();
        getElementWhenVisible(By.id(SIDE_PANEL_UNEXPECTED_BEHAVIOUR_CONTAINER)).isDisplayed();

    }

    public void selectXSS() {
        getElementWhenClickable(By.xpath(SELECT_XSS)).click();
        getElementWhenVisible(By.id(SIDE_PANEL_XSS_CONTAINER)).isDisplayed();

    }

}

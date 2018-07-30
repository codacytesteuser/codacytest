package pages;

import org.codacy.BasePage;
import org.codacy.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SideBar extends BasePage {
    private static final String NAVIGATION_SIDEBAR = "navigation-sidebar";
    private static final String SIDEBAR_DASHBOARD = "sidebar_dashboard";
    private static final String SIDEBAR_COMMITS = "sidebar_commits";
    private static final String SIDEBAR_FILES = "sidebar_files";
    private static final String SIDEBAR_ISSUES = "sidebar_issues";
    private static final String SIDEBAR_PULLREQUESTS = "sidebar_pullrequests";
    private static final String SIDEBAR_CODEPATTERNS = "sidebar_patterns";
    private static final String SIDEBAR_SETTINGS = "sidebar_settings";
    private static final String SIDEBAR_SECURITY = "sidebar_security";


    public SideBar(RemoteWebDriver driver, Environment env) {
        super(driver, env);
    }

    public void validateSideBar() {
        getElementWhenVisible(By.id(NAVIGATION_SIDEBAR)).isDisplayed();
        getElementWhenVisible(By.id(SIDEBAR_DASHBOARD)).isDisplayed();
        getElementWhenVisible(By.id(SIDEBAR_COMMITS)).isDisplayed();
        getElementWhenVisible(By.id(SIDEBAR_FILES)).isDisplayed();
        getElementWhenVisible(By.id(SIDEBAR_ISSUES)).isDisplayed();
        getElementWhenVisible(By.id(SIDEBAR_PULLREQUESTS)).isDisplayed();
        getElementWhenVisible(By.id(SIDEBAR_CODEPATTERNS)).isDisplayed();
        getElementWhenVisible(By.id(SIDEBAR_SETTINGS)).isDisplayed();

    }

    public void sideBarSelectDashboard() {
        getElementWhenVisible(By.id(SIDEBAR_DASHBOARD)).click();


    }

    public void sideBarSelectCommits() {
        getElementWhenVisible(By.id(SIDEBAR_COMMITS)).click();


    }

    public void sideBarSelectFiles() {
        getElementWhenVisible(By.id(SIDEBAR_FILES)).click();


    }

    public void sideBarSelectIssues() {
        getElementWhenVisible(By.id(SIDEBAR_ISSUES)).click();


    }

    public void sideBarSelectPullRequests() {
        getElementWhenVisible(By.id(SIDEBAR_PULLREQUESTS)).click();


    }

    public void sidebarSelectSecurity() {
        getElementWhenClickable(By.id(SIDEBAR_SECURITY)).click();


    }

    public void sideBarSelectCodePatterns() {
        getElementWhenVisible(By.id(SIDEBAR_CODEPATTERNS)).click();


    }

    public void sideBarSelectSettings() {
        getElementWhenVisible(By.id(SIDEBAR_SETTINGS)).click();


    }

}

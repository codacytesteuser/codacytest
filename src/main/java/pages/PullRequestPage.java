package pages;

import org.codacy.BasePage;
import org.codacy.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class PullRequestPage extends BasePage {
    private static final String PULL_REQUETS_HEADER = "dashboard_header";
    private static final String SELECT_DROPDOWN = "dropdown_toogle";
    private static final String SELECT_OPEN_PULL_REQUESTS = "//*[contains(text(),'Open Pull Requests ')]";
    private static final String SELECT_MERGED_PULL_REQUESTS = "//*[contains(text(),'Merged Pull Requests ')]";
    private static final String PULL_REQUETS_TABLE_CONTAINER = "pull_request_table";
    private static final String STATUS_COLUMN = "status_column";
    private static final String AUTHOR_COLUMN = "author_column";
    private static final String TITLE_COLUMN = "title_column";
    private static final String ORIGIN_COLUMN = "origin_column";
    private static final String TARGET_COLUMN = "target_column";
    private static final String UPDATED_COLUMN = "updated_column";
    private static final String ISSUES_COLUMN = "issues_column";
    private static final String TIME_TO_REVIEW_COLUMN = "timetoreview_column";
    private static final String SELECT_PULL_REQUEST = "//*[@id=\"pull_request_table\"]/div[2]/div[1]";
    private static final String INVITE_CONTAINER = "commit_status_banner_invite_container";
    private static final String INVITE_LINK = "//*[@class=\"typo__link js-invite-member\"]";
    private static final String COMMIT_DETAIL_CONTAINER = "//*[@class=\"box__container commit__container\"]";
    private static final String COMMIT_DETAIL = "//*[@class=\"commit-detail-action\"]";
    private static final String COMMIT_TIME = "commit_time";
    private static final String COMMIT_STATUS_CONTAINER = "commit_status_container";
    private static final String COMMIT_METRICS_CONTAINER = "commit_metrics";
    private static final String ALERT_MESSAGE = "alert_message";
    private static final String ISSUES_TOOLTIP = "issues_tooltip";
    private static final String DUPLICATION_TOOLTIP = "duplication_tooltip";
    private static final String COMPLEXITY_TOOLTIP = "complexity-tooltip";
    private static final String COVERAGE_TOOLTIP = "coverage_tooltip";
    private static final String NAV_BAR_NAVIGATION = "commit_details_tab";
    private static final String NEW_ISSUES_TAB = "new_issues_tab";
    private static final String NEW_ISSUES_CONTAINER = "newIssuesView";
    private static final String NEW_ISSUES_DETAIL = "new-file-issues-43570449";
    private static final String FIXED_ISSUES_TAB = "fixed_issues_tab";
    private static final String FIXED_ISSUES_CONTAINER = "fixedIssuesView";
    private static final String FIXED_ISSUES_DETAIL = "fixed-file-issues-42922716";
    private static final String HOTSPOTS_TAB = "hotspots_tab";
    private static final String HOTSPOTS_CONTAINER = "hotspotsView";
    private static final String HOTSPOTS_LIST = "hotspot-list";
    private static final String NEW_DUPLICATION_TAB = "new_duplication_tab";
    private static final String NEW_DUPLICATION_CONTAINER = "newClonesView";
    private static final String FIXED_DUPLICATION_TAB = "fixed_duplicaiton_tab";
    private static final String FIXED_DUPLICATION_CONTAINER = "fixedClonesView";
    private static final String FILES_TAB = "files_tab";
    private static final String FILES_CONTAINER = "filesView";
    private static final String FILES_DETAIL = "//*[@data-fileid=\"971481\"]";
    private static final String DIFF_TAB = "diffToggle";
    private static final String DIFF_CONTAINER = "commitDiff";
    private static final String DIFF_DETAIL = "d2h-550262";
    private static final String COMMITS_TAB = "commits_tab";
    private static final String COMMITS_CONTAINER = "commitsView";
    private static final String TIMETOCLOSE = "timetoclose";
    private static final String NO_NEW_ISSUES = "//*[contains(text(),'Woo! You don')]";
    private static final String NEW_ISSUES_DUPLICAITON = "//*[@data-target=\"#NewIssue-clone-delta-expand\"]";
    private static final String FIXED_DUPLICATION_DETAIL = "//*[@data-target=\"#FixedIssue-clone-delta-expand\"]";
    private static final String COMMIT_TABLE = "commit-table";
    private static final String NO_NEW_FIXED_ISSUES = "//*[contains(text(),'fix any issue!')]";
    private static final String NO_NEW_HOTSPOTS = "//*[contains(text(),'We could not find any hotspots')]";
    private static final String NO_NEW_FILES = "//*[contains(text(),'Oops. ')]";
    private static final String NO_NEW_COMMITS = "//*[contains(text(),'Oops! No commits!')]";


    public PullRequestPage(RemoteWebDriver driver, Environment env) {
        super(driver, env);
    }

    public void selectOpenPullRequetsDropdown() {
        getElementWhenVisible(By.id(PULL_REQUETS_HEADER)).isDisplayed();
        getElementWhenVisible(By.id(SELECT_DROPDOWN)).click();
        getElementWhenClickable(By.xpath(SELECT_OPEN_PULL_REQUESTS)).click();
    }

    public void selectMergePullRequetsDropdown() {
        getElementWhenVisible(By.id(PULL_REQUETS_HEADER)).isDisplayed();
        getElementWhenVisible(By.id(SELECT_DROPDOWN)).click();
        getElementWhenClickable(By.xpath(SELECT_MERGED_PULL_REQUESTS)).click();

    }

    public void validatePullOpenRequestsTable() {

        getElementWhenVisible(By.id(PULL_REQUETS_TABLE_CONTAINER)).isDisplayed();
        getElementWhenVisible(By.id(STATUS_COLUMN)).isDisplayed();
        getElementWhenVisible(By.id(AUTHOR_COLUMN)).isDisplayed();
        getElementWhenVisible(By.id(TITLE_COLUMN)).isDisplayed();
        getElementWhenVisible(By.id(ORIGIN_COLUMN)).isDisplayed();
        getElementWhenVisible(By.id(TARGET_COLUMN)).isDisplayed();
        getElementWhenVisible(By.id(UPDATED_COLUMN)).isDisplayed();
        getElementWhenVisible(By.id(ISSUES_COLUMN)).isDisplayed();
        getElementWhenVisible(By.id(TIME_TO_REVIEW_COLUMN)).isDisplayed();

    }

    public void validatePullMergedRequestsTable() {
        getElementWhenVisible(By.id(PULL_REQUETS_TABLE_CONTAINER)).isDisplayed();
        getElementWhenVisible(By.id(STATUS_COLUMN)).isDisplayed();
        getElementWhenVisible(By.id(AUTHOR_COLUMN)).isDisplayed();
        getElementWhenVisible(By.id(TITLE_COLUMN)).isDisplayed();
        getElementWhenVisible(By.id(ORIGIN_COLUMN)).isDisplayed();
        getElementWhenVisible(By.id(TARGET_COLUMN)).isDisplayed();
        getElementWhenVisible(By.id(UPDATED_COLUMN)).isDisplayed();
        getElementWhenVisible(By.id(ISSUES_COLUMN)).isDisplayed();
        getElementWhenVisible(By.id(TIMETOCLOSE)).isDisplayed();

    }

    public void selectMergedPullRequet() {
        getElementWhenClickable(By.xpath(SELECT_PULL_REQUEST)).click();

    }

    public void validateInviteContainerDetails() {

        getElementWhenVisible(By.id(INVITE_CONTAINER)).isDisplayed();
        getElementWhenVisible(By.xpath(INVITE_LINK)).isDisplayed();

    }


    public void validateCommitDetail() {
        getElementWhenVisible(By.xpath(COMMIT_DETAIL_CONTAINER)).isDisplayed();
        getElementWhenVisible(By.xpath(COMMIT_DETAIL)).isDisplayed();
        getElementWhenVisible(By.id(COMMIT_TIME)).isDisplayed();
        getElementWhenVisible(By.id(COMMIT_STATUS_CONTAINER)).isDisplayed();
    }

    public void validateCommitMetricsDetails() {
        getElementWhenVisible(By.id(COMMIT_METRICS_CONTAINER)).isDisplayed();
        getElementWhenVisible(By.id(ALERT_MESSAGE)).isDisplayed();
        getElementWhenVisible(By.id(ISSUES_TOOLTIP)).isDisplayed();
        getElementWhenVisible(By.id(DUPLICATION_TOOLTIP)).isDisplayed();
        getElementWhenVisible(By.id(COMPLEXITY_TOOLTIP)).isDisplayed();
        getElementWhenVisible(By.id(COVERAGE_TOOLTIP)).isDisplayed();
    }

    public void validateNewIssuesDetails() {
        getElementWhenVisible(By.id(NAV_BAR_NAVIGATION)).isDisplayed();
        getElementWhenClickable(By.id(NEW_ISSUES_TAB)).click();
        getElementWhenVisible(By.id(NEW_ISSUES_CONTAINER)).isDisplayed();
        if (driver.findElements(By.id(NEW_ISSUES_DETAIL)).size() != 0)
        {
            getElementWhenVisible(By.id(NEW_ISSUES_DETAIL)).isDisplayed();

        } else
            {
            getElementWhenVisible(By.xpath(NO_NEW_ISSUES)).isDisplayed();

        }


        /*    try {
            getElementWhenVisible(By.id(NEW_ISSUES_DETAIL)).isDisplayed();

        } catch (Exception e) {
        } */

    }

    public void validateFixedIssuesDetails() {
        getElementWhenClickable(By.id(FIXED_ISSUES_TAB)).click();
        getElementWhenVisible(By.id(FIXED_ISSUES_CONTAINER)).isDisplayed();
        if (driver.findElements(By.id(FIXED_ISSUES_DETAIL)).size() != 0)
        {
            getElementWhenVisible(By.id(FIXED_ISSUES_DETAIL)).isDisplayed();

        }else
        {
            getElementWhenVisible(By.xpath(NO_NEW_FIXED_ISSUES)).isDisplayed();

        }


       /*     try {
            getElementWhenVisible(By.id(FIXED_ISSUES_DETAIL)).isDisplayed();

        } catch (Exception e) {
            getElementWhenVisible(By.xpath(NO_NEW_FIXED_ISSUES)).isDisplayed();

        } */


    }

    public void validateHotspotsDetails() {
        getElementWhenClickable(By.id(HOTSPOTS_TAB)).click();
        getElementWhenVisible(By.id(HOTSPOTS_CONTAINER)).isDisplayed();

        if (driver.findElements(By.id(HOTSPOTS_LIST)).size() != 0) {
            getElementWhenVisible(By.id(HOTSPOTS_LIST)).isDisplayed();

        } else {
            getElementWhenVisible(By.xpath(NO_NEW_HOTSPOTS)).isDisplayed();

        }

         /*   try {
            getElementWhenVisible(By.id(HOTSPOTS_LIST)).isDisplayed();

        } catch (Exception e) {

                getElementWhenVisible(By.xpath(NO_NEW_HOTSPOTS)).isDisplayed();

        } */
    }

    public void validateNewDuplicationDetails() {
        getElementWhenClickable(By.id(NEW_DUPLICATION_TAB)).click();
        getElementWhenVisible(By.id(NEW_DUPLICATION_CONTAINER)).isDisplayed();

    }

    public void validateFixedDuplicationDetails() {
        getElementWhenClickable(By.id(FIXED_DUPLICATION_TAB)).click();
        getElementWhenVisible(By.id(FIXED_DUPLICATION_CONTAINER)).isDisplayed();


    }

    public void validateFilesDetails() {
        getElementWhenClickable(By.id(FILES_TAB)).click();
        getElementWhenVisible(By.id(FILES_CONTAINER)).isDisplayed();

    }

    public void validateDiffDetails() {

        getElementWhenClickable(By.id(DIFF_TAB)).click();
        getElementWhenVisible(By.id(DIFF_CONTAINER)).isDisplayed();

    }


    public void validateCommitsDetails() {
        getElementWhenClickable(By.id(COMMITS_TAB)).click();
        getElementWhenVisible(By.id(COMMITS_CONTAINER)).isDisplayed();

        if (driver.findElements(By.id(COMMIT_TABLE)).size() != 0) {
            getElementWhenVisible(By.id(COMMIT_TABLE)).isDisplayed();

        } else {
            getElementWhenVisible(By.xpath(NO_NEW_COMMITS)).isDisplayed();

        }

     /*   try {
            getElementWhenVisible(By.id(COMMIT_TABLE)).isDisplayed();

        } catch (Exception e) {
            getElementWhenVisible(By.xpath(NO_NEW_COMMITS)).isDisplayed();

        } */
    }

}

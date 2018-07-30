package pages;

import org.codacy.BasePage;
import org.codacy.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Dashboard extends BasePage {
    private static final String DASHBOARD_HEADER = "dashboard_header";
    private static final String DASHBOARD_BRANCH = "dropdown-branch-name";
    private static final String DASHBOARD_SWITCH = "//*[@class=\"switch_dash\"]";
    private static final String CERTIFICATIONTITLE = "certification_title";
    private static final String CERTIFICATION_CONTAINER = "project_certification";
    private static final String CODE_STYLE = "//*[@data-name=\"Code Style\"]";
    private static final String ERROR_PRONE = "Error Prone";
    private static final String SECURITY = "Security";
    private static final String COMPATIBILITY = "Compatibility";
    private static final String PERFORMANCE_GRAPH = "Performance";
    private static final String UNUSED_CODE = "Unused Code";
    private static final String ISSUESBREAKDOWN_TITLE = "dashboard_title_issues";
    private static final String ISSUESBREAKDOWN_CONTAINER = "dashboard_issues";
    private static final String COVERAGE_TITLE = "dashboard_title_coverage";
    private static final String COVERAGE_CONTAINER = "dashboard_coverage";
    private static final String PULLREQUESTS_TITLE = "//*[contains(text(),'Open Pull')]";
    private static final String PULLREQUESTS_CONTAINER = "//*[@class=\"col-xs-6 pullRequestList\"]";
    private static final String CHARTS_CONTAINER = "charts-container";
    private static final String CHARTS_TAB_ISSUES = "minitab_issues";
    private static final String CHARTS_TAB_SEVERITY = "minitab_severity";
    private static final String CHARTS_TAB_CHURN = "minitab_churn_complexity";
    private static final String CHARTS_TAB_COVERAGE = "minitab_coverage";
    private static final String HISTORY_MAIN_GRAPH = "dashboard-container";
    private static final String TAB_ISSUE = "issue-chart-tab";
    private static final String TAB_COMPLEX_FILES = "complexity-chart-tab";
    private static final String TAB_DUPLICATED_CODE = "duplication-chart-tab";
    private static final String TAB_COVERAGE = "coverage-chart-tab";
    private static final String FOOTER_GRAPH_DATE = "dash-issues-date-title";
    private static final String FOOTER_GRAPH_TOTALISSUES = "dash-issues-total-value";
    private static final String FOOTER_GRAPH_TOTAL_LOC = "dash-issues-loc-value";
    private static final String ISSUES_LIST_CONTAINER = "issues_breakdown_container";
    private static final String ISSUES_LIST_SECURITY = "Security";
    private static final String ISSUES_LIST_ERROR_PRONE = "ErrorProne";
    private static final String ISSUES_LIST_CODE_STYLE = "CodeStyle";
    private static final String ISSUES_LIST_COMPATIBILITY = "Compatibility";
    private static final String ISSUES_LIST_UNUSED_CODE = "UnusedCode";
    private static final String ISSUES_LIST_PERFORMANCE = "Performance";
    private static final String LINES_OF_CODE_CONTAINER = "sidebar_chart_lines_of_code";
    private static final String TECHNICAL_DEBT_CONTAINER = "sidebar_chart_technical_debt";
    private static final String CODE_DASHBOARD = "//*[contains(text(),'Code dashboard')]";


    public Dashboard(RemoteWebDriver driver, Environment env) {
        super(driver, env);
    }


    public void projectContentHeader() {

        getElementWhenVisible(By.id(DASHBOARD_HEADER)).isDisplayed();
        getElementWhenVisible(By.id(DASHBOARD_BRANCH)).click();
        getElementWhenVisible(By.xpath(DASHBOARD_SWITCH)).isDisplayed();
    }

    public void selectHistoryDashboard() {

        try {
            getElementWhenVisible(By.xpath(CODE_DASHBOARD)).isDisplayed();
            getElementWhenVisible(By.xpath(DASHBOARD_SWITCH)).click();
        }catch (Exception e){
            System.out.println("History Dashboard");
        }



    }

    public void selectCodeDashboard() {

        getElementWhenVisible(By.xpath(DASHBOARD_SWITCH)).click();

    }

    public void projectCertificationContainer() {

        getElementWhenVisible(By.id(CERTIFICATIONTITLE)).isDisplayed();
        getElementWhenVisible(By.id(CERTIFICATION_CONTAINER)).isDisplayed();
        getElementWhenVisible(By.xpath(CODE_STYLE)).isDisplayed();
        getElementWhenVisible(By.id(ERROR_PRONE)).isDisplayed();
        getElementWhenVisible(By.id(SECURITY)).isDisplayed();
        getElementWhenVisible(By.id(COMPATIBILITY)).isDisplayed();
        getElementWhenVisible(By.id(PERFORMANCE_GRAPH)).isDisplayed();
        getElementWhenVisible(By.id(UNUSED_CODE)).isDisplayed();

    }

    public void IssuesBreakDownContainer() {

        getElementWhenVisible(By.id(ISSUESBREAKDOWN_TITLE)).isDisplayed();
        getElementWhenVisible(By.id(ISSUESBREAKDOWN_CONTAINER)).isDisplayed();

    }

    public void coverageContainer() {

        getElementWhenVisible(By.id(COVERAGE_TITLE)).isDisplayed();
        getElementWhenVisible(By.id(COVERAGE_CONTAINER)).isDisplayed();

    }

    public void openPullRequestsContainer() {
        getElementWhenVisible(By.xpath(PULLREQUESTS_TITLE)).isDisplayed();
        getElementWhenVisible(By.xpath(PULLREQUESTS_CONTAINER)).isDisplayed();

    }

    public void chartsContainer() {

        getElementWhenVisible(By.id(CHARTS_CONTAINER)).isDisplayed();
        getElementWhenVisible(By.id(CHARTS_TAB_ISSUES)).isDisplayed();
        getElementWhenVisible(By.id(CHARTS_TAB_SEVERITY)).isDisplayed();
        getElementWhenVisible(By.id(CHARTS_TAB_CHURN)).isDisplayed();
        getElementWhenVisible(By.id(CHARTS_TAB_COVERAGE)).isDisplayed();


    }


    public void dashboardHistoryMainGraph() {

        getElementWhenVisible(By.id(HISTORY_MAIN_GRAPH)).isDisplayed();
        getElementWhenVisible(By.id(TAB_ISSUE)).isDisplayed();
        getElementWhenVisible(By.id(TAB_COMPLEX_FILES)).isDisplayed();
        getElementWhenVisible(By.id(TAB_DUPLICATED_CODE)).isDisplayed();
        getElementWhenVisible(By.id(TAB_COVERAGE)).isDisplayed();
        getElementWhenVisible(By.id(FOOTER_GRAPH_DATE)).isDisplayed();
        getElementWhenVisible(By.id(FOOTER_GRAPH_TOTALISSUES)).isDisplayed();
        getElementWhenVisible(By.id(FOOTER_GRAPH_TOTAL_LOC)).isDisplayed();

    }

    public void dashboardHistoryIssuesList() {

        getElementWhenVisible(By.id(ISSUES_LIST_CONTAINER)).isDisplayed();
        getElementWhenVisible(By.id(ISSUES_LIST_SECURITY)).isDisplayed();
        getElementWhenVisible(By.id(ISSUES_LIST_ERROR_PRONE)).isDisplayed();
        getElementWhenVisible(By.id(ISSUES_LIST_CODE_STYLE)).isDisplayed();
        getElementWhenVisible(By.id(ISSUES_LIST_COMPATIBILITY)).isDisplayed();
        getElementWhenVisible(By.id(ISSUES_LIST_UNUSED_CODE)).isDisplayed();
        getElementWhenVisible(By.id(ISSUES_LIST_PERFORMANCE)).isDisplayed();
    }

    public void dashboardHistorysideBarLinesofCode() {

        getElementWhenVisible(By.id(LINES_OF_CODE_CONTAINER)).isDisplayed();
    }

    public void dashboardHistorysideBarTechnicalDebt() {
        getElementWhenVisible(By.id(TECHNICAL_DEBT_CONTAINER)).isDisplayed();

    }

}

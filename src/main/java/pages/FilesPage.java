package pages;

import com.sun.jna.platform.win32.WinNT;
import org.codacy.BasePage;
import org.codacy.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.javaScriptThrowsNoExceptions;
import static org.openqa.selenium.support.ui.ExpectedConditions.refreshed;

public class FilesPage extends BasePage {
    private static final String IGNORE_FILE_BTN = "ignore_file_btn";
    private static final String CANCEL_BTN = "cancel_btn";
    private static final String CONFIRM_BTN = "ignore_confirm_btn";
    private static final String NO_DATA = "no_data";
    private static final String SEARCH_FILE_TXT = "file-search-txt";
    private static final String FILES_TABLE = "js-files-table";
    private static final String VALIDATE_FILE_SEARCH = "//*[contains(text(),'package.json')]";
    private static final String GRADE_COLUMN = "Grade";
    private static final String FILENAME_COLUMN = "Filename";
    private static final String ISSUES_COLUMN = "Issues";
    private static final String DUPLICATION_COLUMN = "Duplication";
    private static final String COMPLEXITY_COLUMN = "Complexity";
    private static final String FILE_HEADER_CONTAINER = "file_header";
    private static final String BITBUCKET_LINK = "//*[contains(text(),'View on Bitbucket')]";
    private static final String FILE_STATISTIC_TABLE = "file_statistic_table";
    private static final String STATISTIC_TABLE_SIZE_TITLE = "size";
    private static final String STATISTIC_LINES_OF_CODE = "lines_of_code";
    private static final String STATISTIC_SOURCE_LINES = "source_lines_code";
    private static final String STATISTIC_COMMENTED_LINES_OF_CODE = "commented_lines_of_code";
    private static final String STATISTIC_TABLE_STRUCTURE_TITLE = "structure";
    private static final String STATISTIC_NUMBER_OF_METHODS = "number_of_methods";
    private static final String STATISTIC_SLOC_METHOD = "sloc_method";
    private static final String STATISTIC_TABLE_COMPLEXITY_TITLE = "complexity_title";
    private static final String STATISTIC_COMPLEXITY = "complexity";
    private static final String STATISTIC_COMPLEXITY_METHOD = "complexity_method";
    private static final String STATISTIC_CHURN = "churn";
    private static final String STATISTIC_DUPLICATION_TITLE = "duplication";
    private static final String STATISTIC_NUMBER_OF_CLONES = "number_of_clones";
    private static final String STATISTIC_DUPLICATED_LINES_OF_CODE = "duplicated_lines_of_code";
    private static final String ISSUES_VIEW_DETAIL = "issuesView";
    private static final String TABLE_LINES_OF_CODE = "fileNumbers";
    private static final String SOURCE_CODE = "sourceCode";


    public FilesPage(RemoteWebDriver driver, Environment env) {
        super(driver, env);
    }


    public void validateFileSearch() throws InterruptedException {
        getElementWhenVisible(By.id(SEARCH_FILE_TXT)).isDisplayed();
        getElementWhenVisible(By.id(SEARCH_FILE_TXT)).click();
        getElementWhenVisible(By.id(SEARCH_FILE_TXT)).sendKeys("sdfsdsdfsdfsdf");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //getElementWhenElementIsStale(By.id(NO_DATA)).isDisplayed();
        retryingStaleElement(By.id(NO_DATA));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("no_data")));
        Thread.sleep(1000);
        getElementWhenVisible(By.id(NO_DATA)).isDisplayed();
        getElementWhenVisible(By.id(SEARCH_FILE_TXT)).clear();
        getElementWhenVisible(By.id(SEARCH_FILE_TXT)).click();
        getElementWhenVisible(By.id(SEARCH_FILE_TXT)).sendKeys("package");
        getElementWhenVisible(By.id(SEARCH_FILE_TXT)).click();
        Thread.sleep(1000);
        retryingStaleElement(By.xpath(VALIDATE_FILE_SEARCH));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("no_data")));
        getElementWhenVisible(By.xpath(VALIDATE_FILE_SEARCH)).isDisplayed();

    }

    public void validateFileTable() {
        getElementWhenVisible(By.id(FILES_TABLE)).isDisplayed();
        getElementWhenVisible(By.id(GRADE_COLUMN)).isDisplayed();
        getElementWhenVisible(By.id(FILENAME_COLUMN)).isDisplayed();
        getElementWhenVisible(By.id(ISSUES_COLUMN)).isDisplayed();
        getElementWhenVisible(By.id(DUPLICATION_COLUMN)).isDisplayed();
        getElementWhenVisible(By.id(COMPLEXITY_COLUMN)).isDisplayed();
    }

    public void selectFile() {
        getElementWhenClickable(By.xpath(VALIDATE_FILE_SEARCH)).click();

    }

    public void detailFileHeader() {
        getElementWhenVisible(By.id(FILE_HEADER_CONTAINER)).isDisplayed();
        getElementWhenVisible(By.xpath(BITBUCKET_LINK)).isDisplayed();

    }

    public void detailFileValidateIgnoreFileButton() {
        getElementWhenVisible(By.id(IGNORE_FILE_BTN)).isDisplayed();
        getElementWhenVisible(By.id(IGNORE_FILE_BTN)).click();
        getElementWhenVisible(By.id(CANCEL_BTN)).isDisplayed();
        getElementWhenVisible(By.id(CONFIRM_BTN)).isDisplayed();
        getElementWhenVisible(By.id(CANCEL_BTN)).click();
    }

    public void detailFileTableStatistic() {
        getElementWhenVisible(By.id(FILE_STATISTIC_TABLE)).isDisplayed();
        getElementWhenVisible(By.id(STATISTIC_TABLE_SIZE_TITLE)).isDisplayed();
        getElementWhenVisible(By.id(STATISTIC_LINES_OF_CODE)).isDisplayed();
        getElementWhenVisible(By.id(STATISTIC_SOURCE_LINES)).isDisplayed();
        getElementWhenVisible(By.id(STATISTIC_COMMENTED_LINES_OF_CODE)).isDisplayed();
        getElementWhenVisible(By.id(STATISTIC_TABLE_STRUCTURE_TITLE)).isDisplayed();
        getElementWhenVisible(By.id(STATISTIC_NUMBER_OF_METHODS)).isDisplayed();
        getElementWhenVisible(By.id(STATISTIC_SLOC_METHOD)).isDisplayed();
        getElementWhenVisible(By.id(STATISTIC_TABLE_COMPLEXITY_TITLE)).isDisplayed();
        getElementWhenVisible(By.id(STATISTIC_COMPLEXITY)).isDisplayed();
        getElementWhenVisible(By.id(STATISTIC_COMPLEXITY_METHOD)).isDisplayed();
        getElementWhenVisible(By.id(STATISTIC_CHURN)).isDisplayed();
        getElementWhenVisible(By.id(STATISTIC_DUPLICATION_TITLE)).isDisplayed();
        getElementWhenVisible(By.id(STATISTIC_NUMBER_OF_CLONES)).isDisplayed();
        getElementWhenVisible(By.id(STATISTIC_DUPLICATED_LINES_OF_CODE)).isDisplayed();

    }


    public void detailvalidateFileSourceView() {
        getElementWhenVisible(By.id(ISSUES_VIEW_DETAIL)).isDisplayed();
        getElementWhenVisible(By.id(TABLE_LINES_OF_CODE)).isDisplayed();
        getElementWhenVisible(By.id(SOURCE_CODE)).isDisplayed();

    }


}

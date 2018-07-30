package pages;

import com.sun.jna.platform.win32.GDI32;
import com.sun.jna.platform.win32.WinNT;
import org.codacy.BasePage;
import org.codacy.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import sun.util.resources.cldr.en.CalendarData_en_AS;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class Homepage extends BasePage {


    private static final String NAVBAR_LOGO = "navbar_icon";
    private static final String NAVBAR = "navbar";
    private static final String NAVBAR_PRODUCT_LINK = "product_link";
    private static final String NAVBAR_PRICING_LINK = "pricing_link";
    private static final String NAVBAR_ENTERPRISE_LINK = "enterprise_link";
    private static final String NAVBAR_BLOG_LINK = "blog_link";
    private static final String NAVBAR_LOGIN_LINK = "login_link";
    private static final String NAVBAR_TRY_FOR_FREE_LINK = "try_for_free_link";
    private static final String FOOTER_PRODUCT_LIST = "footer_product_list";
    private static final String FOOTER_PRODUCT_LINK = "footer_product_link";
    private static final String FOOTER_RESOURCES_LINK = "footer_resources_link";
    private static final String FOOTER_WHYCODACY_LINK = "footer_whycodacy_link";
    private static final String FOOTER_CUSTOMERS_LINK = "footer_customers_link";
    private static final String FOOTER_PRINCING_LINK = "footer_pricing_link";
    private static final String FOOTER_ENTERPRISE_LINK = "footer_enterprise_link";
    private static final String FOOTER_COMPANY_LIST = "footer_company_list";
    private static final String FOOTER_ABOUTUS_LINK = "footer_aboutus_link";
    private static final String FOOTER_CAREERS_LINK = "footer_careers_link";
    private static final String FOOTER_SECURITY_LINK = "footer_security_link";
    private static final String FOOTER_OPENSOURCE_LINK = "footer_opensource_link";
    private static final String FOOTER_BLOG_LINK = "footer_blog_link";
    private static final String FOOTER_HELP_LIST = "footer_help_list";
    private static final String FOOTER_DOCUMENTATION_LINK = "footer_documentation_link";
    private static final String FOOTER_GETTINGSTARTED_LINK = "footer_gettingstarted_link";
    private static final String FOOTER_REQUESTADEMO_LINK = "footer_requestademo_link";
    private static final String FOOTER_PRIVACY_POLICY = "footer_privacypolicy_link";
    private static final String FOOTER_TERMSANDCONDITIONS = "footer_termsandconditions_link";
    private static final String FOOTER_GETINTOUCH_LIST = "footer_getintouch_list";
    private static final String FOOTER_CONTACTUS_LINK = "footer_contacus_link";
    private static final String FOOTER_TWITTER_LINK = "footer_twitter_link";
    private static final String FOOTER_FACEBOOK_LINK = "footer_facebook_link";
    private static final String FOOTER_GITHUB_LINK = "footer_github_link";
    private static final String SINGUP_WITH_GITHUB_BTN = "signup-github-button";
    private static final String SIGNUP_WITH_DIFF_ACCOUNT_BTN = "signup-diff-acc";
    private static final String AND_MORE_LINK = "//*[@href=\"/product#features-languages\"]";
    private static final String LOVEBY_DEVELOPERS_CONTAINER = "loved-by-developers";
    private static final String SAVE_TIME_CODE_REVIEWS_CONTAINER = "save-time-code-review";
    private static final String LEARN_MORE_BTN = "//*[@href=\"/product#features-languages\"]";
    private static final String INTEGRATED_WORKFLOW_CONTAINER = "integrated-workflow";
    private static final String SEE_ALL_FEATURES_BTN = "//*[contains(text(),'See all Features and Integrations')]";
    private static final String TRACK_PROJECT_QUALITY_CONTAINER = "track-project-quality";
    private static final String LEARN_MORE_BTN_QUALITY_CONTAINER = "//*[@id='learn_more_btn_track_project_evolution'] | //*[@id='learn_more_btn_track_project_evolution']";
    private static final String CUSTOMERS_FEEDBACK_CONTAINER = "customers-feedback";
    private static final String READ_MORE_LINK = "read_more_btn_customers_feedback";
    private static final String SIGNUP_FOOTER_CONTAINER = "sing_up_footer_container";
    private static final String SIGNUP_WITH_BITBUCKET_BTN = "login_bitbucket";
    private static final String SIGNUP_WITH_GITHUB_BTN = "login_github";
    private static final String SIGNUP_WITH_GOOGLE_BTN = "login_google";
    private static final String REQUEST_DEMO_BTN = "request_demo";



    public Homepage(RemoteWebDriver driver, Environment env) {
        super(driver, env);
    }


    public void validateNavBar() throws Exception {

        getElementWhenVisible(By.id(NAVBAR_LOGO)).isDisplayed();
        getElementWhenVisible(By.id(NAVBAR)).isDisplayed();
        getElementWhenVisible(By.id(NAVBAR_PRODUCT_LINK)).isDisplayed();
        getElementWhenVisible(By.id(NAVBAR_PRICING_LINK)).isDisplayed();
        getElementWhenVisible(By.id(NAVBAR_ENTERPRISE_LINK)).isDisplayed();
        getElementWhenVisible(By.id(NAVBAR_BLOG_LINK)).isDisplayed();
        getElementWhenVisible(By.id(NAVBAR_LOGIN_LINK)).isDisplayed();
        getElementWhenVisible(By.id(NAVBAR_TRY_FOR_FREE_LINK)).isDisplayed();
    }

    public void validatefooter() throws Exception {

        getElementWhenVisible(By.id(FOOTER_PRODUCT_LIST)).isDisplayed();
        getElementWhenVisible(By.id(FOOTER_PRODUCT_LINK)).isDisplayed();
        getElementWhenVisible(By.id(FOOTER_RESOURCES_LINK)).isDisplayed();
        getElementWhenVisible(By.id(FOOTER_WHYCODACY_LINK)).isDisplayed();
        getElementWhenVisible(By.id(FOOTER_CUSTOMERS_LINK)).isDisplayed();
        getElementWhenVisible(By.id(FOOTER_PRINCING_LINK)).isDisplayed();
        getElementWhenVisible(By.id(FOOTER_ENTERPRISE_LINK)).isDisplayed();
        getElementWhenVisible(By.id(FOOTER_COMPANY_LIST)).isDisplayed();
        getElementWhenVisible(By.id(FOOTER_ABOUTUS_LINK)).isDisplayed();
        getElementWhenVisible(By.id(FOOTER_CAREERS_LINK)).isDisplayed();
        getElementWhenVisible(By.id(FOOTER_SECURITY_LINK)).isDisplayed();
        getElementWhenVisible(By.id(FOOTER_BLOG_LINK)).isDisplayed();
        getElementWhenVisible(By.id(FOOTER_OPENSOURCE_LINK)).isDisplayed();
        getElementWhenVisible(By.id(FOOTER_HELP_LIST)).isDisplayed();
        getElementWhenVisible(By.id(FOOTER_DOCUMENTATION_LINK)).isDisplayed();
        getElementWhenVisible(By.id(FOOTER_GETTINGSTARTED_LINK)).isDisplayed();
        getElementWhenVisible(By.id(FOOTER_REQUESTADEMO_LINK)).isDisplayed();
        getElementWhenVisible(By.id(FOOTER_PRIVACY_POLICY)).isDisplayed();
        getElementWhenVisible(By.id(FOOTER_TERMSANDCONDITIONS)).isDisplayed();
        getElementWhenVisible(By.id(FOOTER_GETINTOUCH_LIST)).isDisplayed();
        getElementWhenVisible(By.id(FOOTER_CONTACTUS_LINK)).isDisplayed();
        getElementWhenVisible(By.id(FOOTER_TWITTER_LINK)).isDisplayed();
        getElementWhenVisible(By.id(FOOTER_FACEBOOK_LINK)).isDisplayed();
        getElementWhenVisible(By.id(FOOTER_GITHUB_LINK)).isDisplayed();
    }

    public void validateHomecontainer() throws Exception {
        getElementWhenVisible(By.id(SINGUP_WITH_GITHUB_BTN)).isDisplayed();
        getElementWhenVisible(By.id(SIGNUP_WITH_DIFF_ACCOUNT_BTN)).isDisplayed();
        getElementWhenVisible(By.xpath(AND_MORE_LINK)).isDisplayed();

    }

    public void lovebyDevelopersContainer() throws Exception {
        getElementWhenVisible(By.id(LOVEBY_DEVELOPERS_CONTAINER)).isDisplayed();

    }

    public void saveTimeCodeReview() {
        getElementWhenVisible(By.id(SAVE_TIME_CODE_REVIEWS_CONTAINER)).isDisplayed();
        getElementWhenVisible(By.xpath(LEARN_MORE_BTN)).isDisplayed();

    }

    public void integratedYourWOrkflow() {
        getElementWhenVisible(By.id(INTEGRATED_WORKFLOW_CONTAINER)).isDisplayed();
        getElementWhenVisible(By.xpath(SEE_ALL_FEATURES_BTN)).isDisplayed();

    }


    public void trackProjectQuality(){
        getElementWhenVisible(By.id(TRACK_PROJECT_QUALITY_CONTAINER)).isDisplayed();
//        getElementWhenVisible(By.id(LEARN_MORE_BTN_QUALITY_CONTAINER)).isDisplayed(); VALIDAR PQ ESTE ID ESTÁ SP A MUDAR

    }

    public void customersFeedback() {

        getElementWhenVisible(By.id(CUSTOMERS_FEEDBACK_CONTAINER)).isDisplayed();
    }

    public void singUpFooterContainer() {

        getElementWhenVisible(By.id(SIGNUP_FOOTER_CONTAINER)).isDisplayed();
        getElementWhenVisible(By.id(SIGNUP_WITH_BITBUCKET_BTN)).isDisplayed();
        getElementWhenVisible(By.id(SIGNUP_WITH_GITHUB_BTN)).isDisplayed();
        getElementWhenVisible(By.id(SIGNUP_WITH_GOOGLE_BTN)).isDisplayed();
        getElementWhenVisible(By.id(REQUEST_DEMO_BTN)).isDisplayed();
    }

    public void selectTryForFree () {
        getElementWhenVisible(By.id(NAVBAR)).isDisplayed();
        getElementWhenVisible(By.id(NAVBAR_TRY_FOR_FREE_LINK)).isDisplayed();
        getElementWhenVisible(By.id(NAVBAR_TRY_FOR_FREE_LINK)).click();
    }

}


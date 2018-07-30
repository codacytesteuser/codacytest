package pages;

import org.codacy.BasePage;
import org.codacy.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SignUpPage extends BasePage {

    private static final String SIGNUP_BITBUCKET_BTN = "login_bitbucket_btn";
    private static final String SIGNUP_GITHUB_BTN = "login_github_btn";
    private static final String SIGNUP_GOOGLE_BTN = "login_google_btn";
    private static final String VALIDATE_BITBUCKET_PAGE = "login-form";
    private static final String VALITE_GITHUBPAGE ="login_field" ;
    private static final String VALIDATE_GOOGLEPAGE = "identifierId";


    public SignUpPage(RemoteWebDriver driver, Environment env) {
        super(driver, env);
    }

    public void ValidateSingupPage (){

        getElementWhenVisible(By.id(SIGNUP_BITBUCKET_BTN)).isDisplayed();
        getElementWhenVisible(By.id(SIGNUP_GITHUB_BTN)).isDisplayed();
        getElementWhenVisible(By.id(SIGNUP_GOOGLE_BTN)).isDisplayed();
    }
    
    public  void selectSignUpBitbucket() {
        getElementWhenVisible(By.id(SIGNUP_BITBUCKET_BTN)).isDisplayed();
        getElementWhenVisible(By.id(SIGNUP_BITBUCKET_BTN)).click();
        getElementWhenVisible(By.id(VALIDATE_BITBUCKET_PAGE)).isDisplayed();
    }
    
    public void selectSignUpGithub(){
        getElementWhenVisible(By.id(SIGNUP_GITHUB_BTN)).isDisplayed();
        getElementWhenVisible(By.id(SIGNUP_GITHUB_BTN)).click();
        getElementWhenVisible(By.id(VALITE_GITHUBPAGE)).isDisplayed();


    }
    
    public void selectSignUpGoogle(){
        getElementWhenVisible(By.id(SIGNUP_GOOGLE_BTN)).isDisplayed();
        getElementWhenVisible(By.id(SIGNUP_GOOGLE_BTN)).click();
        getElementWhenVisible(By.id(VALIDATE_GOOGLEPAGE)).isDisplayed();


    }
}

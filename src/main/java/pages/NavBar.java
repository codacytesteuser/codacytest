package pages;

import org.codacy.BasePage;
import org.codacy.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NavBar extends BasePage {
    private static final String NAVBAR_ICON = "navbar_codacylogo";
    private static final String NAVBAR_DROPDOWN_ORGANIZATION = "dropdown-organization-name";
    private static final String NAVBAR_DROPDOWN_MENU = "navbar_dropdownmenu";
    private static final String NAVBAR_ORGANIZATION = "qateste";
    private static final String NAVBAR_DOCS = "navbar_docs";
    private static final String NAVBAR_ACCOOUNT = "account-dropdown" ;
    private static final String NAVBAR_SELECT_QA_ORGANIZATION = "qateste";
    private static final String MENU_YOUR_ACCOUNT = "menu_youraccount";
    private static final String MENU_ORGANIZATIONS = "menu_organizations";
    private static final String MENU_FEEDBACK = "menu_feedback";
    private static final String MENU_STATUS ="menu_status" ;
    private static final String MENU_BLOG = "menu_blog";
    private static final String MENU_TERMS_OF_SERVICE = "menu_termsofservice";
    private static final String MENU_SIGN_OUT = "signout-form";
    private static final String NAVBAR_SELECT_CODACY2_ORG = "Codacy2";


    public NavBar(RemoteWebDriver driver, Environment env) {
        super(driver, env);
    }

    public void validateProjectNavBar() {

        getElementWhenVisible(By.id(NAVBAR_ICON)).isDisplayed();
        getElementWhenVisible(By.id(NAVBAR_DROPDOWN_ORGANIZATION)).isDisplayed();
        getElementWhenVisible(By.id(NAVBAR_DROPDOWN_ORGANIZATION)).click();
        getElementWhenVisible(By.id(NAVBAR_DROPDOWN_MENU)).isDisplayed();
        getElementWhenVisible(By.id(NAVBAR_ORGANIZATION)).isDisplayed();
        getElementWhenVisible(By.id(NAVBAR_DROPDOWN_ORGANIZATION)).click();
        getElementWhenVisible(By.id(NAVBAR_DOCS)).isDisplayed();
        getElementWhenVisible(By.id(NAVBAR_ACCOOUNT)).isDisplayed();

    }

    public void selectQAtestOrganization() {
        getElementWhenVisible(By.id(NAVBAR_DROPDOWN_ORGANIZATION)).isDisplayed();
        getElementWhenVisible(By.id(NAVBAR_DROPDOWN_ORGANIZATION)).click();
        getElementWhenVisible(By.id(NAVBAR_DROPDOWN_MENU)).isDisplayed();
        getElementWhenVisible(By.id(NAVBAR_SELECT_QA_ORGANIZATION)).click();
    }
    
    public void selectCodacy2Organization () {
        getElementWhenVisible(By.id(NAVBAR_DROPDOWN_ORGANIZATION)).isDisplayed();
        getElementWhenVisible(By.id(NAVBAR_DROPDOWN_ORGANIZATION)).click();
        getElementWhenVisible(By.id(NAVBAR_DROPDOWN_MENU)).isDisplayed();
        getElementWhenVisible(By.id(NAVBAR_SELECT_CODACY2_ORG)).click();
        
    }

    public void validateAccountMenu () {

        getElementWhenVisible(By.id(NAVBAR_ACCOOUNT)).click();
        getElementWhenVisible(By.id(MENU_YOUR_ACCOUNT)).isDisplayed();
        getElementWhenVisible(By.id(MENU_ORGANIZATIONS)).isDisplayed();
        getElementWhenVisible(By.id(MENU_FEEDBACK)).isDisplayed();
        getElementWhenVisible(By.id(MENU_STATUS)).isDisplayed();
        getElementWhenVisible(By.id(MENU_BLOG)).isDisplayed();
        getElementWhenVisible(By.id(MENU_TERMS_OF_SERVICE)).isDisplayed();
        getElementWhenVisible(By.id(MENU_SIGN_OUT)).isDisplayed();
        getElementWhenVisible(By.id(NAVBAR_ACCOOUNT)).click();
    }


}
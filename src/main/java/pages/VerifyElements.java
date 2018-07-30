package pages;

import org.codacy.BasePage;
import org.codacy.BaseTest;
import org.codacy.Environment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.asserts.SoftAssert;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class VerifyElements extends BasePage {


    public VerifyElements(RemoteWebDriver driver, Environment env) {
        super(driver, env);
    }

    public void main(String urlLink) {
        SoftAssert assertion = new SoftAssert();

        try {
            //Use URL Class - Create object of the URL Class and pass the urlLink as parameter
            URL link = new URL(urlLink);
            // Create a connection using URL object (i.e., link)
            HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
            //Set the timeout for 2 seconds
            httpConn.setConnectTimeout(2000);
            //connect using connect method
            httpConn.connect();
            //use getResponseCode() to get the response code.
            if (httpConn.getResponseCode() == 200) {
                System.out.println(urlLink + " - " + httpConn.getResponseMessage());

            }
            if (httpConn.getResponseCode() == 404) {
                System.out.println(urlLink + " - " + httpConn.getResponseMessage());
               // Assert.fail();
                assertion.assertTrue(false);
            }

        }
        //getResponseCode method returns = IOException - if an error occurred connecting to the server.
        catch (Exception e) {
            //e.printStackTrace();
        }
       // assertion.assertAll();
    }

    public void verifyImg()
    {
        List<WebElement> img = driver.findElements(By.tagName("img"));
        //To print the total number of links
        System.out.println("Total imgs are " + img.size());
        //used for loop to
        for (int i = 0; i < img.size(); i++) {
            WebElement element = img.get(i);
            //By using "href" attribute, we could get the url of the requried link
            String url = element.getAttribute("src");
            //calling verifyLink() method here. Passing the parameter as url which we collected in the above link
            //See the detailed functionality of the verifyLink(url) method below
            main(url);
        }

    }

    public void verifyLink()
    {
        List<WebElement> links = driver.findElements(By.tagName("a"));
        //To print the total number of links
        System.out.println("Total links are " + links.size());
        //used for loop to
        for (int i = 0; i < links.size(); i++) {
            WebElement element = links.get(i);
            //By using "href" attribute, we could get the url of the requried link
            String url = element.getAttribute("href");
            //calling verifyLink() method here. Passing the parameter as url which we collected in the above link
            //See the detailed functionality of the verifyLink(url) method below
            main(url);
        }
    }

    public void testsoft(){

        SoftAssert assertion = new SoftAssert();
        assertion.assertAll();
        }
}



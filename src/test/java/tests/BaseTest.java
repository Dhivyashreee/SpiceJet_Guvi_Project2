package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import pages.*;
import utils.QaProps;
import utils.WebDriverManager;

import java.time.Duration;

import static utils.UrlConstants.HOMEPAGE_URL;

public class BaseTest {
    ChromeDriver driver;

    ChromeOptions options;
    HomePage homePage;
    SignUpPage signUpPage;
    LoginPage loginPage;

    OneWayPage oneWayPage;
    FlightStatusPage flightStatusPage;

    String url;

    WebDriverManager webDriverManager;

    @BeforeMethod
    public void setUp(){
        //WebDriverManager.chromedriver().setup();
        //webDriverManager = new WebDriverManager(context, browser);
        //driver = (ChromeDriver) context.getAttribute("webDriver");

        options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);

        homePage = new HomePage(driver);
        signUpPage = new SignUpPage(driver);
        loginPage = new LoginPage(driver);
        oneWayPage = new OneWayPage(driver);
        flightStatusPage = new FlightStatusPage(driver);

        driver.get(HOMEPAGE_URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    //@AfterMethod

    //public void tearDown(){driver.quit();}


}



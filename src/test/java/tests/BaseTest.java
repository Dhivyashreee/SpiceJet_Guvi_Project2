package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import pages.LoginPage;
import pages.SignUpPage;
import utils.QaProps;

public class BaseTest {
    ChromeDriver driver;

    ChromeOptions options;
    HomePage homePage;
    SignUpPage signUpPage;
    LoginPage loginPage;

    String url;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver = new ChromeDriver();

        homePage = new HomePage(driver);
        signUpPage = new SignUpPage(driver);
        loginPage = new LoginPage(driver);

        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
    }

    //@AfterMethod

    //public void tearDown(){driver.quit();}


}



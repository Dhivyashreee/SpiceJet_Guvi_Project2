package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static utils.UrlConstants.HOMEPAGE_URL;

public class SpiceJetLoginPage extends BaseTest{

    @Test

    public void LoginPageTest() {

        Actions actions = new Actions(driver);
        actions.moveToElement(loginPage.login).click().build().perform();

        loginPage.loginPhoneNumber.sendKeys("9940010724");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='css-1cwyjr8 r-homxoj r-13awgt0 r-ubezar r-tmtnm0 r-oxtfae r-10paoce r-ymttw5 r-9qu9m4'][type='password']")));

        loginPage.loginPassWord.sendKeys("107Pbce*");

        Actions loginAction = new Actions(driver);
        loginAction.moveToElement(loginPage.loginbutton).click().build().perform();


    }

}

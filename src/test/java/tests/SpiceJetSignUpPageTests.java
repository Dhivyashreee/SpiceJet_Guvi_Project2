package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static utils.UrlConstants.HOMEPAGE_URL;
import static utils.UrlConstants.SIGNUPPAGE_URL;

public class SpiceJetSignUpPageTests extends BaseTest{




@Test

    public void homePageTest(){

    driver.get(HOMEPAGE_URL);
    String currentUrl = driver.getCurrentUrl();
    System.out.println(currentUrl);
    Assert.assertEquals(currentUrl,"https://www.spicejet.com/");

}

@Test
    public void SignUpPageTest() {
    driver.get(HOMEPAGE_URL);
    signUpPage.signUp.click();
    String signUpTittle = driver.getTitle();
    System.out.println(signUpTittle);
    Assert.assertEquals(signUpTittle,"SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets");

}

@Test

    public void SignUpPageFilling() throws InterruptedException {
    driver.get(SIGNUPPAGE_URL);

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[class='form-control form-select ']")));

    Select titleSelect = new Select(signUpPage.titleDropDown);
    titleSelect.selectByVisibleText("Mrs");

    signUpPage.firstName.sendKeys("Divya");
    signUpPage.lastName.sendKeys("Vijayakumar");


    Select  countrySelect = new Select(signUpPage.countryDropDown);
    countrySelect.selectByVisibleText("India ");

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    signUpPage.birthDate.click();

    Select yearSelect = new Select(signUpPage.yearDropDown);
    yearSelect.selectByVisibleText("1991");

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    Select monthSelect = new Select(signUpPage.monthDropDown);
    monthSelect.selectByVisibleText("July");

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    signUpPage.date.click();

    JavascriptExecutor js =(JavascriptExecutor)driver;
    js.executeScript("arguments[0].scrollIntoView(true);",signUpPage.phoneNumber);

    signUpPage.phoneNumber.sendKeys("9940010724");

    Thread.sleep(2000);

    signUpPage.emailId.sendKeys("dhivyashree10.91@gmail.com");

    signUpPage.newPassword.sendKeys("Divi91*31");
    signUpPage.confirmPassword.sendKeys("Divi91*31");

    JavascriptExecutor jsc =(JavascriptExecutor)driver;
    jsc.executeScript("arguments[0].click();",signUpPage.declareCheckBox);

    Actions actions = new Actions(driver);
    actions.moveToElement(signUpPage.submit).click().build().perform();

}

    @Test

    public void SignUpPageNegativeTest(){
        driver.get(SIGNUPPAGE_URL);

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[class='form-control form-select ']")));

    Select titleSelect = new Select(signUpPage.titleDropDown);
    titleSelect.selectByVisibleText("Mrs");

    signUpPage.firstName.sendKeys("Divya");
    signUpPage.lastName.sendKeys("Vijayakumar");


    Select  countrySelect = new Select(signUpPage.countryDropDown);
    countrySelect.selectByVisibleText("India ");

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    signUpPage.birthDate.click();

    Select yearSelect = new Select(signUpPage.yearDropDown);
    yearSelect.selectByVisibleText("1991");

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    Select monthSelect = new Select(signUpPage.monthDropDown);
    monthSelect.selectByVisibleText("July");

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    signUpPage.date.click();

    JavascriptExecutor js =(JavascriptExecutor)driver;
    js.executeScript("arguments[0].scrollIntoView(true);",signUpPage.phoneNumber);

    signUpPage.phoneNumber.sendKeys("9940010724");

    JavascriptExecutor jsc =(JavascriptExecutor)driver;
    jsc.executeScript("arguments[0].click();",signUpPage.declareCheckBox);

    Actions actions = new Actions(driver);
    actions.moveToElement(signUpPage.submit).click().build().perform();

    WebElement errorAlert = driver.findElement(By.cssSelector("div[class='font-13 mt-10 inlineErrors']"));
        String errorMessage = errorAlert.getText();
        System.out.println(errorMessage);
        Assert.assertEquals(errorMessage,"Please fill all mandatory fields marked with an '*' to proceed");
    }


}

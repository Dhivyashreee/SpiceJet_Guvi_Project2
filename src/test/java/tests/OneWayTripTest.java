package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class OneWayTripTest extends BaseTest {

    @Test(dataProvider = "TestData")

    public void FlightSearchTest(String fromPlace, String toPlace) throws Exception {

        oneWayPage.fromTextBox.click();

        Thread.sleep(2000);

        oneWayPage.fromTextBox.clear();

        oneWayPage.fromTextBox.sendKeys(fromPlace);

        Thread.sleep(2000);

        oneWayPage.toTextBox.click();

       // oneWayPage.toTextBox.clear();

        Thread.sleep(2000);

        oneWayPage.toTextBox.sendKeys(toPlace);

        Thread.sleep(3000);

        oneWayPage.departureDate.click();

        Thread.sleep(3000);

        oneWayPage.day.click();

        Thread.sleep(3000);

        Actions actions = new Actions(driver);
        actions.click(oneWayPage.searchButton).perform();


    }

    @DataProvider(name = "TestData")
    public Object[][] FromTOPlaceTestData() {
        return new Object[][]{
                {"Mumbai", "Delhi"}
        };
    }
}







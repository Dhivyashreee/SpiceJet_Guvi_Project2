package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OneWayTest extends BaseTest{

    @Test

    public void FlightSearchTest() throws Exception {

        oneWayPage.fromTextBox.click();

        Thread.sleep(2000);

        //oneWayPage.fromTextBox.clear();

        oneWayPage.fromTextBox.sendKeys("Mumbai");

        Thread.sleep(2000);

        oneWayPage.toTextBox.click();

        Thread.sleep(2000);

        //oneWayPage.toTextBox.clear();
        oneWayPage.toTextBox.sendKeys("Delhi");

        Thread.sleep(3000);

        oneWayPage.departureDate.click();

        Thread.sleep(3000);

        oneWayPage.day.click();

        Thread.sleep(3000);

        Actions actions = new Actions(driver);
        actions.click(oneWayPage.searchButton).perform();


    }


}

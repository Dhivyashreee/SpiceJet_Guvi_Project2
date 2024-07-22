package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class FlightTest extends BaseTest{

    @Test

    public void FlightStatusTest(){

        Actions actions = new Actions(driver);
        actions.moveToElement(flightStatusPage.flightStatus).click().perform();

        oneWayPage.fromTextBox.sendKeys("Maa");

        oneWayPage.toTextBox.sendKeys("DEL");

        WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Search Flights']")));

        Actions actions2 = new Actions(driver);
        actions2.moveToElement(flightStatusPage.searchFlight1).click().perform();


    }

    @Test

    public void CheckInTest(){

        Actions checkInAct = new Actions(driver);
        checkInAct.moveToElement(flightStatusPage.checkIn).click().perform();

    }

    @Test

    public void ManageBooking(){

        Actions bookingAction = new Actions(driver);
        bookingAction.moveToElement(flightStatusPage.manageBooking).click().perform();

    }


}

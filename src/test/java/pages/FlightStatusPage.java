package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightStatusPage {
    ChromeDriver driver;
    public FlightStatusPage(ChromeDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }


    @FindBy(xpath = "//div[@class ='css-76zvg2 r-jwli3a r-ubezar r-1ozqkpa']")
    public WebElement flightStatus;

    @FindBy(xpath = "//div[text()='Search Flights']")
    public WebElement searchFlight1;

    @FindBy(xpath = "//div[text()='check-in']")
    public WebElement checkIn;

    @FindBy(xpath = "//div[text()='manage booking']")
    public WebElement manageBooking;





}

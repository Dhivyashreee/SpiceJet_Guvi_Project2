package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OneWayPage {

    ChromeDriver driver;
    public OneWayPage(ChromeDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath= "(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
    public WebElement fromTextBox;

    @FindBy(xpath = "(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
    public WebElement toTextBox;

    @FindBy(xpath = "//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")
    public WebElement departureDate;


    @FindBy(xpath = "(//div[text()='28'])[2]")
    public WebElement day;

    @FindBy(xpath = "//div[text()='Search Flight']")
    public WebElement searchButton;

    @FindBy(xpath = "(//div[@class='css-1dbjc4n r-zso239'])[2]")
    public WebElement roundTripButton;

    @FindBy(xpath = "//div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73']")
    public WebElement continueButton;

    @FindBy(xpath = "(//input[@class ='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[4]")
    public WebElement cityTextBox;

    @FindBy(xpath = "(//input[@class='css-1cwyjr8 r-1yadl64 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[2]")
    public WebElement mobileNumber2;

    @FindBy(xpath = "//div[@class='css-76zvg2 r-jwli3a r-poiln3 r-adyw6z r-1kfrs79']")
    public WebElement continueButton2;



}

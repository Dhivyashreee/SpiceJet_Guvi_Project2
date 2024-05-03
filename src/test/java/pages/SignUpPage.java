package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
    ChromeDriver driver;

    public SignUpPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(linkText = "Signup")
    public WebElement signUp;

    @FindBy(css= "select[class='form-control form-select ']")
    public WebElement titleDropDown;

    @FindBy(id = "first_name")
    public WebElement firstName;

    @FindBy(id = "last_name")
    public WebElement lastName;

    @FindBy(css = "select[class='form-control form-select']")
    public WebElement countryDropDown;

    @FindBy(id = "dobDate")
    public WebElement birthDate;

    @FindBy(css = "select[class = 'react-datepicker__year-select']")
    public WebElement yearDropDown;

    @FindBy(css = "select[class = 'react-datepicker__month-select']")
    public WebElement monthDropDown;

    @FindBy(css = "div[class = 'react-datepicker__day react-datepicker__day--031']")
    public WebElement date;

    @FindBy(css = "input[class=' form-control']")
    public WebElement phoneNumber;

    @FindBy(css = "input[id='email_id'][class ='form-control ']")
    public WebElement emailId;

    @FindBy(id = "new-password")
    public WebElement newPassword;

    @FindBy(id = "c-password")
    public WebElement confirmPassword;

    @FindBy(css = "input[id='defaultCheck1']")
    public WebElement declareCheckBox;

    @FindBy(css = "button[class='btn btn-red']")
    public WebElement submit;



}

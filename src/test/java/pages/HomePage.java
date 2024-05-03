package pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
ChromeDriver driver;
public HomePage(ChromeDriver driver){
this.driver=driver;
    PageFactory.initElements(driver,this);

}


}

package tests;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.FileInputStream;

public class OneWayTripExcelTest extends BaseTest{

    @Test

    public void SearchTest() throws Exception{

        FileInputStream fis = new FileInputStream("C:\\Users\\admin\\IdeaProjects\\spicejet_project2\\src\\test\\resources\\SJ_TestData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int rowcount = sheet.getLastRowNum();
        for (int i = 1; i<=rowcount;i++){
            XSSFRow celldata = sheet.getRow(i);
                     String fromPlace = celldata.getCell(0).getStringCellValue();
            String toPlace = celldata.getCell(1).getStringCellValue();

            oneWayPage.fromTextBox.clear();

            oneWayPage.fromTextBox.sendKeys(fromPlace);

            Thread.sleep(2000);

            oneWayPage.toTextBox.clear();

            oneWayPage.toTextBox.sendKeys(toPlace);

            Thread.sleep(3000);

        }

        oneWayPage.departureDate.click();

        Thread.sleep(3000);

        oneWayPage.day.click();

        Thread.sleep(3000);

        Actions actions = new Actions(driver);
        actions.click(oneWayPage.searchButton).perform();



    }

}

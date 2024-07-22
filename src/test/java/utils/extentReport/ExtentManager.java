package utils.extentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    public static final ExtentReports extentReports = new ExtentReports();

    public static ExtentReports createExtentReports(){
        ExtentSparkReporter spark = new ExtentSparkReporter(
                System.getProperty("C:\\Users\\admin\\IdeaProjects\\spicejet_project2\\extent-reports\\extent-report.html"));
        spark.config().setReportName("SpiceJet Website Test Report");
        extentReports.attachReporter(spark);
        extentReports.setSystemInfo("Website","SpiceJet.com");
        extentReports.setSystemInfo("Organisation","Online Flight Ticket Booking");
        return extentReports;
    }

}

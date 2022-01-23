package TestSuites;

import baseClass.baseClassTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reports.ExtentManager;

public class AboutUSTest extends baseClassTest {

    ExtentTest test;
    ExtentReports reports;

    //set Extent report methods
    @BeforeMethod
    public void init() {
        //ExtentManager.getReports();
        reports = ExtentManager.getReports();
        ExtentReports reports = ExtentManager.getReports();
        test = reports.createTest("AboutUs_1Test");
    }

    @AfterMethod
    public void quit() {
        reports.flush(); //generates the reports
    }
}

  //Testing Test Cases
    @Test
    public void AboutUSNav throws InterruptedException{



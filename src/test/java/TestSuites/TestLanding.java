package TestSuites;

import baseClass.baseClassTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.LandingPage;
import pageObject.Sermon;
import reports.ExtentManager;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class TestLanding extends baseClassTest {

    //public WebDriver driver;

    ExtentTest test;
    ExtentReports reports;

    //set Extent report methods
    @BeforeMethod
    public void init() {
        //ExtentManager.getReports();
        reports = ExtentManager.getReports();
        ExtentReports reports = ExtentManager.getReports();
        test = reports.createTest("TestLanding");
    }


    @AfterMethod
    public void quit() {
        reports.flush(); //generates the reports
    }

    //TestCases
    @Test
    public void AboutUs() throws InterruptedException {
        //Actions action = new Actions(driver);
        //LandingPage landingPage = new LandingPage(driver);
        landingPage.getMenu();
        Thread.sleep(1000);
        //action.moveToElement(hp.getMenu()).build().perform();
        landingPage.getabout();
        Thread.sleep(5000);
       // driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        landingPage.getMenu();
        Thread.sleep(4000);
        landingPage.MPastor();
        Thread.sleep(1000);
        landingPage.getMenu();
        landingPage.NatGroup();
        Thread.sleep(1000);
        landingPage.getMenu();
        landingPage.deppRccg();
        Thread.sleep(1000);
        landingPage.getMenu();
        landingPage.tranRccg();
        Thread.sleep(500);
        // print success message
        System.out.println("PASSED: AboutUS opened");
        test.log(Status.PASS, "Test Passed");
        Thread.sleep(3000);
    }

    @Test
    public void Sermon() throws InterruptedException{
        Sermon sermon=new Sermon(driver);
        Sermon.messagesermon();
        System.out.println("PASSED: Menu Name Selected");
        Thread.sleep(3500);
    }


}
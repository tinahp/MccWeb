package baseClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import pageObject.AboutUS;
import pageObject.LandingPage;
import pageObject.NewConverts;
import pageObject.Sermon;
import reports.ExtentManager;

public class baseClassTest {
    public static WebDriver driver;

    public static WebDriver startdriver(String browser) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
            driver = new ChromeDriver();
        } else
            return driver;
        return null;
    }

    ExtentTest test;
    ExtentReports reports;
    ExtentManager extentManager = new ExtentManager();
    // Create a Landing page Object
    protected pageObject.LandingPage landingPage;
    // Create other  page Object
    protected NewConverts NewConverts;
    protected AboutUS AboutUS;
    protected Sermon Sermon;

    @BeforeTest
    public void setUp() {
        reports = ExtentManager.getReports();
        test = reports.createTest("BaseClassTest");
        // Set chromeBrowser
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        test.log(Status.INFO, "Opening Browser");
        // maximize window
        driver.manage().window().maximize();
        //Open the page URL
        driver.get("https://www.rccgmaranatha.com.ng/");
        test.log(Status.INFO, "Starting test case  with  one click on About US Icon");

        //Instantiate login page after launching the browser
        landingPage = new LandingPage(driver);
    }
}
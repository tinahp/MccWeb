package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;
import java.util.List;
import java.util.Timer;



public class LandingPage {
    //instantiate webdriver
    public WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    //locate  element on webpage
    private By ClickLogo = By.xpath("//img[@id='logo']");
    private By aboutMenu = By.cssSelector("#top-menu #menu-item-267");
    private By getAboutRCCG = By.cssSelector("#top-menu #menu-item-1898");
    private By meetPastor = By.cssSelector("#top-menu ul.sub-menu li[id='menu-item-1899'] a[href*='meet-our-pastors/']");
    private By naturalGroup = By.cssSelector("ul.sub-menu li#menu-item-1900 a[href*='/natural-group']");
    private By departmentRccg = By.xpath("(//a[normalize-space()='DEPARTMENTS IN RCCG MARANATHA'])[1]");
    private By trainingRccg = By.xpath("//nav//li//li[3]//a[1]");
    private By Sermon = By.cssSelector(".nav li#menu-item-1721 a");


    //select clicklogo
    public void getLogo() {driver.findElement(ClickLogo);}
    //Hover on the menu button
    public void getMenu() {driver.findElement(aboutMenu).click();}
    //select About RcCG
    public void getabout() {driver.findElement(getAboutRCCG).click();}
    //click on  meet Pastor
    public void MPastor() {driver.findElement(meetPastor).click();}
    //click on the natural group
    public void NatGroup () {
        List<WebElement> NatGroups = driver.findElements(By.cssSelector("ul.sub-menu li#menu-item-1900 a[href*='/natural-group']"));
        WebElement NatGroup = NatGroups.get(0);
        System.out.println(NatGroups.size());
        NatGroup.click();
    }
    //Click on deppRccg
    public void deppRccg () {driver.findElement(departmentRccg).click();}
    //Click on tranRccg
    public void tranRccg () {driver.findElement(trainingRccg);}

    public Sermon ClickSermon () {driver.findElement(Sermon).click();
            return new Sermon(driver);
        }

    }



